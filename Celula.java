package JogoDaVelha;

public class Celula implements Mecanicas{
	private StatusCelula valor;
        private int pontos;
	private int linha,coluna;
	
	public Celula(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		reset();
	}
	
	public StatusCelula getValor() {
		return valor;
	}

	public int getLinha() {
		return this.linha;
	}
	public int getColuna() {
		return this.coluna;
	}  
	
	public void setValor(StatusCelula marcar) {
		valor = marcar;
	}
	public void reset() {
		valor = StatusCelula.VAZIO;
	}        

    @Override
    public boolean equals(Object obj) {
        final Celula other = (Celula) obj;
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }
}
