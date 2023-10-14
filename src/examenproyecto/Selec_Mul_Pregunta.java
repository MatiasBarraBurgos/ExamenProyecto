package examenproyecto;

import java.util.Scanner;

public abstract class Selec_Mul_Pregunta extends Pregunta {
private String[] elecciones;
    private int respuestaCorrecta;

    public Selec_Mul_Pregunta(String text, int puntaje, String[] elecciones, int respuestaCorrecta) {
        super(text, puntaje);
        this.elecciones = elecciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(this.getText());
            for (int i = 0; i < elecciones.length; i++) {
                System.out.println((char) ('a' + i) + ") " + elecciones[i]);
            }
            String respuestaUsuario = scanner.nextLine();
            char opcion = respuestaUsuario.toLowerCase().charAt(0);
            if (opcion >= 'a' && opcion < 'a' + elecciones.length) {
                if (opcion - 'a' == respuestaCorrecta) {
                    System.out.println("Respuesta correcta.");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta. Por favor, inténtelo de nuevo.");
                }
            } else {
                System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }
        }
    }
}




