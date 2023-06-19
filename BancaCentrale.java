package Ereditarietà;

import java.util.ArrayList;
import java.util.Scanner;

public class BancaCentrale {
    private static ArrayList<String> Utenti;
    private static ArrayList<String> PassUtenti;

    // public BancaCentrale(ArrayList<String> Utenti, ArrayList<String> PassUtenti) {
    //     this.Utenti = Utenti;
    //     this.PassUtenti = PassUtenti;
    // }


    public float gettasso() {
        return 0f; // Implementazione di base, verrà sovrascritta dalle sottoclassi
    }

    //Scanner scannerInt = new Scanner(System.in);
    //Scanner scannerString = new Scanner(System.in);

    // public void registrazione(String nome, String password) {
    //     // System.out.println("Inserisci il tuo nome");
    //     // String nome = scannerString.nextLine();
    //     Utenti.add(nome);
    //     // System.out.println("Inserisci la password");
    //     // String password = scannerString.nextLine();
    //     PassUtenti.add(password);
    // }


    public static ArrayList<String> getUtenti() {
        return Utenti;
    }

    public static ArrayList<String> getPasswordUtenti() {
        return PassUtenti;
    }

    boolean controllo = false;

    public void login(String nome, String password, ArrayList<String> Utenti, ArrayList<String> PassUtenti) {
        for(int i = 0;i<Utenti.size();i++) {
            if (nome == Utenti.get(i) && password == PassUtenti.get(i)) {
                System.out.println("Accesso consentito");
                controllo = true;
                break;
            }
        }
        if (controllo == false) {
            System.out.println("Nessun Utente corrispondente");
        }
    }

}

// Sottoclasse per la banca SBI
class Banca extends BancaCentrale {

}




