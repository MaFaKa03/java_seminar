// Создать файл с названием file.txt. Если файл уже есть, то создавать не надо
//  Записать в него Слово "TEXT" 100 раз

package java_seminar.homework2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class task2 {

    public static void main(String[] args)  throws IOException{
        
        BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream("file.txt"));
        //FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
        String text = "TEXT ";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        //fileOutputStream.write(bytes);
        int count = 0;
        while(count < 100){
        //    fileOutputStream.write(bytes);
            os.write(bytes);
            count ++;
        }
        os.flush();
        //fileOutputStream.close();
    }   
    
}
