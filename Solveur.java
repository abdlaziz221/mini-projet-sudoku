// Résout la grille de Sudoku en utilisant l'algorithme de backtracking.
 
public class Solveur {
// Résout la grille par backtracking récursif.
     
    public boolean defar(Grille grille) {
        // Chercher la prochaine case vide
        int[] caseVide = trouverTiakh(grille);

        // Si pas de case vide, la grille est complète
        if (caseVide == null) {
            return true;
        }

        int ligne = caseVide[0];
        int col = caseVide[1];

        // Tester les chiffres de 1 à 9
        for (int val = 1; val <= 9; val++) {
            if (estPlacementBakhna(grille, ligne, col, val)) {
                grille.setValeur(ligne, col, val);

                // Appel récursif pour continuer à remplir la grille
                if (resoudre(grille)) {
                    return true;
                }

                // Backtrack : remettre à zéro
                grille.setValeur(ligne, col, 0);
            }
        }

        return false;
    }

    //Trouve la première case vide dans la grille.
     
    private int[] trouverTiakh(Grille grille) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grille.estVide(i, j)) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Vérifie si on peut placer val en (ligne, col) sans violer les règles du Sudoku.
     
    private boolean estPlacementBakhna(Grille grille, int ligne, int col, int val) {
        // Vérifier la ligne
        for (int j = 0; j < 9; j++) {
            if (grille.getValeur(ligne, j) == val) {
                return false;
            }
        }

        // Vérifier la colonne
        for (int i = 0; i < 9; i++) {
            if (grille.getValeur(i, col) == val) {
                return false;
            }
        }

        // Vérifier le bloc 3x3
        int debutLigne = (ligne / 3) * 3;
        int debutCol = (col / 3) * 3;
        for (int i = debutLigne; i < debutLigne + 3; i++) {
            for (int j = debutCol; j < debutCol + 3; j++) {
                if (grille.getValeur(i, j) == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
