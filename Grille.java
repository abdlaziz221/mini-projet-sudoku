/**
 * Classe Grille
 * Auteur : Serigne Abdoul Aziz Ndiaye
 * Représente la grille de Sudoku 9x9 avec un tableau 2D.
 */

public class Grille {

    // Tableau 2D 9x9 pour stocker les valeurs
    private int[][] cases;

    /**
     * Constructeur : crée une grille vide 9x9
     */
    public Grille() {
        cases = new int[9][9];
    }

    /**
     * Constructeur par copie : crée une copie de la grille donnée
     * @param autre la grille à copier
     */
    public Grille(Grille autre) {
        cases = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cases[i][j] = autre.cases[i][j];
            }
        }
    }

    /**
     * Récupère la valeur d'une case
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @return valeur de la case (0-9)
     */
    public int getValeur(int ligne, int col) {
        verifierIndices(ligne, col);
        return cases[ligne][col];
    }

    /**
     * Modifie la valeur d'une case
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @param val nouvelle valeur (0-9)
     * @throws IllegalArgumentException si la valeur est invalide
     */
    public void setValeur(int ligne, int col, int val) {
        verifierIndices(ligne, col);
        if (val < 0 || val > 9) {
            throw new IllegalArgumentException("Valeur invalide : " + val + ". Doit être entre 0 et 9.");
        }
        cases[ligne][col] = val;
    }

    /**
     * Vérifie si une case est vide
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @return true si vide (valeur 0)
     */
    public boolean estVide(int ligne, int col) {
        verifierIndices(ligne, col);
        return cases[ligne][col] == 0;
    }

    /**
     * Vérifie si la grille est complète (aucune case vide)
     * @return true si complète
     */
    public boolean estComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cases[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Vérifie si la grille est valide selon les règles du Sudoku
     * @return true si valide
     */
    public boolean estValide() {
        // Vérifier lignes, colonnes et blocs
        for (int i = 0; i < 9; i++) {
            if (!ligneValide(i) || !colonneValide(i) || !blocValide(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Vérifie si une ligne est valide
     */
    private boolean ligneValide(int ligne) {
        boolean[] present = new boolean[10]; // index 1-9
        for (int j = 0; j < 9; j++) {
            int val = cases[ligne][j];
            if (val != 0) {
                if (present[val]) return false;
                present[val] = true;
            }
        }
        return true;
    }

    /**
     * Vérifie si une colonne est valide
     */
    private boolean colonneValide(int col) {
        boolean[] present = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int val = cases[i][col];
            if (val != 0) {
                if (present[val]) return false;
                present[val] = true;
            }
        }
        return true;
    }

    /**
     * Vérifie si un bloc 3x3 est valide
     */
    private boolean blocValide(int blocIndex) {
        int startLigne = (blocIndex / 3) * 3;
        int startCol = (blocIndex % 3) * 3;
        boolean[] present = new boolean[10];
        for (int i = startLigne; i < startLigne + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                int val = cases[i][j];
                if (val != 0) {
                    if (present[val]) return false;
                    present[val] = true;
                }
            }
        }
        return true;
    }

    /**
     * Retourne le tableau 2D complet (copie pour éviter modification externe)
     * @return copie du tableau des cases
     */
    public int[][] getCases() {
        int[][] copie = new int[9][9];
        for (int i = 0; i < 9; i++) {
            System.arraycopy(cases[i], 0, copie[i], 0, 9);
        }
        return copie;
    }

    /**
     * Vérifie que les indices sont valides
     */
    private void verifierIndices(int ligne, int col) {
        if (ligne < 0 || ligne > 8 || col < 0 || col > 8) {
            throw new IndexOutOfBoundsException("Indices invalides : ligne=" + ligne + ", col=" + col);
        }
    }
}
