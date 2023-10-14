package examenproyecto;

import examenproyecto.Pregunta;
import java.util.Scanner;

public class TFPregunta extends Pregunta {
    private boolean respuestaCorrecta;

    // Constructor que crea una pregunta verdadero/falso
    public TFPregunta(String texto, int peso, boolean verdadero) {
        super(texto, peso); // Llama al constructor de la clase base (Pregunta)
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Método para buscar la respuesta del usuario
    @Override
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Respuesta (T/F): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("t") || respuesta.equals("f")) {
                // Convierte la respuesta del usuario en un valor booleano
                boolean respuestaUsuario = respuesta.equals("t");
                // Compara la respuesta del usuario con la respuesta correcta
                boolean esCorrecta = respuestaUsuario == respuestaCorrecta;
                // Muestra un mensaje indicando si la respuesta es correcta o no
                System.out.println(esCorrecta ? "Respuesta correcta." : "Respuesta incorrecta.");
                return esCorrecta; // Devuelve si la respuesta es correcta o no
            } else {
                System.out.println("Respuesta no válida. Debe ingresar 'T' o 'F'.");
                System.out.print("¿Desea intentarlo de nuevo? (Sí/No): ");
                String intentarDeNuevo = scanner.nextLine().trim().toLowerCase();
                if (!intentarDeNuevo.equals("sí") && !intentarDeNuevo.equals("si")) {
                    // Si el usuario no quiere intentarlo de nuevo, se detiene el examen
                    System.out.println("Stop. Debe estudiar o comenzar un nuevo examen.");
                    return false; // El usuario respondió incorrectamente
                }
            }
        }
    }
}

//El método buscar()permite al usuario responder preguntas verdadero/falso. 
//Se le agregó una verificación si la respuesta es "t" o "T" para verdadero, o "f" o "F" para falso.
//Si el usuario ingresa una respuesta incorrecta, se le pedirá que lo intente nuevamente o detenga el examen.
//La respuesta correcta se compara con la respuesta del usuario y se muestra un mensaje si la respuesta está bien  o mal.