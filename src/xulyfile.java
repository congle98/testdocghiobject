import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class xulyfile {
    public static void ghifile(ArrayList<Student> students, String path){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static ArrayList<Student> docfile(String path){
        ArrayList<Student> data = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            data=(ArrayList<Student>) objectInputStream.readObject();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return data;
    }
}
