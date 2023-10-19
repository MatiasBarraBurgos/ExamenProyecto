package examenproyecto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ExamDemo implements ActionListener {

    private final JFrame frame;
    private final JButton button;

    public ExamDemo() {
        frame = new JFrame("Examen de Futbol");
        button = new JButton("Realizar Examen");
        button.setBounds(50, 100, 200, 40);
        button.addActionListener(this);
        frame.add(button);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ExamDemo examDemo = new ExamDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = """ 
                         Bienvenido al examen de f\u00fatbol. \u00bfLO PODRAS LOGRAR?...
                         Las instrucciones son sencillas. Debes utilizar tu conocimiento en el mundo del f\u00fatbol para responder el siguiente examen, que consta de:
                                         1. Preguntas de verdadero y falso en las que debes responder con 't' o 'f' (true/false). (2pts c/u)
                                         2. Preguntas de selecci\u00f3n m\u00faltiple en las que debes escribir la letra de la alternativa elegida. (2pts c/u)
                                         3. Preguntas r\u00e1pidas en las que debes escribir la alternativa que consideres correcta. (3pts c/u
                         *Al final deberás poner tu nombre y apellido para que se guarden tus resultados.*
                         *Se te dará la opcion de volver a realizar la evaluacíon , selecciona 'yes' si quieres reintentarlo , o 'no' si quieres finalizar.*
                                                                     El examen consta de 28pts \u00a1BUENA SUERTE!""";
        JOptionPane.showMessageDialog(frame, message, "Instrucciones", JOptionPane.INFORMATION_MESSAGE);

        Exam examen = new Exam();
        // Preguntas de verdadero o falso
        examen.agregaPregunta(new TFPregunta("El fútbol se juega con una pelota. (verdadero/falso): ", 2, true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Cuántos jugadores hay en un equipo de fútbol en cancha?", 2,
                new String[]{"10", "11", "12", "9"}, 1, 2) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿En qué país se inventó el fútbol? ", 3, "Inglaterra"));
        examen.agregaPregunta(new TFPregunta("El fútbol se juega con las manos. (verdadero/falso): ", 2, false));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿En qué equipo marcó más goles Lionel Messi?", 2,
                new String[]{"Newell´s Old Boys", "PSG", "Inter de Miami", "FC Barcelona"}, 3, 2) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿Cuál es el país con más Copas del Mundo de la FIFA?", 3, "Brasil"));
        examen.agregaPregunta(new TFPregunta("El fútbol se juega con las piernas. (verdadero/falso): ", 2, true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿En qué país se jugó la primera Copa Mundial de la FIFA en 1930?", 2,
                new String[]{"Uruguay", "Brasil", "Italia", "Alemania"}, 0, 2) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("Año de la primera copa America de la Seleccion Chilena", 3, "2015"));
        examen.agregaPregunta(new TFPregunta("Cristiano Ronaldo tiene 7 balones de oro. (verdadero/falso): ", 2, false));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Qué país ganó la Copa del Mundo de Fútbol Masculino de Qatar 2022?", 2,
                new String[]{"Francia", "Argentina", "Italia", "Alemania"}, 1, 2) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿Cuál es el estadio con más capacidad de Europa?", 3, "Camp Nou"));
        // Realizar el examen
        examen.darExam();
        //añadimos la opción de volver a intentar resolver el exámen
        int opcion = JOptionPane.showConfirmDialog(frame, "¿Desea volver a intentar el examen?", "Confirmar",
                JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            examen.reiniciar();
        } else {
            frame.dispose();
        }
    }
}
    
