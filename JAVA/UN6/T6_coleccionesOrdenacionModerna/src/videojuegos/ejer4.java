package videojuegos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.jar.JarEntry;

public class ejer4 {
    public static void main(String[] args) {
        Videojuegos v1 = new Videojuegos("los sims",2000,3.0);
        Videojuegos v2 = new Videojuegos("Return of Moria",2020,3.5);
        Videojuegos v3 = new Videojuegos("Dark Souls",2010,5);
        Videojuegos v4 = new Videojuegos("Devil May Cry",2010,4.5);
        Videojuegos v5 = new Videojuegos("Tomb Raider",1995,4.0);

       List<Videojuegos> juegos = new ArrayList<>();
       juegos.add(v1);
       juegos.add(v2);
       juegos.add(v3);
       juegos.add(v4);
       juegos.add(v5);

       //EJERCICIO 4
        System.out.println();
        System.out.println("--EJERCICIO 4--");

        juegos.sort(Comparator.comparing(Videojuegos::getPuntuacion));
        juegos.forEach(System.out::println);

        //EJERCICIO 5
        System.out.println();
        System.out.println("--EJERCICIO 5--");

        juegos.sort(Comparator.comparing(Videojuegos::getLanzamiento).thenComparing(Videojuegos::getTitulo));
        juegos.forEach(System.out::println);

        //EJERCICIO 6 - COMPARABLE
        //EJERCICIO 7
        System.out.println();
        System.out.println("--EJERCICIO 7--");


    }
}