public class Giocatori {
        private String nome;
        private int partiteVinte;
    
        public Giocatori(String nome, int punteggio) {
            this.nome = nome;
            this.partiteVinte = punteggio;
        }

        public String getNome() {
            return nome;
        }

        public int getPunteggio() {
            return partiteVinte;
        }

        public void setPunteggio(int punteggio) {
            this.partiteVinte = punteggio;
        }
}
