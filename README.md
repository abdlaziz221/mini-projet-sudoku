# Mini-Projet — Solveur de Sudoku

Membres du groupe :

- Souleymane Sirima Mbodj — Solveur.java
- Serigne Abdoul Aziz Ndiaye — Grille.java
- Mohamed Moctar Niang — Grilleloader.java
- Alioune Badara Barry — Afficheur.java

Module : Programmation Orientée Objet — Java  
Niveau : Licence 3 GLSIB  


## 1. Présentation

Ce projet consiste à développer en Java un programme qui résout des grilles de Sudoku automatiquement. L'utilisateur peut charger une grille depuis un fichier ou la saisir manuellement. Le programme vérifie ensuite si la grille est valide, la résout et affiche le résultat.


## 2. Organisation du projet

On a divisé le travail en plusieurs classes, chacune avec un rôle précis :

- Main.java : lance le programme et relie toutes les classes entre elles
- Grille.java : représente la grille 9x9 et gère les cases
- Solveur.java : contient l'algorithme qui résout la grille
- Grilleloader.java : charge la grille depuis un fichier ou via le clavier
- Afficheur.java : affiche la grille dans le terminal


## 3. Les classes en détail

### Grille.java

C'est la classe centrale du projet. Elle stocke les valeurs de la grille dans un tableau de 9 lignes et 9 colonnes. Elle permet de lire ou modifier une case, de vérifier si une case est vide, et de contrôler si la grille respecte les règles du Sudoku. On a aussi prévu un constructeur par copie pour ne pas modifier la grille originale lors de la résolution.

### Solveur.java

C'est ici que se passe la résolution. On utilise un algorithme de backtracking : on cherche une case vide, on essaie les chiffres de 1 à 9, et si un chiffre ne convient pas on revient en arrière pour en essayer un autre. La méthode principale s'appelle defar().

### Grilleloader.java

Cette classe gère deux modes de chargement. Le premier lit un fichier texte ligne par ligne. Le second demande à l'utilisateur de taper chaque ligne dans le terminal. Dans les deux cas, on vérifie que les valeurs saisies sont correctes avant de les accepter.

### Afficheur.java

S'occupe uniquement de l'affichage. Elle dessine la grille avec des bordures dans le terminal et affiche les messages d'information comme les erreurs ou les confirmations de succès.

### Main.java

C'est le point d'entrée. Il demande à l'utilisateur comment charger la grille, appelle les bonnes méthodes, vérifie la validité de la grille, lance le solveur et affiche le résultat final.


## 4. Algorithme de résolution

On a choisi le backtracking récursif. Le principe est simple : on cherche la première case vide, on essaie de placer un chiffre valide, puis on continue récursivement. Si à un moment aucun chiffre ne fonctionne, on revient en arrière et on essaie le suivant. On s'arrête quand toutes les cases sont remplies.

Pour qu'un placement soit valide, le chiffre ne doit pas déjà être présent dans la même ligne, la même colonne, ni dans le même bloc de 3x3.


## 5. Compilation et exécution

Pour compiler :

    javac -encoding UTF-8 *.java

Pour lancer :

    java Main


## 6. Format du fichier d'entrée

Le fichier doit contenir 9 lignes avec 9 chiffres séparés par des espaces. Les cases vides sont représentées par 0.
