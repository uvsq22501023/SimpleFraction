# Compléments de programmation - TD 1
Nom, Prénom, No Etudiant, Nc
     > BELHARBI, SALAHEDDINE, 22501023, 102
## Remarques préliminaires
* Pour l'ensemble des TDs, vous créerez un compte individuel sur [github](https://github.com/) si vous n'en possédez pas déjà un.
Vous nommerez ce compte de la façon suivante: `uvsq<MonNuméroÉtudiant>`.
Par exemple, pour un étudiant de numéro *21601234*, le compte sera `uvsq21601234`.
* Les commandes `git` sont à taper en ligne de commande dans un *shell*.
* Vous pouvez utiliser l'IDE de votre choix.
Sur le cartable numérique, [Eclipse](www.eclipse.org), [IntelliJ IDEA](http://www.jetbrains.com/idea/) et [Visual Studio Code](https://code.visualstudio.com/) sont installés.
* Vous répondrez aux questions directement dans ce fichier en complétant les emplacements correspondants.
Ajoutez ensuite ce fichier au dépôt `git`.

## Partie I (à faire durant le TD) : découverte de `git`
Dans cet exercice, vous créerez une classe `Fraction` représentant un nombre rationnel et une classe `Main` qui testera les méthodes de la classe `Fraction` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp)).
À chaque étape, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`).

1. Sur la forge, créez le dépôt (_repository_) `SimpleFraction`;
En terme de *commits*, quelle différence constatez-vous entre cocher une (ou plusieurs) des cases *Initialize this repository with* et n'en cocher aucune ?
    > R- **Si on coche une case** : le dépot est créé avec un commit initial contenant les fichiers selectionnés
- **Si on ne coche rien** : le dépot est completement vide, sans aucun commit donc on devra faire le premier commit localement

    *Pour la suite, ne cochez aucune de ces cases*.
1. Localement, configurez `git` avec votre nom (`user.name`) et votre email (`user.email`) (cf. [Personnalisation de Git](https://git-scm.com/book/fr/v2/Personnalisation-de-Git-Configuration-de-Git));
    ```bash
    # Répondre ici
     git config --global user.name "SALAHEDDINE BELHARBI"
git config --global user.email "shmarketingprod@gmail.com"

