import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        boolean valida = false;

        while (!valida) {
            System.out.print("Introduce una matrícula en formato 1234ABC: ");
            matricula = scanner.nextLine();
            //No lo pide el enunciado pero podríamos poner otra excepción para el scanner.nextLine()

            try {
                //Comprobar longitud
                if (matricula.length() != 7) {
                    throw new IllegalArgumentException("La matrícula debe tener exactamente 7 caracteres.");
                }

                // Separar números y letras
                String numeros = matricula.substring(0, 4);
                String letras = matricula.substring(4, 7);

                //Comprobar números (usando ASCII)
                for (int i = 0; i < numeros.length(); i++) {
                    char c = numeros.charAt(i);
                    if (c < '0' || c > '9') {
                        throw new IllegalArgumentException("Los 4 primeros caracteres deben ser números.");
                    }
                }

                // Comprobar letras (usando ASCII)
                for (int i = 0; i < letras.length(); i++) {
                    char c = letras.charAt(i);
                    if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
                        throw new IllegalArgumentException("Los 3 últimos caracteres deben ser letras.");
                    }
                    // Podríamos pasar todo a mayúsculas con el UpperCase() y ya solo hacer la parte del condicional de !(c >= 'A' && c <= 'Z')
                }

                // Si todo está correcto lo muestra y pone la bandera valida = true para salir del while, si tenemos algún throw no vamos a llegar aquí porque el catch recogería la
                //excepción y pasaríamos a la zona del bloque catch.
                System.out.println("Números: " + numeros);
                System.out.println("Letras: " + letras.toUpperCase());
                valida = true;

            } catch (IllegalArgumentException e) {
                System.err.println("Formato inválido: " + e.getMessage());
                System.err.println("Intenta de nuevo.\n");

            } catch (StringIndexOutOfBoundsException e) {
                System.err.println("Error al acceder a posiciones de la cadena.");
                // Está excepción no hace falta lanzarla con throw porque es una estándar de Java

            }finally {
                //Esto se ejecuta SIEMPRE (aunque haya error)
                System.out.println("Validación completada (con o sin errores).");
            }
            //Usar System.out para todo lo que es parte normal del programa (mensajes, resultados, prompts al usuario).
            //Usar System.err para errores, advertencias y excepciones porque si algún día automatizamos o guardamos logs, tendremos las cosas ordenadas y separadas
        }

        scanner.close();
    }
}