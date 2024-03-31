package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Prensentation {
    public static void main(String[] args) {
        // Injection des dépendences par instraciation statique => new : couplage fort
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println("Resultat = "+metier.calcul());
    }
}
