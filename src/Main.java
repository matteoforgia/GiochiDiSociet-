import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Giocatori giocatore1 = new Giocatori();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto giocatore " + giocatore1.getNome() + "! Il tuo punteggio attuale è: " + giocatore1.getPartiteVinte());
    }
}
