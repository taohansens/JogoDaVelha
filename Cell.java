package JogoDaVelha;

import java.awt.*;

public class Cell {
	private Filler value;
	int linha, coluna;
	
	public Cell(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		reset();
	}
	
	public void reset() {
		value = Filler.VAZIO;
	}
	
	public Filler getValue()
	{
		return value;
	}
	
	public void setValue(Filler fill) {
		value = fill;
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
	      g2d.setStroke(new BasicStroke(Game.SYMBOL_STROKE_WIDTH,
	              BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
	        int x1 = coluna * Game.CELL_SIZE + Game.CELL_PADDING;
	        int y1 = linha * Game.CELL_SIZE + Game.CELL_PADDING;
	        if (value == Filler.CROSS) {
	           g2d.setColor(Color.BLACK);
	           int x2 = (coluna + 1) * Game.CELL_SIZE - Game.CELL_PADDING;
	           int y2 = (linha + 1) * Game.CELL_SIZE - Game.CELL_PADDING;
	           g2d.drawLine(x1, y1, x2, y2);
	           g2d.drawLine(x2, y1, x1, y2);
	        } else if (value == Filler.NOUGHT) {
	           g2d.setColor(Color.BLACK);
	           g2d.drawOval(x1, y1, Game.SYMBOL_SIZE, Game.SYMBOL_SIZE);
	        }
	}
	
}
