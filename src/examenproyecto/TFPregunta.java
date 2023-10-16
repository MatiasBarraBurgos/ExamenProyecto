package examenproyecto;

import examenproyecto.Pregunta;
import java.util.Scanner;

public class TFPregunta extends Pregunta {
    private final boolean respuestaCorrecta; // Variable para almacenar la respuesta correcta

    // Constructor de la clase TFPregunta
    public TFPregunta(String text, int puntaje, boolean respuestaCorrecta) {
        super(text, puntaje);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Método para buscar la respuesta a la pregunta de verdadero o falso
    @Override
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(this.getText()); // Imprimir la pregunta
            // Obtener la respuesta del usuario
            String respuestaUsuario = scanner.nextLine();
            // Verificar si la respuesta del usuario es verdadera o falsa
            if (respuestaUsuario.equalsIgnoreCase("t") || respuestaUsuario.equalsIgnoreCase("f")) {
                boolean respuesta = respuestaUsuario.equalsIgnoreCase("t");
                // Verificar si la respuesta del usuario es correcta
                if (respuesta == respuestaCorrecta) {
                    System.out.println("Respuesta correcta.");
                    return true;
                } else {
                    System.out.println("Respuesta incorrecta, PARA LA PRÓXIMA SERÁ.");
                    return false;
                }
            } else {
                System.out.println("Respuesta inválida. Por favor, ingrese 't' o 'f'.");
            }
        }
    }
}


//El método buscar()permite al usuario responder preguntas verdadero/falso. 
//Se le agregó una verificación si la respuesta es "t" o "T" para verdadero, o "f" o "F" para falso.
//Si el usuario ingresa una respuesta incorrecta, se le pedirá que lo intente nuevamente o detenga el examen.
//La respuesta correcta se compara con la respuesta del usuario y se muestra un mensaje si la respuesta está bien  o mal.