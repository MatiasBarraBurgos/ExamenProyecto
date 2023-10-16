package examenproyecto;


public class ExamDemo {
 public static void main(String[] args) {
        // Crear un examen y agregar preguntas
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
    }
}





