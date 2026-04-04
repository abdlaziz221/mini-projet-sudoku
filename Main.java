import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        // loader : pour charger la grille 
        // afficheur : pour afficher la grille
        // solveur : pour résoudre le sudoku
        Grilleloader loader = new Grilleloader();
        Afficheur afficheur = new Afficheur();
        Solveur solveur = new Solveur();

        // Variable qui va contenir la grille
        Grille grille = null;

        try {
            //  Vérifier si un fichier est passé en argument
            if (args.length > 0) {
                // Si oui → on charge la grille depuis le fichier
                System.out.println("Chargement de la grille depuis le fichier...");
                grille = loader.chargerDepuisFichier(args[0]);
            } else {
                // Sinon, saisie manuelle
                System.out.println("Aucun fichier fourni.");
                System.out.println("Veuillez entrer la grille manuellement :");

                Scanner scanner = new Scanner(System.in);

                // Tableau temporaire pour stocker les valeurs
                int[][] tab = new int[9][9];

                // Boucle pour remplir la grille ligne par ligne
                for (int i = 0; i < 9; i++) {
                    System.out.println("Ligne " + (i + 1) + " (9 chiffres séparés par espace) :");

                    for (int j = 0; j < 9; j++) {
                        // Lecture de chaque valeur
                        tab[i][j] = scanner.nextInt();
                    }
                }

                // Création de la grille avec les valeurs saisies
                grille = new Grille(tab);
            }

            // Affichage de la grille initiale
            System.out.println("\nGrille initiale :");
            afficheur.afficherGrille(grille);

            // Résolution du Sudoku
            boolean res = solveur.resoudre(grille);

            // Affichage du résultat
            if (res) {
                System.out.println("\nSolution trouvée :");
                afficheur.afficherGrille(grille);
            } else {
                System.out.println("\nAucune solution trouvée.");
            }

        } catch (Exception e) {
            // Gestion des erreurs 
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}