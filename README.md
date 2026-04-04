# Mini-Projet Sudoku

Programme en Java qui résout des grilles de Sudoku.

## Membres de l'équipe
- Serigne Abdoul Aziz Ndiaye
- Souleymane Sirima Mbodj
- Alioune Badara Barry
- Mohamed Moctar Niang

## Description
Ce projet implémente un solveur de Sudoku en Java. Il permet de :
- Charger une grille depuis un fichier texte
- Saisir manuellement une grille
- Afficher la grille de manière claire
- Résoudre la grille automatiquement en utilisant l'algorithme de backtracking
- Vérifier la validité de la grille selon les règles du Sudoku

## Structure du projet
- `Main.java` : Point d'entrée du programme
- `Grille.java` : Classe représentant la grille 9x9
- `Solveur.java` : Algorithme de résolution par backtracking
- `Afficheur.java` : Affichage console de la grille
- `Grilleloader.java` : Chargement de la grille depuis fichier ou saisie manuelle

## Compilation et exécution
1. Compiler les fichiers :
   ```
   javac -encoding UTF-8 *.java
   ```

2. Exécuter le programme :
   ```
   java Main
   ```

3. Suivre les instructions à l'écran pour choisir le mode de chargement de la grille.

## Format du fichier de grille
Le fichier doit contenir 9 lignes de 9 chiffres séparés par des espaces.
Les cases vides sont représentées par 0.

Exemple :
```
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
```

## Fonctionnalités
- Validation des grilles d'entrée
- Résolution automatique
- Affichage avant/après résolution
- Gestion d'erreurs pour fichiers invalides 
