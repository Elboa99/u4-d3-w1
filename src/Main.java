import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metti la base del Rettangolo: ");
        int base1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Metti l'altezza del Rettangolo: ");
        int altezza1 = Integer.parseInt(scanner.nextLine());

        Rettangolo ret1 = new Rettangolo(base1, altezza1);

        System.out.println("ISERISCI LA BASE DEL 2° RETTANGOLO: ");
        int base2 = Integer.parseInt(scanner.nextLine());
        System.out.println("ISERISCI L'ALTEZZA DEL 2° RETTANGOLO: ");
        int altezza2 = Integer.parseInt(scanner.nextLine());

        Rettangolo ret2 = new Rettangolo(base2, altezza2);

        System.out.println("----RESULTS-----");
        Rettangolo.stampaDueRettangoli(ret1, ret2);
    }
}
