import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String adjectiu1;
        String nom1;
        String adjectiu2;
        String verb1;
        String adjectiu3;

        System.out.print("Introdueix un adjectiu: ");
        adjectiu1=scanner.nextLine();
        System.out.print("Introdueix un nom: ");
        nom1=scanner.nextLine();
        System.out.print("Introdueix un adjectiu: ");
        adjectiu2=scanner.nextLine();
        System.out.print("Introdueix un verb: ");
        verb1=scanner.nextLine();
        System.out.print("Introdueix un adjectiu: ");
        adjectiu3=scanner.nextLine();

        System.out.println();
        System.out.println("Avui fa un dia " + adjectiu1 +".");
        System.out.println("He trobat a en " + nom1 + " passejant pel carrer.");
        System.out.println("En "+nom1+" duia un abric "+ adjectiu2 + " i " + verb1+ "!");
        System.out.println("M'ha semblat "+adjectiu3+"!");

        scanner.close();

    }
}
