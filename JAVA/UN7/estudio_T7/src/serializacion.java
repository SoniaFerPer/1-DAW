import java.io.*;

public class serializacion {
    public static void main(String[] args){

        //SERIALIZAR
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dir/persona1.dat"))){

            Persona p1 = new Persona("juan", 25);
            oos.writeObject(p1);

        }catch (IOException e){

        }

        //DESERIALIZAR
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir/persona1.dat"))){
            Persona p = (Persona) ois.readObject(); //CASTEO OBLIGATORIO
        }catch (IOException | ClassNotFoundException e){

        }


    }
}
