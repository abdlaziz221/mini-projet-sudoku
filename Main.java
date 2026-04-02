/**
 * Classe Main
 * Auteur : Personne 1
 * Description : Cette classe contient le point d'entrée du programme (méthode main).
 * C'est elle qui orchestre l'exécution complète du solveur de Sudoku.
 * Pour l'instant, elle ne fait que démontrer l'utilisation de la classe Grille.
 * Les autres classes (GrilleLoader, Afficheur, Solveur) seront ajoutées par les autres membres.
 */

public class Main {

    /**
     * Méthode principale du programme
     * Cette méthode est appelée automatiquement quand on lance le programme.
     * Elle démontre l'utilisation de la classe Grille créée par la Personne 1.
     * @param args les arguments passés en ligne de commande (non utilisés pour l'instant)
     */
    public static void main(String[] args) {
        // Affichage du titre du programme
        System.out.println("========================================");
        System.out.println("      SOLVEUR DE SUDOKU - L3 GLSI");
        System.out.println("      Partie Personne 1");
        System.out.println("========================================\n");

        // Création d'une grille vide
        Grille grille = new Grille();

        // Message explicatif
        System.out.println("Partie de la Personne 1 :");
        System.out.println("- Grille.java : classe pour gérer la grille 9x9");
        System.out.println("- Main.java : point d'entrée du programme");
        System.out.println();

        // Exemple d'utilisation de la classe Grille
        System.out.println("Exemple d'utilisation de la classe Grille :");

        // Placer quelques valeurs dans la grille
        grille.setValeur(0, 0, 5); // Case (0,0) = 5
        grille.setValeur(0, 1, 3); // Case (0,1) = 3
        grille.setValeur(1, 0, 6); // Case (1,0) = 6

        // Afficher les valeurs
        System.out.println("Valeur en (0,0) : " + grille.getValeur(0, 0));
        System.out.println("Valeur en (0,1) : " + grille.getValeur(0, 1));
        System.out.println("Valeur en (1,0) : " + grille.getValeur(1, 0));
        System.out.println("Case (0,2) est vide : " + grille.estVide(0, 2));

        // Affichage final
        System.out.println("\n========================================\n");
        System.out.println("Les autres classes (GrilleLoader, Afficheur, Solveur)");
        System.out.println("seront ajoutées par les autres membres du groupe.");
        System.out.println("========================================\n");
    }
}
