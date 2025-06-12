package net.salesianos.save_text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SaveInputText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true) {
            System.out.println("Introduce un texto de mínimo 30 palabras: ");
            userInput = scanner.nextLine();

            if (userInput.length() >= 30) {
                break;
            }
            scanner.close();
        }

        String convertText = userInput.toUpperCase().replace(" ", "_");

        try {
            // método para escribir el fichero
            OutputStreamWriter writer = new OutputStreamWriter(
                    new FileOutputStream("./files/userInput"),
                    StandardCharsets.UTF_8);

            writer.write(convertText);
            writer.flush();
            writer.close();
            System.out.println("Texto guardado correctamente en 'files/userInput'");

        } catch (IOException exception) {
            System.out.println("Error guardando el texto.");
        }
    }
}