package net.salesianos.mesa;

import java.io.*;
import java.util.ArrayList;

public class TableManager {

    public static void saveTable(Table newTable) {
        ArrayList<Table> tables = getAllTables();
        tables.add(newTable);

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("files/tables"))) {
            output.writeObject(tables);
        } catch (IOException e) {
            System.out.println("Error al guardar la mesita.");
        }
    }

    public static ArrayList<Table> getAllTables() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("files/tables"))) {
            return (ArrayList<Table>) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
