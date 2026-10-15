package prestandoDevolviendo;
 /*
 No se puede usar herencia ya que herramienta, libro y Programa
 no pertenecen al mismo padre, no comparten una relacion entre si.
Por eso se usa una interfaz, ya que devolver y prestar son las misma accion,
pero no hace falta que tengan relacion las clases entre si.
  */

public interface Accion {
    void prestar();
    void devolver();
}

//no se si debo hacer las clases o no en el ejercicio