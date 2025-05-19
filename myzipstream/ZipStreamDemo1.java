package myzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) {

        File src = new File("E:\\aaa.zip");
        File dest = new File("E:\\");

        unzip(src,dest);


    }
    public  static  void unzip() throws IOException {
        //解压的本质：读取压缩包里面的每一个文件或者文件夹，然后把每一个文件或者文件夹写入到指定的路径下
        //1.创建解压对象
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry entry ;
        while ((entry = zis.getNextEntry())!=null){
            System.out.println(entry);
            if (entry.isDirectory()){
                File file = new File(dest,entry.getName());
                file.mkdirs();
            }else {
                FileOutputStream fos = new FileOutputStream(new File(dest,entry.toString()));
                int b;
                while ((b=zis.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                zis.closeEntry();

            }
        }
        zis.close();

    }
}
