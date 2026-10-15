import java.io.*;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class texto {
    public static void main(String[] args){
        //USO DE METODOS LECTURA
        //----READ------ LEE CARACTER A CARACTER
        try(Reader reader = new FileReader("dir/doc.txt")){
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c); //sino casteo me devuelve un numero del codigo ASCII

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //----BUFFEREDREADER ---- LEE LINEA COMPLETAS

        try(BufferedReader br = new BufferedReader(new FileReader("dir/doc.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("dir/doc1.txt",true))){ //es importante para que no sobreescriba
            int contarLineas =0;
            int contarCar = 0;
            int contarPalabras = 0;

            String linea;
            while((linea = br.readLine()) != null){
                //System.out.println(linea); //mostrar la linea simplemente
                bw.write(linea);
                bw.newLine(); //sino ponemos salto la cagamos porque se ponene todas las lineas juntas
                                        //AÑADIR TEXTO AL ARCHIVO
                                         // bw.append("hola").append("mundo");
                //CONTARLINEAS
                contarLineas++;

                //CONTAR CARACTERES
                contarCar += linea.length();

                //CONTAR PALABRAS
                String[] palabras = linea.split("\\s+"); //ESTO ES ESPACIO/Tabulacion/salto de linea /varios espacios
                contarPalabras += palabras.length;
            }
            System.out.println("Líneas: " + contarLineas);
            System.out.println("Caracteres: " + contarCar);
            System.out.println("Palabras: " + contarPalabras);

        }catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (IOException e){
            System.err.println(e);
        }

        //----SCANNER------
        try(Scanner sc= new Scanner(new FileReader("dir/alumnos.txt"))){
            sc.useLocale(Locale.US); //PARA QUE INTERPRETE EL PUNTO Y NO LA COMA
            while(sc.hasNext()){
                String nombre = sc.next(); //solo palabra
                double n1 = sc.nextDouble(); // solo numero
                double n2 = sc.nextDouble();
                double n3 = sc.nextDouble();

                double media = (n1 + n2 + n3) / 3;

                System.out.println(nombre + " -> " + media);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }catch (InputMismatchException d){
            System.err.println("error de formato en el archivo");
        }

        //---READ(CHAR[]) --- LEE BLOQUES DE CARACTERES SEGUN EL TAMAÑO DEL ARRAY, CON WRITER COPIA "EXACTA DEL ARCHIVO" INCLUYENDO SALTOS
        //DIFERENCIA CON BUFFEREDWRITER - QUE ESTE TIENES QUE PONERLE LOS SALTOS DE LINEA TU
        try(Reader reader = new FileReader("dir/doc.txt");
        Writer writer = new FileWriter("dir/doc1.txt")){
            char[] caracteres = new char[1024];
            int n;
            while((n = reader.read(caracteres)) != -1){
//                System.out.println(new String(caracteres, 0, n)); //para imprimir lo que vaya leyendo
                writer.write(caracteres,0,n); //0 desde posicion 0 del array y hasta el ultimo caracter
            }

        }catch (IOException e){
           System.err.println(e);
        }

        //PRINTWRITER PW = NEW PRINTWRITER(ARCHIVO) -> ESCRIBE EN ARCHIVO
        //PRINTWRITER PW = NEW PRINTWRITER(SYSTEM.OUT) -> ESCRIBE EN PANTALLA


        /*
        --LECTURA--
        READ() (FILEREADER/READER) - LEE CARACTERES O ARRAY DE CHAR (BLOQUES DE CHAR)  (FINAL -1)
        BUFFEREDREADER - LEE LINEAS , MAS RAPIDO (READLINE()) (FINAL NULL)
        SCANNER - LEE NUMEROS Y PALABRAS FACIL , IDEAL PARA PARSING (HASNEXT/HASNEXTINT....) (FINAL HASNEXT())

        --ESCRITURA--
        PRINTWRITER ESCRIBE MAS FACIL (PRINT/PRINTLN/PRINTF)   - COMODO PARA EXAMENES
        BUFFEREDWRITER MAS RAPIDO Y EFICIENTE  (WRITE/NEWLINE) MEJOR PARA COPIA DE FICHEROS
         */

    }
}