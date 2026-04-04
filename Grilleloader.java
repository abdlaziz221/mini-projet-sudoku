//faire charger la grille depuis un fichier texte ou via saisie manuelle.

import java.io.*; 
import java.util.Scanner;
 
public class Grilleloader {

    // Charge la grille depuis un fichier texte
    public Grille chargerDepuisFichier(String chemin) throws Exception {
        Grille grille = new Grille();

        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            for (int i = 0; i < 9; i++) {
                String ligne = br.readLine();
                if (ligne == null) throw new Exception("Erreur : Le fichier contient moins de 9 lignes.");

                String[] elements = ligne.trim().split("\\s+");
                if (elements.length != 9) throw new Exception("Erreur : La ligne " + (i + 1) + " ne contient pas 9 chiffres.");

                for (int j = 0; j < 9; j++) {
                    int val = Integer.parseInt(elements[j]);
                    if (val < 0 || val > 9) throw new Exception("Erreur : Valeur hors limite (0-9) à la ligne " + (i + 1));
                    grille.setValeur(i, j, val);
                }
            }
        } catch (FileNotFoundException e) {
            throw new Exception("Erreur : Fichier introuvable : " + chemin);
        } catch (NumberFormatException e) {
            throw new Exception("Erreur : Format de nombre invalide dans le fichier.");
        }

        return grille;
    }

    // Saisie manuelle de la grille via Scanner
    public Grille saisirManuellement() {
        Scanner scanner = new Scanner(System.in);
        Grille grille = new Grille();

        System.out.println("Veuillez saisir la grille (9 lignes de 9 chiffres, séparés par des espaces) :");

        for (int i = 0; i < 9; i++) {
            boolean ligneValide = false;
            while (!ligneValide) {
                System.out.print("Ligne " + (i + 1) + " : ");
                String[] elements = scanner.nextLine().trim().split("\\s+");

                if (elements.length == 9) {
                    try {
                        for (int j = 0; j < 9; j++) {
                            int val = Integer.parseInt(elements[j]);
                            if (val < 0 || val > 9) throw new NumberFormatException();
                            grille.setValeur(i, j, val);
                        }
                        ligneValide = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Erreur : Entrée invalide, chiffres entre 0 et 9 uniquement.");
                    }
                } else {
                    System.out.println("Erreur : Vous devez entrer exactement 9 chiffres.");
                }
            }
        }

        return grille;
    }
}

