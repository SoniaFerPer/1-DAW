package Act16;

import java.util.Arrays;

public class PrincipalAgenda {
    Contacto [] agenda = new Contacto[20];  //para que sea maximo de 20

    public PrincipalAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }

    public Contacto[] getAgenda() {
        return agenda;
    }

    public void setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }

    public void menu(String opciones, Contacto nuevoContacto) {
        switch (opciones) {
            case "Listar Menu":
                Arrays.sort(agenda);
                for (int i = 0; i < agenda.length; i++) {
                    System.out.println(i);
                }
                break;
            case "Buscar contacto":
                //busqueda dicotomica
                break;
            case "Eliminar contacto":
                //eliminar contacto
                break;
            case "Añadir contacto":
                for (int i = 0; i < agenda.length; i++) {
                    if (agenda[i] == null) {
                        agenda[i] = nuevoContacto;
                        System.out.println("Añadido: " + nuevoContacto.getNombreCompleto());
                    }
                }
                break;
            case "Salir":
                break;

        }
    }
}
