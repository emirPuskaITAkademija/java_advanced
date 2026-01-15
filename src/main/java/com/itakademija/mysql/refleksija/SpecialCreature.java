package com.itakademija.mysql.refleksija;

// _sc1

/**
 * enum vs klasa
 * <p>
 *     1. method - ovdje nema razlike
 *     2. polja/field - ovdje nema razlike
 *     3. constructor - OVDJE Postoji razlika ..enum insistira na private konstruktoru, a klasa kaže može ali i ne mora
 *      private/package-private/protected/public
 *     4. nested klase / inner class
 *        4.1 static
 *        4.2 non-static
 * </p>
 */
public class SpecialCreature {

    private static SpecialCreature SINGLETON;

    private SpecialCreature(){
        System.out.println("Poziv konstruktora...za SINGLETON");
    }


    //Koji je preduvjet da se pozove ova funkcija ?
    // PREDUVJET: postojanje objekta tipa SpecialCreature
    public static SpecialCreature get(){
        if(SINGLETON == null){
            SINGLETON = new SpecialCreature();
        }
        return SINGLETON;
    }
}
