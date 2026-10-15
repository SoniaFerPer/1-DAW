import java.io.*;

public class ejer6 {
    public static void main(String[] args) {
        //HAY QUE CREAR UN ARCHIVO CON DATA PARA QUE LOS ORGANICE CORRECTAMENTE
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("dir\\enteros.dat"))) {
            dos.writeLong(10L);
            dos.writeLong(5L);
            dos.writeLong(8L);
            dos.writeLong(7L);
            dos.writeLong(23534L);
        } catch(IOException e) {
            e.printStackTrace();
        }

        //COMO DICE NUMEROS LARGOS HAY QUE USAR DATA Y NOP FILE Y LOS NUMEROS DEBEN SER LONG
        try(DataInputStream dis = new DataInputStream(new FileInputStream("dir\\enteros.dat"));
            DataOutputStream dos1 = new DataOutputStream(new FileOutputStream("dir\\impares.dat"));
            DataOutputStream dos2 = new DataOutputStream(new FileOutputStream("dir\\pares.dat"))){
            long ent;
            while(true){ //CON DATA NO DEVUELVE -1 SINO UNA EXCEPCION ASIQUE DEBE HABER UNA EXCEPCION DENTRO DEL BUCLE
                try{
                    ent = dis.readLong();
                    if(ent %2 == 0){
                        dos2.writeLong(ent);
                    }else{
                        dos1.writeLong(ent);
                    }
                }catch (EOFException eof){
                    break;
                }
            }
        }catch (IOException E){
            System.err.println("no se encuentra el archivo");
        }
    }
}
