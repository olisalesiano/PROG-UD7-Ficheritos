package net.salesianos.save_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {
        File file1 = new File("files/userInput");
        File file2 = new File("files/act2");
        File file = new File("files/file1and2");

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("files/file1and2"));
        } catch (IOException exception) {
            System.out.println("No se pudo leer el archivo mister.");
        }
    }
}
