package net.salesianos.save_text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {
        File file1 = new File("files/userInput");
        File file2 = new File("files/act2");
        File file = new File("files/file1and2");

        try {
            // ? lee archivo 1 ('userInput')
            BufferedReader reader1 = new BufferedReader(new FileReader("files/userInput"));
            String line1 = reader1.readLine(); // si está vacío devuelve null (cierra while)
            String fulltext1 = "";

            while (line1 != null) {
                fulltext1 += line1 + " ";
                line1 = reader1.readLine(); // lee la siguiente línea y si no, da null
            }
            // System.out.println(fulltext1);
            reader1.close();

            // ? lee archivo 2 ('act2')
            BufferedReader reader2 = new BufferedReader(new FileReader("files/act2"));
            String line2 = reader2.readLine();
            String fulltext2 = "";
            while (line2 != null) {
                fulltext2 += line2 + " ";
                line2 = reader2.readLine();
            }
            // System.out.println(fulltext2);
            reader2.close();

            // ? re write el nuevo ficherito
            FileWriter writer = new FileWriter("files/file1and2");
            writer.write("- Contenido del Fichero Uno: <" + fulltext1 + ">");
            writer.write("- Contenido del Fichero Dos: <" + fulltext2 + ">");
            writer.write("== FICHERO CREADO POR OLI ==");
            writer.flush();
            writer.close();

        } catch (IOException exception) {
            System.out.println("No se pudo leer el archivo mister.");
        }
    }
}
