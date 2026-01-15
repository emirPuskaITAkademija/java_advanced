package com.itakademija.mysql.refleksija;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Zašto kreiramo klasu ?
 * <odgovor> Da bi kreirali konkretne istance/objekte/varijable po šablonu te klase </odgovor>
 * <p>
 * Zašto koristimo enume umjeste klase ?
 * <odgovor> Kada  ne želimo beskonačno objekata/varijabli/instanci onda biramo umjesto klase enum</odgovor>
 * <p>
 * Kako da dizajniramo klasu i da po šablonu te klase kreiramo jedan jedini objekat ?
 * SINGLETON - anti patternom
 * <odgovor></odgovor>
 */
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Season season = new Season("Autumn");
        // memory1
        Season season = Season.AUTUMN;
        // memory1
        Season season1 = Season.AUTUMN;
        // memory1
        Season season2 = Season.AUTUMN;
        System.out.println(season1.hashCode());
        System.out.println(season.hashCode());
        System.out.println(season2.hashCode());
        System.out.println();
//        SpecialCreature specialCreature = new SpecialCreature();
        //memory2
        SpecialCreature singleton = SpecialCreature.get();
        //memory2
        SpecialCreature singleton2 = SpecialCreature.get();
        //memory2
        SpecialCreature singleton3 = SpecialCreature.get();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());

        System.out.println();
        System.out.println("Refleksija...");
        /**
         * Za svaku klasu u Javi pa tako i za SpecialCreature JVM kreira tačno jedan objekat
         * na nivou klase. Može klasa imati mnoštvo objekat akreiranih po šablonu te klase,
         * ali samo jedan je Class objekat.
         */
        //JVM Class<SpecialCreature> specialCreatureClass
        Class<SpecialCreature> specialCreatureClass = SpecialCreature.class;
//        Class<SpecialCreature> specialCreatureClass2 = SpecialCreature.class;
//        Class<?> specialCreatureClass3 = singleton3.getClass();

        System.out.println(specialCreatureClass.hashCode()+"  ---> special creature");
//        System.out.println(specialCreatureClass2.hashCode());
//        System.out.println(specialCreatureClass3.hashCode());
        // Zašto je JVM kreirao za nas po svakoj klasi tačno jedan objekat tipa Class<T>
        //field, method, constructor
        Constructor<SpecialCreature> specialCreatureConstructor = specialCreatureClass.getDeclaredConstructor();
        specialCreatureConstructor.setAccessible(true);
        SpecialCreature specialCreature2 = specialCreatureConstructor.newInstance();
        System.out.println(specialCreature2.hashCode()+"  ---> special creature");
        SpecialCreature specialCreature3 = specialCreatureConstructor.newInstance();
        System.out.println(specialCreature3.hashCode()+"  ---> special creature");
//        Field getSingleton = specialCreatureClass.getField("SINGLETON");
//        Method method = specialCreatureClass.getMethod("getSingleton");

    }
}
