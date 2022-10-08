import java.util.*;
import java.io.*;

//ID : 21CE062
//Name : Yagnik Ladani
// Aim : When to use Character Stream over Byte Stream? When to use Byte Stream over Character
// Stream? Give example.
public class Practical5_2 {
    public static void main(String[] args)
            throws IOException {
        FileReader sourceStream = null;

        try {
            sourceStream = new FileReader("/Users/Yagnik/Desktop/demo.rtf");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                System.out.println((char) temp);
            System.out.println("Program successfully executed");
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
