# Mini-Projet Sudoku

# Rapport de Mini-Projet — Solveur de Sudoku

Membres du groupe :
- Serigne Abdoul Aziz Ndiaye — Modèle de données (Grille.java  et Main.java)
- Mohamed Moctar Niang — Chargement de grille (Grilleloader.java)
- Alioune Badara Barry — Affichage console (Afficheur.java)
- Souleymane Sirima Mbodj — Algorithme de résolution (Solveur.java)



**Module :** Programmation Orientée Objet — Java  
**Niveau :** Licence 3 — GLSIB  


## Table des matières

1. Présentation du projet
2. Architecture du projet
3. Description des classes
4. Algorithme de résolution
5. Compilation et exécution
6. Format du fichier d'entrée


## 1. Présentation du projet

Ce projet a pour objectif de concevoir et développer en Java une application console capable de **résoudre automatiquement une grille de Sudoku**.

Le Sudoku est un jeu de logique consistant à remplir une grille de 9×9 cases avec des chiffres de 1 à 9, de manière à ce que chaque ligne, chaque colonne et chaque bloc de 3×3 cases contienne exactement une fois chacun des chiffres de 1 à 9.

Le programme permet à l'utilisateur de :

- Charger une grille existante depuis un fichier texte
- Saisir manuellement une grille case par case
- Valider la grille saisie selon les règles du Sudoku
- Résoudre la grille automatiquement grâce à un algorithme de backtracking
- Afficher la grille initiale et la grille résolue de façon claire et lisible


## 2. Architecture du projet

Le projet est organisé selon le principe de **séparation des responsabilités**, chaque classe ayant un rôle précis et indépendant.

- Main.java — Point d'entrée, orchestration du programme
- Grille.java — Modèle : représentation de la grille 9×9
- Solveur.java — Logique : algorithme de résolution par backtracking
- Grilleloader.java — Entrée : chargement depuis fichier ou saisie manuelle
- Afficheur.java — Sortie : affichage formaté de la grille en console


## 3. Description des classes

### Grille.java

Représente la grille de Sudoku sous forme d'un tableau bidimensionnel de 9 lignes et 9 colonnes. Elle fournit des méthodes pour lire et modifier les cases, vérifier si une case est vide, valider la grille selon les règles du Sudoku, et copier une grille existante via un constructeur par copie.

### Solveur.java

Contient l'algorithme de résolution par backtracking récursif. La méthode principale defar() tente de remplir la grille en testant chaque valeur possible pour chaque case vide. Elle s'appuie sur une méthode de recherche de case vide et une méthode de vérification de validité du placement.

### Grilleloader.java

Gère le chargement de la grille depuis deux sources possibles : un fichier texte structuré ou une saisie manuelle ligne par ligne dans le terminal. Des validations sont effectuées à chaque étape pour s'assurer que les données sont correctes.

### Afficheur.java

Prend en charge l'affichage console de la grille avec des bordures Unicode pour une meilleure lisibilité, ainsi que l'affichage de messages informatifs (titre de section, erreur, succès).

### Main.java

Point d'entrée du programme. Il orchestre l'ensemble des classes dans cet ordre :

1. Demande à l'utilisateur de choisir le mode de chargement
2. Charge ou saisit la grille via Grilleloader
3. Affiche la grille initiale via Afficheur
4. Vérifie la validité de la grille
5. Lance la résolution via Solveur
6. Affiche la grille résolue ou un message d'échec


## 4. Algorithme de résolution

Le solveur utilise la technique du backtracking récursif (retour sur trace). C'est une méthode d'exploration exhaustive qui essaie toutes les combinaisons possibles en revenant en arrière dès qu'une impasse est détectée.

### Déroulement

1. Chercher la première case vide dans la grille
2. Si aucune case vide n'est trouvée, la grille est entièrement résolue
3. Pour cette case, tester les valeurs de 1 à 9 :
    - Si la valeur respecte les règles (ligne, colonne et bloc 3×3), la placer
    - Appeler récursivement la méthode pour continuer le remplissage
    - Si l'appel réussit, retourner vrai
    - Sinon, remettre la case à zéro (backtrack) et essayer la valeur suivante
4. Si aucune valeur ne fonctionne pour cette case, retourner faux

### Règles vérifiées à chaque placement

- Chaque ligne doit contenir les chiffres 1 à 9 sans répétition
- Chaque colonne doit contenir les chiffres 1 à 9 sans répétition
- Chaque bloc 3×3 doit contenir les chiffres 1 à 9 sans répétition


## 5. Compilation et exécution

### Prérequis

- Java JDK 8 ou version supérieure installé sur la machine
- Terminal configuré en encodage UTF-8 pour afficher correctement les bordures Unicode

### Étapes

Pour compiler tous les fichiers Java : javac *.java

Pour lancer le programme :  java Main


## 6. Format du fichier d'entrée

Le fichier texte fourni doit respecter les règles suivantes :

- Contenir exactement 9 lignes
- Chaque ligne contient exactement 9 chiffres séparés par des espaces
- Les cases vides sont représentées par le chiffre 0

