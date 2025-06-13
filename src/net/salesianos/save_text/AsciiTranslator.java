package net.salesianos.save_text;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class AsciiTranslator {
    public static void main(String[] args) {
        File file = new File("files/act2");

        try {
            InputStreamReader inputStream = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
            int textReader = inputStream.read();

            while (textReader != -1) {
                char character = (char) textReader;
                System.out.print(character + "_" + textReader + ", ");
                textReader = inputStream.read();
            }

            inputStream.close();

        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        }
    }
}
