package Act2;

public class Localidad {
    private String nombre; //no podemos poner final porque hay un setter que modifica el atributo y entonces no puede ser constante
    private int provincia;
    private int habitantes;

    public Localidad(String nombre, int provincia, int habitantes) {
        this.nombre = nombre;
        setProvincia(provincia); //para que se aplique lo que hemos dicho en el setter
        this.habitantes = habitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) { //tiene que estar entre estos cp pero no se si debemos usar expresiones regulares para que imprima 01
        if (provincia >= 1 && provincia <= 52) {
            this.provincia = provincia;
        } else {
            throw new IllegalArgumentException("La provincia debe ser un código de 2 dígitos");
        }
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) { //no puede haber menos de 0 habitantes
        if (habitantes >= 0) {
            this.habitantes = habitantes;
        }
    }

}
