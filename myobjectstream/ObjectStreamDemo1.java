package myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {

        // 创建Person对象
        Student stu = new Student("张三", 23);

        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));

        oos.writeObject(stu);

    }
}
