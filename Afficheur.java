/**
 * Afficheur.java
 * Auteur : Alioune Badara Barry
 * Rôle : Affichage console de la grille de Sudoku 
 */

public class Afficheur {
    // Affiche la grille complète avec les bordures
     
    public void afficherGrille(Grille g) {
        // Lignes horizontales : double pour les séparations entre blocs 3x3, simple à l'intérieur
        String ligneDouble = "╔═══════════╦═══════════╦═══════════╗";
        String ligneMilieuDouble = "╠═══════════╬═══════════╬═══════════╣";
        String ligneSimple = "╟───────────┼───────────┼───────────╢";
        String ligneBasDouble = "╚═══════════╩═══════════╩═══════════╝";

        // Parcours des 9 lignes
        for (int i = 0; i < 9; i++) {
            // Ligne de bordure supérieure ou séparateur
            if (i == 0) {
                System.out.println(ligneDouble);
            } else if (i % 3 == 0) {
                System.out.println(ligneMilieuDouble);
            } else {
                System.out.println(ligneSimple);
            }

            // Contenu de la ligne de chiffres
            System.out.print("║");
            for (int j = 0; j < 9; j++) {
                int val = g.getValeur(i, j);
                String aff = (val == 0) ? " " : Integer.toString(val);
                System.out.print(" " + aff + " ");
                if (j == 2 || j == 5) {
                    System.out.print("║");
                }
            }
            System.out.println("║");
        }
        // Dernière ligne de bordure
        System.out.println(ligneBasDouble);
    }

    /**
     * Affiche un message simple (titre, erreur, succès).
     * @param msg le message
     */
    public void afficherMessage(String msg) {
        System.out.println("\n*** " + msg + " ***\n");
    }

    // TEMPORAIRE : pour tester seul
    public static void main(String[] args) {
        // Créer une fausse grille (tu n'as pas besoin de GrilleLoader)
        Grille g = new Grille();
        // Remplir quelques cases à la main pour voir le rendu
        g.setValeur(0, 0, 5);
        g.setValeur(0, 1, 3);
        g.setValeur(0, 4, 7);
        // etc.

        Afficheur aff = new Afficheur();
        aff.afficherMessage("Test grille");
        aff.afficherGrille(g);
    }
}
