import java.util.Random;
import java.util.UUID;

public class Giocatori {
        private String nome;
        private int partiteVinte;
        private int punteggio;
        
        public Giocatori() {
            this.nome = UUID.randomUUID().toString().substring(0, 5);
            this.partiteVinte = 0;
            this.punteggio = rand.nextInt(10);
        }

        Random rand = new Random();

        public String getNome() {
            return nome;
        }
        
        public int getPartiteVinte() {
            return partiteVinte;
        }

        public void setPartiteVinte(int partiteVinte) {
            this.partiteVinte = partiteVinte;
        }

}
