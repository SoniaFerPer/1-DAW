import java.io.*;
import java.util.*;

public class binarios {
    public static void main(String[] args){
//    //1. CON FILEOUTPUTSTREAM ----> Si no existe → lo crea
//    //                              Si existe → añade al final
//        Scanner sc = new Scanner(System.in);
//        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("dir/numeros.dat",true))){
//            int entero;
//            do{
//                entero = sc.nextInt();
//                if (entero != 0) {
//                    dos.writeInt(entero);
//                }
//
//            }while (entero != 0);
//        }catch (EOFException e) {
//            // FIN DEL FICHERO → esto es normal, no es error
//        }catch (IOException e){
//            System.err.println("error");
//        }

//        //2. EL FINAL DE LOS DATA NO ES NULL NI -1 ES UNA EXCEPCION EOF, ASIQUE SIEMPRE LOS PONEMOS EN WHILE(TRUE) Y
//        //LEEMOS DESPUES EL ARCHIVO TODO ESTO DENTRO DE UN CATCH CON RECURSOS
//        //NO PONEMOS TRUE PORQUE YA TENEMOS EL ARCHIVO Y LO QUE QUEREMOS ES DIVIDIRLO, ASIQUE NO LO SOBREESCRIBE LO QUE TENIA ANTES PORQUE ESTABAN VACIOS
//
//        try(DataInputStream dis = new DataInputStream(new FileInputStream("dir/lista.dat"));
//        DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("dir/pares.dat"));
//        DataOutputStream dos2 = new DataOutputStream(new FileOutputStream("dir/impares.dat"))){
//            int a;
//            while(true){
//                a = dis.readInt();
//
//                if(a % 2 == 0){
//                    dos1.writeInt(a);
//                }else{
//                    dos2.writeInt(a);
//                }
//            }
//
//        }catch (EOFException e){
//                // FIN DEL FICHERO → esto es normal, no es error
//        }catch (IOException e){
//            System.err.println(e);
//        }

        //3. EOF SOLO SE USA CUANDO LEEMOS UN ARCHIVO, NO HACE FALTA CUANDO ESCRIBIMOS

//        Scanner sc = new Scanner(System.in);
//
//            String nombreAlumno = sc.nextLine();
//            String fichero = "dir/" + nombreAlumno + ".dat";
//            try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero, true))){
//
//            double nota;
//            do {
//                nota = sc.nextDouble();
//
//                if (nota >= 0) {
//                    dos.writeDouble(nota);
//                }
//            }while (nota >= 0);
//            sc.nextLine();
//
//            }catch (IOException e){
//
//            }

//        //4.
//
//        ArrayList<String> lista = new ArrayList<>();
//        try (DataInputStream dis = new DataInputStream(new FileInputStream("dir/invitados.dat"))) {
//            while (true) {
//                String nombre = dis.readUTF();
//                if (!lista.contains(nombre)) {
//                    lista.add(nombre);      //TENEMOS QUE LEER PARA IR METIENDO EN LA LISTA LO QUE HAY EN EL FICHERO
//                }
//            }
//        } catch (EOFException e) {// fin normal
//        } catch (IOException e) {}
//
//        // 2. Pedir nombres
//        Scanner sc = new Scanner(System.in);
//        String nombre;
//
//        while (true) {
//            System.out.print("Nombre (fin para salir): ");
//            nombre = sc.nextLine();
//            if (nombre.equalsIgnoreCase("fin")) break;
//            if (!lista.contains(nombre)) {
//                lista.add(nombre);
//            }
//        }
//        Collections.sort(lista);
//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("dir/invitados.dat"))) {
//            for (String n : lista) {
//                dos.writeUTF(n);
//            }
//        } catch (IOException e) {}

//        //1.
//        Scanner sc = new Scanner(System.in);
//
//        int c = sc.nextInt();
//        if (c < 0 || c > 255) {
//            System.out.println(-1);
//            return;
//        }
//        int contador = 0;
//        try(InputStream is = new FileInputStream("dir/fichero.bin")){
//            int n;
//            contador = 0;
//            while((n = is.read()) != -1){
//                if(n == c){
//                    contador++;
//                }
//            }
//
//        }catch (FileNotFoundException e){
//            System.out.println(-1);
//        }catch (IOException e){
//            System.err.println(-1);
//        }
//
//        System.out.println(contador);

//        //2.
//        Map<Integer,Integer> listNumeros = new HashMap<>();
//        try(InputStream is = new FileInputStream("dir/fichero.bin")){
//            int c;
//            while((c = is.read()) != -1){
//                if(listNumeros.containsKey(c)){  //si ya existe
//                    listNumeros.put(c,listNumeros.get(c) + 1);  //get obtiene valor actual y le sumamos 1
//                }else{
//                    listNumeros.put(c, 1); //sino existe le ponemos valor 1
//                }
//            }
//        }catch (IOException e){}
//
//        listNumeros.forEach((clave, valor) -> System.out.println(clave + " -> " + valor));




    }
}
