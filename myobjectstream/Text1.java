package myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Text1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //输入流
        //反序列流

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        for (Student s : list) {
            System.out.println(s);
        }

        ois.close();


    }
}
