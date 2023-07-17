package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFileUsingInputStream {

    /*
     * ---------- general file handling -----------
     * a. FileOutputStream : write file
     * b. FileInputStream : read file
     *
     */

    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("/media/aayush/ACC0CC76C0CC4872/JAVA Class/hello.txt");

        file.write("It's raining outside".getBytes());
        file.close();

        System.out.println("Success");
    }
}
