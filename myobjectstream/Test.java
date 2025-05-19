package myobjectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException {
        //输出序列流

        // 创建Person对象
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("赵六", 26);
        Student s5 = new Student("钱七", 27);

        // 创建数组
        ArrayList<Student> list = new ArrayList<>();
        // 添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(list);
        oos.close();


    }
}
