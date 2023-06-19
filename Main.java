package Ereditarietà;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> Utenti = new ArrayList<>();
        ArrayList<String> PassUtenti = new ArrayList<>();

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        BancaCentrale bank = new BancaCentrale();
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("Benvenuto!");
        int scelta = 0;
        do {

            // System.out.println("Inserisci il tuo nome: ");
            // String nome = scannerString.nextLine();
            // System.out.println("Inserisci la password: ");
            // String pass = scannerString.nextLine();

            // // Metti registrazione
            // bank.registrazione(nome, pass);

            // Utenti = bank.getUtenti();

            // PassUtenti = bank.getPasswordUtenti();

            // bank.login(nome, pass, Utenti, PassUtenti);

            System.out.println("1. Registrazione");
            System.out.println("2. Login");
            System.out.println("3. Tasso di Interesse");
            System.out.println("4. Esci");

            System.out.print("Seleziona un'opzione: ");

            scelta = scannerInt.nextInt(); // scelta del menù
            switch (scelta) {
                case 1:

                    // Registrazione

                    System.out.println("Inserisci il tuo nome: ");
                    String nome = scannerString.nextLine();
                    System.out.println("Inserisci la password: ");
                    String pass = scannerString.nextLine();

                    // Metti registrazione
                    //bank.registrazione(nome, pass);
                    Utenti.add(nome);
                    // Utenti = bank.getUtenti();
                    PassUtenti.add(pass);
                    // PassUtenti = bank.getPasswordUtenti();

                    // System.out.println("Puoi scegliere tra");
                    // System.out.println("1. SBI ");
                    // System.out.println("2. ICICI");
                    // System.out.println("3. AXIS");
                    // System.out.println("Quale? ");
                    // int banca = scannerInt.nextInt();
                    break;
                case 2:

                    // Login

                    System.out.println("Login");

                    System.out.println("Inserisci il tuo nome: ");
                    String nomeL = scannerString.nextLine();
                    System.out.println("Inserisci la password: ");
                    String passL = scannerString.nextLine();

                    bank.login(nomeL, passL, Utenti, PassUtenti);

                    break;

                case 3:

                    // Tasso di interesse

                    System.out.println("Quanto vuoi depositare?");
                    int fondi = scannerInt.nextInt();
                    System.out.println("In quale banca?");
                    System.out.println("1. SBI ");
                    System.out.println("2. ICICI");
                    System.out.println("3. AXIS");
                    int selbanca = scannerInt.nextInt();

                    if (selbanca == 1) {
                        float tsbi = fondi * sbi.gettasso();
                        System.out.println("Tasso di interese con SBI é " + tsbi );
                    } else if (selbanca == 2) {
                        float ticici = fondi * sbi.gettasso();
                        System.out.println("Tasso di interese con SBI é " + ticici );
                    } else if (selbanca == 3) {
                        float taxis = fondi * sbi.gettasso();
                        System.out.println("Tasso di interese con SBI é " + taxis );
                    } else {
                        System.out.println("Nessuna banca selezionata");
                    }
                    break;
                case 4:
                    System.out.println("Grazie e arrivederci");
                    break;
                default:
                    System.out.println("Non hai inserito una scelta giusta");
                    break;
            }
        } while (scelta != 6);
    }
}
