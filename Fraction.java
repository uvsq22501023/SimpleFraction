
public class Fraction {
    private int numerateur;
    private int denominateur;
    
    // question 3 partie II
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);


// question 4 partie II : Définition des getters 
public int getNumerateur() {
    return this.numerateur;
}

public int getDenominateur() {
    return this.denominateur;
}

// question 2 partie II
    // Constructeur avec numérateur et dénominateur
    public Fraction(int num, int den) {
        this.numerateur = num;
        this.denominateur = den;
    }
    
    // Constructeur avec seulement numérateur
    public Fraction(int num) {
        this(num, 1); // Appelle le constructeur principal
    }
    
    // Constructeur sans argument
    public Fraction() {
        this(0, 1); // Appelle le constructeur avec numérateur=0, dénominateur=1
    }
    


    // question 5 pqrtie II : Méthode de consultation de la valeur en virgule flottante
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }



// question 6 : Méthode d'addition de deux fractions
public Fraction add(Fraction autre) {
    int nouveauNum = this.numerateur * autre.denominateur + autre.numerateur * this.denominateur;
    int nouveauDen = this.denominateur * autre.denominateur;
    return new Fraction(nouveauNum, nouveauDen);
}



    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }
}