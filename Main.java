/**
 * Classe Main
 * Point d'entrée du programme Sudoku.
 */

public class Main {

    /**
     * Méthode principale
     * Démontre l'utilisation de la classe Grille
     * @param args arguments ligne de commande 
     */
    public static void main(String[] args) {
        // Titre du programme
        System.out.println("========================================");
        System.out.println("      SOLVEUR DE SUDOKU - L3 GLSI");
        System.out.println("      Partie Personne 1");
        System.out.println("========================================\n");

        // Création grille vide
        Grille grille = new Grille();

        // Informations
        System.out.println("Partie de la Personne 1 :");
        System.out.println("- Grille.java : classe pour gérer la grille 9x9");
        System.out.println("- Main.java : point d'entrée du programme");
        System.out.println();

        // Exemple d'utilisation
        System.out.println("Exemple d'utilisation de la classe Grille :");

        // Placer des valeurs
        grille.setValeur(0, 0, 5); // (0,0) = 5
        grille.setValeur(0, 1, 3); // (0,1) = 3
        grille.setValeur(1, 0, 6); // (1,0) = 6

        // Afficher les valeurs
        System.out.println("Valeur en (0,0) : " + grille.getValeur(0, 0));
        System.out.println("Valeur en (0,1) : " + grille.getValeur(0, 1));
        System.out.println("Valeur en (1,0) : " + grille.getValeur(1, 0));
        System.out.println("Case (0,2) est vide : " + grille.estVide(0, 2));

        // Fin
        System.out.println("\n========================================\n");
        System.out.println("Les autres classes (GrilleLoader, Afficheur, Solveur)");
        System.out.println("seront ajoutées par les autres membres du groupe.");
        System.out.println("========================================\n");
    }
}
