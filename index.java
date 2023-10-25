import java.util.Scanner;

public class index {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Veuillez entrer le rayon du cercle : ");
        double rayon = scanner.nextDouble();
        
        System.out.print("Tapez 'P' pour le périmètre ou 'A' pour l'aire : ");
        char choix = scanner.next().charAt(0);
        
        double resultat = 0.0;
        switch (choix) {
            case 'P':
            case 'p':
                resultat = 2 * Math.PI * rayon;
                System.out.println("Le périmètre du cercle est : " + resultat);
                break;
            case 'A':
            case 'a':
                resultat = Math.PI * rayon * rayon;
                System.out.println("L'aire du cercle est : " + resultat);
                break;
            default:
                System.out.println("Veuillez entrer 'P' pour le périmètre ou 'A' pour l'aire.");
                break;
        }
    }

    }


/*
 * Ecrire un programme qui demande à l'u lisateur le rayon d'un cercle. Ensuite,
 * le programme demande à l'u lisateur de taper : "P" s'il souhaite obtenir le
 * périmètre "A" s'il souhaite obtenir l'aire En foncon du choix de l'u
 * lisateur, le programme calcule et affiche la valeur adéquate. Pour toute
 * autre le re tapée par l'u lisateur le programme affiche un message indiquant
 * les instrucons décrites ci-dessus. Contrainte imposée : u liser la structure
 * "switch"
 */