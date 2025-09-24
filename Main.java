public class Main {
    public static void main(String[] args) {
        // Assertions pour tester les constructeurs
        Fraction f1 = new Fraction();
        assert f1.toString().equals("0/1") : "Constructeur par défaut échoué";
        
        Fraction f2 = new Fraction(3);
        assert f2.toString().equals("3/1") : "Constructeur avec numérateur échoué";
        
        Fraction f3 = new Fraction(2, 3);
        assert f3.toString().equals("2/3") : "Constructeur complet échoué";
        
        System.out.println("Tous les tests passent !");

        // Tests des constantes
        assert Fraction.ZERO.toString().equals("0/1") : "Constante ZERO échouée";
        assert Fraction.UN.toString().equals("1/1") : "Constante UN échouée";

        // Tests des getters
        Fraction f4 = new Fraction(3, 4);  // CHANGÉ: f4 au lieu de f
        assert f4.getNumerateur() == 3 : "Getter numerateur échoué";
        assert f4.getDenominateur() == 4 : "Getter denominateur échoué";
        
        System.out.println("Tests Q3 et Q4 passent !");

        // Assertions pour tester la conversion
        Fraction f5 = new Fraction(1, 2);  // CHANGÉ: f5
        assert Math.abs(f5.doubleValue() - 0.5) < 1E-8 : "doubleValue 1/2 échoué";

        Fraction f6 = new Fraction(3, 4);  // CHANGÉ: f6
        assert Math.abs(f6.doubleValue() - 0.75) < 1E-8 : "doubleValue 3/4 échoué";

        Fraction f7 = new Fraction(2, 1);  // CHANGÉ: f7
        assert Math.abs(f7.doubleValue() - 2.0) < 1E-8 : "doubleValue 2/1 échoué";

        System.out.println("Tests doubleValue passent !");

        // Assertions pour tester l'addition
        Fraction f8 = new Fraction(1, 2);  // CHANGÉ: f8
        Fraction f9 = new Fraction(1, 3);  // CHANGÉ: f9
        Fraction somme = f8.add(f9);       // CHANGÉ: f8.add(f9)
        
        assert somme.getNumerateur() == 5 : "Addition numerateur échoué";
        assert somme.getDenominateur() == 6 : "Addition denominateur échoué";
        assert somme.toString().equals("5/6") : "Addition toString échoué";
        
        System.out.println("Tests addition passent !");


 // Assertions pour tester l'égalité
 Fraction f10 = new Fraction(1, 2);
 Fraction f11 = new Fraction(1, 2);
 Fraction f12 = new Fraction(2, 4); // égale à 1/2
 Fraction f13 = new Fraction(1, 3); // différente
 
 assert f10.equals(f11) : "Égalité 1/2 et 1/2 échouée";
 assert f10.equals(f12) : "Égalité 1/2 et 2/4 échouée";
 assert !f10.equals(f13) : "Différence 1/2 et 1/3 échouée";
 
 System.out.println("Tests égalité passent !");


// Assertions pour tester la comparaison
Fraction f14 = new Fraction(1, 2);
Fraction f15 = new Fraction(1, 3);
Fraction f16 = new Fraction(2, 4); // égale à 1/2

assert f14.compareTo(f15) > 0 : "1/2 > 1/3 échoué";
assert f15.compareTo(f14) < 0 : "1/3 < 1/2 échoué";
assert f14.compareTo(f16) == 0 : "1/2 = 2/4 échoué";

System.out.println("Tests comparaison passent !");






// Vérification avec le code de l'énoncé
Number aNumber = java.math.BigDecimal.ONE;
Number anotherNumber = new Fraction(1, 2);
assert Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;

System.out.println("Test héritage Number passé !");
System.out.println("=== TOUS LES TESTS PASSENT ===");
}


}
