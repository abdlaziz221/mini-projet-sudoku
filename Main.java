/**
 * Classe Main
 * Point d'entrée du programme Sudoku.
 */

import java.util.Scanner;

public class Main {

    /**
     * Méthode principale
     * @param args arguments ligne de commande
     */
    public static void main(String[] args) {
        // Titre du programme
        System.out.println("========================================");
        System.out.println("      SOLVEUR DE SUDOKU - L3 GLSI");
        System.out.println("========================================");

        Scanner scanner = new Scanner(System.in);
        Grille grille = null;
        Grilleloader loader = new Grilleloader();
        Afficheur afficheur = new Afficheur();

        // Choix du mode de chargement
        System.out.println("Choisissez le mode de chargement de la grille :");
        System.out.println("1. Charger depuis un fichier");
        System.out.println("2. Saisie manuelle");
        System.out.print("Votre choix (1 ou 2) : ");

        int choix = scanner.nextInt();
        scanner.nextLine(); // Consommer la ligne

        try {
            if (choix == 1) {
                System.out.print("Entrez le chemin du fichier : ");
                String chemin = scanner.nextLine();
                grille = loader.chargerDepuisFichier(chemin);
                afficheur.afficherMessage("Grille chargée depuis le fichier");
            } else if (choix == 2) {
                grille = loader.saisirManuellement();
                afficheur.afficherMessage("Grille saisie manuellement");
            } else {
                System.out.println("Choix invalide.");
                return;
            }

            // Afficher la grille initiale
            afficheur.afficherMessage("Grille initiale");
            afficheur.afficherGrille(grille);

            // Vérifier si la grille initiale est valide
            if (!grille.estValide()) {
                afficheur.afficherMessage("Erreur : La grille initiale n'est pas valide !");
                return;
            }

            // Résoudre la grille
            Solveur solveur = new Solveur();
            Grille grilleResolue = new Grille(grille); // Copie pour ne pas modifier l'originale

            if (solveur.resoudre(grilleResolue)) {
                afficheur.afficherMessage("Grille résolue avec succès !");
                afficheur.afficherGrille(grilleResolue);
            } else {
                afficheur.afficherMessage("Impossible de résoudre cette grille");
            }

        } catch (Exception e) {
            afficheur.afficherMessage("Erreur : " + e.getMessage());
        }

        scanner.close();
    }
}
