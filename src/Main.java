//Complétez le programme suivant pour que les erreurs susceptibles
//de se produire soient gérées jusqu’à ce qu’un calcul soit effectivement mené à bout.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    static int[] tableau = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

                int x, y;
            String message = "";
            while(true) {
                message = "Entrez l'indice de l'entier à diviser: ";
                x = readInteger(message, 0, tableau.length)-1;
                System.out.println("Entrez le diviseur");
                y = sc.nextInt();
                try {
                    System.out.println("Le résultat de la division est : " + Division(x, y));
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception occurs");
                } catch (InputMismatchException e) {
                    System.out.println("Division ar chiffre à virgule");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Hors limites du tableau." + e);
                } catch (Exception e) {
                    System.out.println("Parent Exception occurs");
                }
                System.out.println("Recommencer!");
            }
    }
        static int Division ( int indice, int diviseur)

        {return tableau[indice] / diviseur;}
    public static int readInteger(String message, int min, int max ) {
        Scanner sc = new Scanner (System.in);
        System.out.println(message);
        while(true) {
            try {
                int result =Integer.parseInt(sc.nextLine());
                if (result >= min && result <= max) {
                    return result;
                } else {
                    throw new IllegalStateException("La valeur doit être comprise entre "
                            + min + "et " + max + ": " + result);
                }
            } catch (RuntimeException e) {
                System.err.println("Une erreur est survenue: " + e);
                System.out.print(message);
            }
        }
    }
    }


    