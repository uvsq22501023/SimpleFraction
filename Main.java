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
  Fraction f = new Fraction(3, 4);
  assert f.getNumerateur() == 3 : "Getter numerateur échoué";
  assert f.getDenominateur() == 4 : "Getter denominateur échoué";
  
  System.out.println("Tests Q3 et Q4 passent !");

    }
}