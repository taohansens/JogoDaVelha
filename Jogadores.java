
package JogoDaVelha;

abstract class Jogadores {
    private boolean player;
    private String nome;
    protected String marcacao;
   
    Jogadores(String nome) {
        this.nome = nome;
        this.player = true;
    }

    public boolean isPlayer() {
        return player;
    }

    public void setPlayer(boolean player) {
        this.player = player;
    }

    public String getNome() {
        return nome;
    }
    
    public String getMarca() {
        return marcacao;
    }
    
  
 }

class Jogador1 extends Jogadores {

    public Jogador1(String nome) {
        super(nome);
        this.marcacao="X";
    }

}

class Jogador2 extends Jogadores {

    public Jogador2(String nome) {
        super(nome);
        this.marcacao="O"; 
    }

}
