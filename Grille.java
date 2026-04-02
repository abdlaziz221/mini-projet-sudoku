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
     * Récupère la valeur d'une case
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @return valeur de la case (0-9)
     */
    public int getValeur(int ligne, int col) {
        return cases[ligne][col];
    }

    /**
     * Modifie la valeur d'une case
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @param val nouvelle valeur (0-9)
     */
    public void setValeur(int ligne, int col, int val) {
        cases[ligne][col] = val;
    }

    /**
     * Vérifie si une case est vide
     * @param ligne ligne (0-8)
     * @param col colonne (0-8)
     * @return true si vide (valeur 0)
     */
    public boolean estVide(int ligne, int col) {
        return cases[ligne][col] == 0;
    }

    /**
     * Retourne le tableau 2D complet
     * @return tableau des cases
     */
    public int[][] getCases() {
        return cases;
    }
}
