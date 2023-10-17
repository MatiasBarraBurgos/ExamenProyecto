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
            System.out.println("Correcto!");
            return true;
        } else {
            System.out.println("Incorrecto.");
            return false;
        }
    }
}
//El método buscar()permite al usuario responder preguntas verdadero/falso. 
//Se le agregó una verificación si la respuesta es "t" o "T" para verdadero, o "f" o "F" para falso.
//Si el usuario ingresa una respuesta incorrecta, se le pedirá que lo intente nuevamente o detenga el examen.
//La respuesta correcta se compara con la respuesta del usuario y se muestra un mensaje si la respuesta está bien  o mal.