
package JogoDaVelha;

import java.util.ArrayList;

public class Historico implements Mecanicas {
     private ArrayList<String> historico = new ArrayList<String> ();
     
     public void addHistorico(String jogador, String posicao){
         historico.add(jogador+" em ["+posicao+"]");
    }
    
     
    public void exibeHistorico(){
    int jogada = 0;     
    for(int i = 0; i < historico.size(); i++) {
            jogada = i+1;
            System.out.println("Jogada "+jogada+": "+historico.get(i));
        }
     }
    
    public String mostraPositicao(int pos){
        return historico.get(pos);
    }
     
     public void reset(){
         historico.clear();
     }
         
}
