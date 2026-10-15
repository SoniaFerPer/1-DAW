package comparable_comparator;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Persona> {
//    @Override
//    public int compare(Persona o1, Persona o2) {
//        return o1.getNombre().compareTo(o2.getNombre());
//    }
//    @Override
//    public int compare(Persona o1, Persona o2) {
//        return Integer.compare(o1.getEdad(),o2.getEdad());
//    }
    //COMPARAR POR VARIOS ATRIBUTOS
@Override
public int compare(Persona p1, Persona p2) {
    int resultadoEdad = Integer.compare(p1.getEdad(), p2.getEdad());
    if (resultadoEdad != 0) {
        return resultadoEdad; // si no son iguales, devolvemos la comparación por edad
    }
    // si la edad es igual, comparamos por nombre
    return p1.getNombre().compareTo(p2.getNombre());
}
}
