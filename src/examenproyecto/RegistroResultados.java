package examenproyecto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


class RegistroResultados {
    public static void guardarResultado(String nombre, float porcentaje) {
        try {
            FileWriter fileWriter = new FileWriter("registros.txt", true);
            try (PrintWriter printWriter = new PrintWriter(fileWriter)) {
                printWriter.println(nombre + " - " + porcentaje + "%");
            }
            System.out.println("Resultado guardado correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el resultado en el archivo.");
            e.printStackTrace();
        }
    }
}
