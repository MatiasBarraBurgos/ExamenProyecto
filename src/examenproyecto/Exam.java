
package examenproyecto;

import java.util.Scanner;

 public class Exam {
  private Pregunta[] preguntas;
    private int numPreguntas;

    public Exam() {
        this.preguntas = new Pregunta[12];
        this.numPreguntas = 0;
    }

    public void agregaPregunta(Pregunta pregunta) {
        if (numPreguntas < 12) {
            preguntas[numPreguntas] = pregunta;
            numPreguntas++;
        } else {
            System.out.println("Se alcanzó el límite máximo de preguntas en el examen.");
        }
    }

    public void darExam() {
        int totalPuntos = 0;
        int puntosObtenidos = 0;
        for (Pregunta pregunta : preguntas) {
            totalPuntos += pregunta.getPuntaje();
            if (pregunta.buscar()) {
                puntosObtenidos += pregunta.getPuntaje();
            }
        }
        double porcentaje = ((double) puntosObtenidos / totalPuntos) * 100;
        System.out.format("Porcentaje obtenido: %.0f%% (%d/%d)%n", porcentaje, puntosObtenidos, totalPuntos);
    }
}
