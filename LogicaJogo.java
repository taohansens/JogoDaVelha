package JogoDaVelha;

public class LogicaJogo {
	
	private Tabuleiro tabuleiro;
	private EstadoDoJogo estadoAtualDaPartida;
	private StatusCelula jogador;
	
	public LogicaJogo() {
		tabuleiro = new Tabuleiro();
	}
        
        public void reset(){
            tabuleiro.reset();
        }
        
	public void iniciar() {
		tabuleiro.reset();
		estadoAtualDaPartida = EstadoDoJogo.JOGANDO;
	}
        
   
        public StatusCelula getValorCelula(int linha, int coluna) {
		return tabuleiro.getCelulaNoTabuleiro(linha, coluna).getValor();
	}
	
	
	public EstadoDoJogo getEstadoDoJogo() {
		return this.estadoAtualDaPartida;
	}
        
        public void setCelulaNoTabuleiro(int linha, int coluna, StatusCelula valor) {
            tabuleiro.setCelulaNoTabuleiro(linha, coluna, valor);
	}
        
        public String verificaVencedor(){
            return tabuleiro.VertificaVencedor();
        }
  

}
