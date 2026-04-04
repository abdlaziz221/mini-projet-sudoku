/**
 * Afficheur.java
 * Auteur : Alioune Badara Barry
 * Rôle : Affichage console de la grille de Sudoku
 */

public class Afficheur {
    /**
     * Affiche la grille complète avec les bordures
     * @param g la grille à afficher
     */
    public void afficherGrille(Grille g) {
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < 9; i++) {
            if (i > 0 && i % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                int val = g.getValeur(i, j);
                System.out.print((val == 0) ? ". " : val + " ");
                if (j == 8) {
                    System.out.println("|");
                }
            }
        }
        System.out.println("+-------+-------+-------+");
    }

    /**
     * Affiche un message simple (titre, erreur, succes).
     * @param msg le message
     */
    public void afficherMessage(String msg) {
        System.out.println("\n*** " + msg + " ***\n");
    }
}
