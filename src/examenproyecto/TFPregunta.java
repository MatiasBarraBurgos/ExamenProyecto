package examenproyecto;

import java.util.Scanner;

public class TFPregunta extends Pregunta {
    private boolean respuestaCorrecta;

    public TFPregunta(String text, int puntaje, boolean respuestaCorrecta) {
        super(text, puntaje);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public boolean buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.print(getText());
        String respuesta = sc.nextLine();
        boolean respuestaBool = respuesta.equalsIgnoreCase("t");
        if (respuestaBool == respuestaCorrecta) {
            System.out.println("Correcto máquina!");
            return true;
        } else {
            System.out.println("Incorrecto...");
            return false;
        }
    }
}
