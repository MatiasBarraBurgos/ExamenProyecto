package examenproyecto;

import java.util.Scanner;

 public class Exam {
  private final Pregunta[] preguntas;
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
        for (int i = 0; i < numPreguntas; i++) {
            totalPuntos += preguntas[i].getPuntaje();
        }

        int puntosObtenidos = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numPreguntas; i++) {
            puntosObtenidos += preguntas[i].buscar() ? preguntas[i].getPuntaje() : 0;
        }

        float porcentaje = ((float) puntosObtenidos / totalPuntos) * 100;
        System.out.println("Porcentaje de respuestas correctas: " + porcentaje + "%");
        System.out.println("Puntaje obtenido: " + puntosObtenidos + "/" + totalPuntos);
        
        if (porcentaje >= 28) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

      scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre para el registro: ");
        String nombreUsuario = scanner.nextLine();
        RegistroResultados.guardarResultado(nombreUsuario, porcentaje);
    }
 public void reiniciar() {
        for (int i = 0; i < numPreguntas; i++) {
            preguntas[i].reiniciar();
        }
    }
 }
