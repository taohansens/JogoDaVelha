package JogoDaVelha;

public class Tabuleiro implements Mecanicas {
	private Celula[][] tabuleiro;

	public Tabuleiro() {
		tabuleiro = new Celula[3][3];
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna] = new Celula(linha, coluna);
			}
		}
	}

	public Celula getCelulaNoTabuleiro(int linha, int coluna) {
		return tabuleiro[linha][coluna];
	}
        
        public void setCelulaNoTabuleiro(int linha, int coluna, StatusCelula valor) {
            this.tabuleiro[linha][coluna].setValor(valor);
        }

	/*
	 * Reset de cada celula.
	 */
	public void reset() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna].reset();
			}
		}
	}
        
        
        
       public String VertificaVencedor(){
       boolean l1,l2,l3,c1,c2,c3,d1,d2;
       l1=tabuleiro[0][0].equals(tabuleiro[0][1])&&tabuleiro[0][1].equals(tabuleiro[0][2]);
       l2=tabuleiro[1][0].equals(tabuleiro[1][1])&&tabuleiro[1][1].equals(tabuleiro[1][2]);
       l3=tabuleiro[2][0].equals(tabuleiro[2][1])&&tabuleiro[2][1].equals(tabuleiro[2][2]);
   
       c1=tabuleiro[0][0].equals(tabuleiro[1][0])&&tabuleiro[1][0].equals(tabuleiro[2][0]);
       c2=tabuleiro[0][1].equals(tabuleiro[1][1])&&tabuleiro[1][1].equals(tabuleiro[2][1]);
       c3=tabuleiro[0][2].equals(tabuleiro[1][2])&&tabuleiro[1][2].equals(tabuleiro[2][2]);
   
       d1=tabuleiro[0][0].equals(tabuleiro[1][1])&&tabuleiro[1][1].equals(tabuleiro[2][2]);
       d2=tabuleiro[0][2].equals(tabuleiro[1][1])&&tabuleiro[1][1].equals(tabuleiro[2][0]);
       
       
       if(l1)
           return tabuleiro[0][0].getValor().toString();
       if(l2)
           return tabuleiro[1][0].getValor().toString();
       if(l3)
           return tabuleiro[2][0].getValor().toString();
       if(c1)
           return tabuleiro[0][0].getValor().toString();
       if(c2)
           return tabuleiro[0][1].getValor().toString();
       if(c3)
           return tabuleiro[0][2].getValor().toString();
       if(d1)
           return tabuleiro[0][0].getValor().toString();
       if(d2)
           return tabuleiro[0][2].getValor().toString();
       else{
       return "";
       }
    }
}

