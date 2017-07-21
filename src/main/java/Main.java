import java.io.*;

/**
 * Created by Administrator on 2017/7/21.
 */
public class Main {
    public static void main(String[] args) {
        File file=new File("D:\\object.txt");
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        try {

            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:\\object.txt"));
            My my= new My(1);
            output.writeObject(my);
output.flush();
output.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("D:\\object.txt"));
            try {
                My my1 = (My) input.readObject();
                System.out.print(my1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }



  }


}
