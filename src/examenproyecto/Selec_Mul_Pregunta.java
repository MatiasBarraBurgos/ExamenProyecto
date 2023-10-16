package examenproyecto;

import java.util.Scanner;

public abstract class Selec_Mul_Pregunta extends Pregunta {
private String[] elecciones; // Array para almacenar las opciones
    private int respuestaCorrecta; // Índice de la respuesta correcta en el array de elecciones
    private boolean respondida; // Variable para controlar si la pregunta ha sido respondida

    // Constructor de la clase Selec_Mul_Pregunta
    public Selec_Mul_Pregunta(String text, int puntaje, String[] elecciones, int respuestaCorrecta, int par3) {
        super(text, puntaje);
        this.elecciones = elecciones;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respondida = false;
    }

    // Método para buscar la respuesta a la pregunta de selección múltiple
    @Override
    public boolean buscar() {
        if (respondida) {
            System.out.println("Pregunta previamente respondida incorrectamente.");
            return false;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.getText());
        // Imprimir las opciones disponibles
        for (int i = 0; i < elecciones.length; i++) {
            System.out.println((char) ('a' + i) + ") " + elecciones[i]);
        }
        // Obtener la respuesta del usuario
        String respuestaUsuario = scanner.nextLine();
        char opcion = respuestaUsuario.toLowerCase().charAt(0);
        // Verificar si la opción seleccionada es válida y si es correcta
        if (opcion >= 'a' && opcion < 'a' + elecciones.length) {
            if (opcion - 'a' == respuestaCorrecta) {
                System.out.println("Respuesta correcta.");
                respondida = true;
                return true;
            } else {
                System.out.println("Respuesta incorrecta.");
                respondida = true;
                return false;
            }
        } else {
            System.out.println("Opción inválida. La respuesta se considera incorrecta.");
            respondida = true;
            return false;
        }
    }
}



