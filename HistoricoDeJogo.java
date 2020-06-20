package JogoDaVelha;


import java.util.ArrayList;
import java.util.List;

public class HistoricoDeJogo {
    private List<String> historico = new ArrayList<>();

    protected void adicionaJogada(int x, int y){
    }

    @Override
    public String toString() {
        String jogada;
        for(int i=0; i <= historico.size(); i++) {
            if (i % 2 == 0) {
                jogada = "JOGADA " + i + 1 + ": X em " + historico.get(i);
            } else {
                jogada = "JOGADA " + i + 1 + ": O em " + historico.get(i);
            }
            return jogada;
        }
        return "FIM DE JOGO";
}
}