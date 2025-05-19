package myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) {
        File src = new File("myio\\a.txt");

        File dest = new File("myio\\b.zip");


    }
    public static void toZip(File src,File dest) throws IOException {
        //1.创建压缩流对象关联压缩包
        ZipOutputStream zos = new  ZipOutputStream(new FileOutputStream(new File("myio\\b.zip")));
        //2.创建zipentry对象，表示压缩包中的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //3.将zipentry对象添加到压缩包中
        zos.putNextEntry(entry);
        //4.将文件中的数据读取到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b=fis.read())!=-1){
            zos.write(b);
        }
        //5.关闭资源
        zos.closeEntry();
        zos.close();


    }
}
