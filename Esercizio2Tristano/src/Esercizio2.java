import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome= sc.nextLine();
        System.out.println("Inserisci il tuo Cognome");
        String cognome= sc.nextLine();

        System.out.println(nome+" "+cognome+" sei molto intelligente");
    }
}
