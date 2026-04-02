/**
 * Classe Grille
 * Auteur : Personne 1
 * Description : Cette classe représente la grille de Sudoku 9x9.
 * Elle contient un tableau 2D qui stocke les valeurs des cases.
 * Les cases vides sont représentées par 0, et les chiffres de 1 à 9 pour les cases remplies.
 * Cette classe fournit des méthodes pour accéder et modifier les valeurs des cases.
 */

public class Grille {

    // Le tableau 2D qui contient les valeurs de la grille
    // C'est un tableau de 9 lignes et 9 colonnes
    // Chaque case peut contenir 0 (vide) ou un chiffre de 1 à 9
    private int[][] cases;

    /**
     * Constructeur de la classe Grille
     * Ce constructeur crée une nouvelle grille vide de 9x9.
     * Toutes les cases sont initialisées à 0, ce qui signifie qu'elles sont vides.
     * On utilise new int[9][9] pour créer le tableau.
     */
    public Grille() {
        cases = new int[9][9];
        // Les valeurs par défaut d'un tableau int sont 0, donc c'est bon
    }

    /**
     * Méthode pour récupérer la valeur d'une case
     * Cette méthode prend en paramètre la ligne et la colonne de la case
     * et retourne la valeur qui s'y trouve (0 si vide, ou 1-9 si remplie).
     * C'est utile pour lire le contenu de la grille sans la modifier.
     * @param ligne le numéro de la ligne (de 0 à 8)
     * @param col le numéro de la colonne (de 0 à 8)
     * @return la valeur de la case (0 à 9)
     */
    public int getValeur(int ligne, int col) {
        return cases[ligne][col];
    }

    /**
     * Méthode pour modifier la valeur d'une case
     * Cette méthode permet de changer la valeur d'une case spécifique.
     * On passe la ligne, la colonne et la nouvelle valeur (0 pour vider, 1-9 pour remplir).
     * C'est utilisé par le solveur pour essayer différentes valeurs.
     * @param ligne le numéro de la ligne (0 à 8)
     * @param col le numéro de la colonne (0 à 8)
     * @param val la nouvelle valeur à mettre (0 à 9)
     */
    public void setValeur(int ligne, int col, int val) {
        cases[ligne][col] = val;
    }

    /**
     * Méthode pour vérifier si une case est vide
     * Cette méthode retourne true si la case contient 0 (vide),
     * et false si elle contient un chiffre (1-9).
     * C'est utile pour savoir où placer de nouveaux chiffres.
     * @param ligne le numéro de la ligne (0 à 8)
     * @param col le numéro de la colonne (0 à 8)
     * @return true si la case est vide, false sinon
     */
    public boolean estVide(int ligne, int col) {
        return cases[ligne][col] == 0;
    }

    /**
     * Méthode pour obtenir le tableau complet de la grille
     * Cette méthode retourne le tableau 2D entier.
     * C'est pratique pour les autres classes qui ont besoin d'accéder à toute la grille.
     * Attention : cela donne accès direct au tableau, donc il faut faire attention.
     * @return le tableau 2D des cases
     */
    public int[][] getCases() {
        return cases;
    }
}
