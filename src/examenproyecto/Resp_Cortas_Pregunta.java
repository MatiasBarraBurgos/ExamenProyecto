package examenproyecto;

import java.util.Scanner;

public class Resp_Cortas_Pregunta extends Pregunta {
    private final String respuestaCorrecta;

    public Resp_Cortas_Pregunta(String text, int puntaje, String respuestaCorrecta) {
        super(text, puntaje);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
   public boolean buscar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(this.getText());
            String respuestaUsuario = scanner.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
                System.out.println("Respuesta correcta crack.");
                return true;
            } else {
                System.out.println("UHM PARA LA PROXIMA...INCORRECTO");
            }
        }
    }
}