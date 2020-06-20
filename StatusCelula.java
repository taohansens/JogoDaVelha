package JogoDaVelha;

public enum StatusCelula {
	XIS {
        @Override
        public String toString() {
        return "X";}},
                
	BOLA {
        @Override
        public String toString() {
        return "O";}},
        
	VAZIO {
        @Override
        public String toString() {
        return "-";}}
}
