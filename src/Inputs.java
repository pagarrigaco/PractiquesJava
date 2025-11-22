import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      /* System.out.print("Introdueix el teu nom: ");
        String nom = scanner.nextLine();
        // String nom = scanner.nextLine(); NO LLEGEIX ELS ESPAIS
        System.out.print("introdueix la teva edat: ");
        int edat = scanner.nextInt();
        scanner.nextLine(); // per eliminar el enter

        System.out.println("Hola "+ nom + ", tens "+edat+" anys.");

        */

        // EXERCICI - CALCULAR L'AREA D'UN RECTANGLE
        double alcada = 0;
        double amplada = 0;
        double area = 0;

        System.out.print("Introdueix l'alçada del rectangle: ");
        alcada = scanner.nextDouble();

        System.out.print("Introdueix l'amplada del rectangle: ");
        amplada = scanner.nextDouble();

        area = alcada*amplada;
        System.out.println("L'àrea del rectangle és: "+area+ " cm²" );//Alt+0178



        scanner.close(); //sempre cal tancar
    }
}
