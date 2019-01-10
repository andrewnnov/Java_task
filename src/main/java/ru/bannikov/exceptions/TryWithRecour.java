package ru.bannikov.exceptions;

//

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithRecour {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream in = new FileInputStream("d:/tmp-1.txt");
            FileOutputStream out = new FileOutputStream("d:/tmp-2.txt");
            out.write(in.read());
            out.flush();

        } finally {
            out.close();  //объявленное внутри try тут не видно
            in.close();
        }
    }
}
