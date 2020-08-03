package cn.csq.outputdemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author csq
 * @date 2020/8/1 15:46
 */
public class OutPutDemo01 {
    //1，创建字节输出流对象   ---->>>  告诉虚拟机我要往哪个文件中写数据中
    public static void main(String[] args) throws IOException {
        //FileOutputStream fileOutputStream = new FileOutputStream("D:\\javaio\\com.itheima.output\\a.txt");
        //FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\javaio\\com.itheima.output\\a.txt"));
        FileOutputStream fileOutputStream = new FileOutputStream("SelfStudyIo\\a.txt");

        //2.写数据 write()
        fileOutputStream.write(97);

        //3.释放资源
        fileOutputStream.close();
    }
}
