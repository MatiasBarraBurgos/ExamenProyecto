package examenproyecto;

import java.util.Scanner;

class Resp_Cortas_Pregunta extends Pregunta {
   private final String respuestaCorrecta; // Variable para almacenar la respuesta correcta

    // Constructor de la clase Resp_Cortas_Pregunta
    public Resp_Cortas_Pregunta(String text, int puntaje, String respuestaCorrecta) {
        super(text, puntaje);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Método para buscar la respuesta a la pregunta de respuesta corta
    @Override
    public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.getText()); // Imprimir la pregunta
        // Obtener la respuesta del usuario
        String respuestaUsuario = scanner.nextLine();
        // Verificar si la respuesta del usuario coincide con la respuesta correcta
        if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
            System.out.println("Respuesta correcta.");
            return true;
        } else {
            System.out.println("Respuesta incorrecta.");
            return false;
        }
    }
}
