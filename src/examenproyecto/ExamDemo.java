package examenproyecto;


public class ExamDemo {
 public static void main(String[] args) {
        Exam examen = new Exam();
        examen.agregaPregunta(new TFPregunta("El fútbol se juega con una pelota redonda. (verdadero/falso): ", 3, true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Cuántos jugadores hay en un equipo de fútbol estándar?", 2,
                new String[]{"10", "11", "12", "9"}, 1) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿En qué país se inventó el fútbol? ", 2, "Inglaterra"));
        examen.agregaPregunta(new TFPregunta("Un partido de fútbol dura 90 minutos. (verdadero/falso): ", 2, true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Qué país ha ganado más Copas del Mundo de la FIFA?", 2,
                new String[]{"Brasil", "Alemania", "Argentina", "Italia"}, 0) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿Cómo se llama el trofeo de la UEFA Champions League? ", 2, "Copa de Europa"));
        examen.agregaPregunta(new TFPregunta("La Copa del Mundo de la FIFA se celebra cada 4 años. (verdadero/falso): ", 2, true));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿En qué año se fundó la FIFA?", 2,
                new String[]{"1904", "1906", "1910", "1914"}, 0) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿Cuál es el estadio más grande del mundo en capacidad? ", 3, "Estadio Rungrado May Day"));
        examen.agregaPregunta(new TFPregunta("El jugador de fútbol con más goles anotados en la historia es Pelé. (verdadero/falso): ", 2, false));
        examen.agregaPregunta(new Selec_Mul_Pregunta("¿Quién ganó el Balón de Oro en 2020?", 2,
                new String[]{"Lionel Messi", "Cristiano Ronaldo", "Robert Lewandowski", "Neymar Jr."}, 2) {});
        examen.agregaPregunta(new Resp_Cortas_Pregunta("¿En qué año se fundó el Real Madrid Club de Fútbol? ", 2, "1902"));
     
        examen.darExam();
    }
}





