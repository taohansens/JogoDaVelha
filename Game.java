package JogoDaVelha;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JPanel {

	/*
	 * Configuracoes do tabuleiro
	 */
	public static final int ROWS = 3;
	public static final int COLS = 3;

	// Constants for size using for graphics drawing
	public static final int CELL_SIZE = 200;
	public static final int CANVAS_WIDTH = 600;
	public static final int CANVAS_HEIGHT = 600;
	public static final int GRID_WIDTH = 8;
	public static final int HALF_GRID_WIDTH = GRID_WIDTH / 2;
	
	public static final int CELL_PADDING = CELL_SIZE / 6;
	public static final int SYMBOL_SIZE = CELL_SIZE - CELL_PADDING * 2;
	public static final int SYMBOL_STROKE_WIDTH = 8;
	
	private Tabuleiro board;
	private EstadoDoJogo currentState;
	private Filler player;
	private JLabel message;

	
	public Game() {
		board = new Tabuleiro();
		setupMessage();
		init();

		this.addMouseListener( new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int colClicked = e.getX() / CELL_SIZE;
				int rowClicked = e.getY() / CELL_SIZE;
				
				if (currentState == EstadoDoJogo.JOGANDO) {
					if ( board.getCell(rowClicked, colClicked).getValue() == Filler.VAZIO ) {
						board.getCell(rowClicked, colClicked).setValue(player);
						update(rowClicked, colClicked);
					}
				}

				else {
					init();
				}
				repaint();
			}
		});
	}
	
	public void setupMessage() {
		message = new JLabel("   ");
		message.setFont(new Font(Font.DIALOG_INPUT, Font.BOLD, 12));
		message.setBorder(BorderFactory.createEmptyBorder(8, 5, 4, 5));
		message.setOpaque(true);
		message.setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout());
		add(message, BorderLayout.PAGE_END);
	}
	
	public void init() {
		board.reset();
		currentState = EstadoDoJogo.JOGANDO;
		player =  Filler.CROSS;
		message.setText("It is " + player + "'s turn.");
	}
	
	public void update(int row, int col) {
		if (board.isWon(player, row, col)) {
			currentState = player == Filler.CROSS ? EstadoDoJogo.CROSS_WON : EstadoDoJogo.NOUGHT_WON;
			message.setText( player + " venceu!" );
		}
		else if (board.isFull()) {
			currentState = EstadoDoJogo.EMPATE;
			message.setText("Empate!");
		}
		else {
			player = player == Filler.CROSS ? Filler.NOUGHT : Filler.CROSS;
			message.setText("Its a jogador.");
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.WHITE);
		board.paint(g);
	}
}
