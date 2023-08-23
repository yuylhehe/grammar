package org.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UnCheckException unCheckException = new UnCheckException();
        FileInputStream checkException = new FileInputStream(new File("111"));
    }
}