1. Initialisez le dépôt `git` local pour le projet (cf. [Démarrer un dépôt Git](https://git-scm.com/book/fr/v2/Les-bases-de-Git-D%C3%A9marrer-un-d%C3%A9p%C3%B4t-Git));
    ```bash
    # Répondre ici
    ```git init



1. Dans votre IDE, créez la classe `Fraction` (vide pour le moment) et la classe `Main` (avec un simple affichage) dans le projet (cf. [Méthode `main`](https://docs.oracle.com/javase/specs/jls/se19/html/jls-12.html#jls-12.1.4));
Vérifiez que le projet compile et s'exécute dans l'IDE;
Validez les changements (cf. [Enregistrer des modifications dans le dépôt](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Enregistrer-des-modifications-dans-le-d%C3%A9p%C3%B4t));
    ```bash
    # Commandes pour valider les changements
    ``` git add Fraction.java Main.java
git commit -m "la premiere commit salaheddine belharbi"
git status
git log



1. Ajoutez la méthode `toString` à la classe `Fraction` (cf. [`Object.toString`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#toString())) qui retournera la chaîne `"Je suis une fraction."` et modifiez la classe `Main` en conséquence;
Validez les changements;
    ```Java
    // Code pour tester toString
    ```
1. Publiez vos modifications sur le dépôt distant (cf. [Travailler avec des dépôts distants](https://git-scm.com/book/fr/v2/Les-bases-de-Git-Travailler-avec-des-d%C3%A9p%C3%B4ts-distants));
Vous utiliserez le protocole `https` pour cela;
Vérifiez avec le navigateur;
    ```bash
    # Commandes pour publier les modifications
    ```
    

1. Sur la forge, ajoutez un fichier de documentation `README.md`.
Quelle syntaxe est utilisée pour ce fichier ?
    > Le fichier README.md utilise la syntaxe **Markdown**

- `# Titre` pour les titres principaux
- `## Sous-titre` pour les sous-titres
- `- élément` pour les listes
- **texte** pour le gras
- `code` pour le code inline
   


1. Récupérez localement les modifications effectuées sur la forge.
    ```bash
    # Répondre ici
    ```git pull origin main


1. Ajoutez les répertoires et fichiers issus de la compilation aux fichiers ignorés par `git` (cf. [`.gitignore` pour Java](https://github.com/github/gitignore/blob/main/Java.gitignore));
    ```bash
    # Copier ici le contenu de `.gitignore`
    ```
    # Fichiers de compilation Java
*.class
*.jar
*.war
*.ear

# Dossiers de build
target/
build/
out/
bin/

# Fichiers IDE
.idea/
*.iml
*.ipr
*.iws
.vscode/

# Fichiers système
.DS_Store
Thumbs.db




1. Retirez les fichiers de configuration de l'IDE du projet;
    ```bash
    # Répondre ici
    ```
    # Les fichiers .class sont déjà ignorés par le .gitignore
# Aucune action nécessaire car git ne les track pas
sinon on peut utuliser : git rm 



    Ajoutez-les aux fichiers ignorés par `git`.
    ```bash
    # Copier ici les modifications de `.gitignore`
    ```  # Fichiers de compilation Java
*.class    voila on vu la que il ignore ce type
*.jar
*.war
*.ear  



1. Configurez l'accès par clé publique/clé privée à la forge (cf. [Connecting to GitHub with SSH](https://docs.github.com/en/authentication/connecting-to-github-with-ssh)).
    > Expliquez la procédure de façon synthétique

1. **Génération de clé SSH** : `ssh-keygen -t rsa -b 4096 -C "shmarketingprod@gmail.com (ca c mon email 2 eme)"`
2. **Copie de la clé publique** : `type %USERPROFILE%\.ssh\id_rsa.pub`
3. **Ajout sur GitHub** : Settings → SSH keys → New SSH key → Coller ( dans cette etape on fait aussi le nom et autre option ....)
4. **Test de connexion** : `ssh -T git@github.com`
5. **Utilisation** : URLs au format `git@github.com:user/repo.git`  ici on fait notre username




## Partie II (à faire durant le TD) : compléter la classe `Fraction`
Dans cet partie, vous compléterez les classes `Fraction` et `Main`.
Un exemple d'interface pour une telle classe est donné par la classe [`Fraction`](http://commons.apache.org/proper/commons-math/javadocs/api-3.6.1/org/apache/commons/math3/fraction/Fraction.html) de la bibliothèque [Apache Commons Math](http://commons.apache.org/math/).

Vous respecterez les consignes ci-dessous :
* chaque méthode de `Fraction` sera testée dans `Main` **avec des assertions** (cf. [Utilisation d'assertions](https://koor.fr/Java/Tutorial/java_assert.wp));
* à la fin de chaque question, consultez le statut des fichiers du projet (`git status`) ainsi que l'historique (`git log`) puis validez les changements.

1. Ajoutez les attributs représentants le numérateur et le dénominateur (nombres entiers).
    ```Java
    // Déclaration des attributs
    ```


cbn

1. Ajoutez les constructeurs (cf. [Constructor Declarations](https://docs.oracle.com/javase/specs/jls/se19/html/jls-8.html#jls-8.8)) suivants :
    * initialisation avec un numérateur et un dénominateur,
    * initialisation avec juste le numérateur (dénominateur égal à _1_),
    * initialisation sans argument (numérateur égal _0_ et dénominateur égal à _1_),
    ```Java
    // Assertions pour tester les constructeurs (avec toString)
    ```

cbn


1. Ajoutez les fractions constantes ZERO (0, 1) et UN (1, 1) (cf. [Constants in Java](https://www.baeldung.com/java-constants-good-practices)),
    ```Java
    // Déclaration des constantes
    ```

cbn


1. Ajoutez une méthode de consultation du numérateur et du dénominateur (par convention, en Java, une méthode retournant la valeur de l'attribut `anAttribute` est nommée `getAnAttribute`),
    ```Java
    // Définition des getters
    ```


cbn



1. Ajoutez une méthode de consultation de la valeur sous la forme d'un nombre en virgule flottante (méthode `doubleValue()`) (cf. [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html)),
   ```Java
    // Assertions pour tester la conversion
    ```


cbn


1. Ajoutez une méthode permettant l'addition de deux fractions (la méthode `add` prend en paramètre *une* fraction et *retourne* la somme de la fraction courante et du paramètre),
   ```Java
    // Assertions pour tester l'addition
    ```


cbn



1. Ajoutez le test d'égalité entre fractions (deux fractions sont égales si elles représentent la même fraction réduite) (cf. [`java.lang.Object.equals`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object))),
   ```Java
    // Assertions pour tester l'égalité
    ```


cbn


1. Ajoutez la comparaison de fractions selon l'ordre naturel (cf. [`java.lang.Comparable`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Comparable.html)).
   ```Java
    // Assertions pour tester la comparaison
    ```


cbn



1. Faites hériter votre classe `Fraction` de la classe [`java.lang.Number`](https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Number.html) et complétez les méthodes
   ```Java
    // Vérifiez avec le code ci-dessous
    Number aNumber = java.math.BigDecimal.ONE;
    Number anotherNumber = new Fraction(1, 2);
    assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
    ```


cbn


## Partie III (à faire à la maison) : révisions et perfectionnement *shell* et *IDE*
### Maîtriser le *shell* de commandes
L'objectif de cet exercice est de vous faire réviser/découvrir les commandes de base du *shell* de votre machine.
Vous pouvez répondre en utilisant le shell de votre choix (*bash*, *Powershell*, …).
Pour répondre à ces questions, vous devez effectuer les recherches documentaires adéquates (livre, web, …).

1. Quel OS et quel shell de commande utilisez-vous ?
    > **OS** : Windows 10
**Shell** : Command Prompt (cmd)
1. Quelle commande permet d'obtenir de l'aide ?
Donnez un exemple.
    ```bash
    # commande /? par exemple : dir /?
    ```
1. Donnez la ou les commandes shell permettant de
    1. afficher les fichiers d'un répertoire triés par taille (taille affichée lisiblement)
        ```bash
        # dir /O-S
        ```
    1. compter le nombre de ligne d'un fichier
        ```bash
        # find /c /v "" Main.java
        ```
    1. afficher les lignes du fichier `Main.java` contenant la chaîne `uneVariable`
        ```bash
        # findstr "uneVariable" Main.java
        ```
    1. afficher récursivement les fichiers `.java` contenant la chaîne `uneVariable`
        ```bash
        # findstr /s "uneVariable" *.java
        ```
    1. trouver les fichiers (pas les répertoires) nommés `README.md` dans une arborescence de répertoires
        ```bash
        # dir README.md /s
        ```
    1. afficher les différences entre deux fichiers textes
        ```bash
        # fc fichier1.txt fichier2.txt
        ```
1. Expliquez en une ou deux phrases le rôle de ces commandes et dans quel contexte elles peuvent être utiles pour un développeur.
    * `ssh`
        > Connexion sécurisée à des machines distantes. Utile pour se connecter à des serveurs ou GitHub (en utulise le grand cle STRING)
    * `screen`/`tmux`
        >  Gestionnaire de sessions terminal il est Utile pour garder des processus actifs apres déconnexion.
    * `curl`/[HTTPie](https://httpie.org/)
        > Envoi de requêtes HTTP il est Utile pour tester des APIs web comme les test aue on fait dans POSTMAN etc ....
    * [jq](https://stedolan.github.io/jq/)
        > Traitement de JSON en ligne de commande il est Utile pour parser des réponses d'API.

### Découverte de votre *IDE*
Dans cet exercice, vous expliquerez en quelques phrases comment vous réalisez les actions ci-dessous dans votre IDE.
Vous pouvez choisir l'IDE/éditeur de texte de votre choix.
Pour réaliser cette exercice, vous devez bien évidemment vous reporter à la documentations de l'IDE ([IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html#developer-tools), [Visual Studio Code](https://code.visualstudio.com/docs), [Eclipse](https://help.eclipse.org/2020-09/index.jsp), …).

1. Quels IDE ou éditeurs de texte utilisez-vous pour le développement Java ?
    > VS Code

    Pour la suite, ne considérez que l'un de vos choix.
1. Comment vérifier/définir que l'encodage utilisé est *UTF-8* ?
    > pour verifier on Regarder en bas à droite de VS Code - l'encodage actuel est affiché et pour definir Cliquer sur l'encodage en bas à droite apres "Reopen with Encoding" ou "Save with Encoding" sinon on peut faire par defaut comme ca : Fichier → Préférences → Paramètres → chercher "encoding" → "Files: Encoding" = "utf8"

1. Comment choisir le JDK à utiliser dans un projet ?
    > Ctrl+Shift+P → "Java: Configure Java Runtime" → choisir le JDK

1. Comment préciser la version Java des sources dans un projet ?
    > Dans le fichier .vscode/settings.json :
{
    "java.project.sourceVersion": "19",
    "java.project.targetVersion": "19"
}

1. Comment ajouter une bibliothèque externe dans un projet ?
    >  pour un JAR simple : Copier le .jar dans un dossier "lib", puis dans .vscode/settings.json :
{
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}

sinon pour (Maven/Gradle) : Utiliser un build tool intégré avec pom.xml (ici on va faire dependencies...) ou build.gradle (pas un grand idee j ai pas travailler avec) 


1. Comment reformater un fichier source Java ?
    > **Raccourci** : Shift + Alt + F
**Menu** : Clic droit → "Format Document"
**Auto-format** : Dans les paramètres, activer "Editor: Format On Save"


1. Comment trouver la déclaration d'une variable ou méthode ?
    > **Raccourci** : F12 ou Ctrl + clic sur la variable/méthode
**Menu** : Clic droit → "Go to Definition"
**Raccourci alternatif** : Ctrl + Shift + O (aller aux symboles du fichier)


1. Comment insérer un bloc de code prédéfini (*snippet*) ?
    > Taper le début du snippet (ex: "sout" pour System.out.println) puis appuyer sur Tab
Ou : Ctrl + Espace pour voir la liste des snippets disponibles
Les snippets courants : "main", "for", "if", etc...


1. Comment renommer une classe dans l'ensemble du projet ?
    > **Raccourci** : F2
**Menu** : Clic droit sur le nom de la classe → "Rename Symbol"
dans mon cas VS Code renomme automatiquement la classe dans tous les fichiers du projet


1. Comment exécuter le programme en lui passant un paramètre en ligne de commande ?
    >  Terminal → java Main.java param1 param2

1. Comment déboguer le programme en visualisant le contenu d'une ou plusieurs variables ?
    > 1. Cliquer à gauche d'une ligne pour ajouter un breakpoint apres F5 pour démarrer le débogage
2. Le programme s'arrête au breakpoint 
3. Dans la fenêtre "Variables" à gauche, voir le contenu de toutes les variables apres F10 pour avancer pas à pas, F5 pour continuer

1. Quels paramètres ou fonctionnalités vous semblent particulièrement importants/utiles pour le développement Java ?
    > Git intégré pour le contrôle de version  et Terminal intégré pour les commandes aussi le Auto-complétion intelligente (IntelliSense) plus le Formatage automatique , y a plus mais je pense cela les importants.
