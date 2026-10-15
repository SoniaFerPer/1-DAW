import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    class Persona {
        String nombre;
        String ciudad;

        public Persona(String nombre, String ciudad) {
            this.nombre = nombre;
            this.ciudad = ciudad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCiudad() {
            return ciudad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", ciudad='" + ciudad + '\'' +
                    '}';
        }
    }

public class ejer8 {
    public static void main(String[] args) {
        Persona e1 = new Persona("Luisa", "Madrid");
        Persona e2 = new Persona("Maria", "linares");
        Persona e3 = new Persona("Jose", "linares");
        Persona e4 = new Persona("Andres", "Jaen");
        Persona e5 = new Persona("Amelia", "Jaen");
        Persona e6 = new Persona("Manolo", "Cordoba");
        List<Persona> personas = new ArrayList<>();
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        personas.add(e4);
        personas.add(e5);
        personas.add(e6);
        Map<String,List<String>> censo = new HashMap<>();

        for(Persona a: personas){
            // EXPLICACIÓN DEL computeIfAbsent:
            // 1. Mira si la ciudad "Madrid" ya existe en el mapa.
            // 2. Si NO existe, ejecuta la lambda (k -> new ArrayList<>()) para crear una lista vacía y la asocia a "Madrid".
            // 3. Devuelve esa lista (ya sea la recién creada o la que ya existía de antes).
            // 4. Sobre la lista que nos devuelve, hacemos el .add() para meter el nombre de la persona.
            censo.computeIfAbsent(a.getCiudad(), k-> new ArrayList<>()).add(a.getNombre());
        }

        censo.forEach((ciudad,listaNombres)-> {System.out.println(ciudad + " " + listaNombres);});
    }
}