# ExamenProyecto
Proyecto Examen G4

Pregunta :
La clase abstracta Pregunta sirve como la base para todos los tipos de preguntas en el programa. Contiene métodos para obtener el texto y el puntaje de una pregunta, así como un método abstracto buscar() para ser implementado por las clases hijas.

TFPregunta :
La clase TFPregunta representa preguntas de opción verdadero/falso en el examen. Almacena la respuesta correcta y compara la respuesta del usuario con la respuesta correcta para determinar si la respuesta es correcta o no.

Resp_Cortas_Pregunta :
La clase Resp_Cortas_Pregunta gestiona preguntas de respuestas cortas en el examen. Compara la respuesta del usuario con la respuesta esperada, ignorando mayúsculas y minúsculas, para determinar si la respuesta es correcta.

Selec_Mul_Pregunta :
La clase Selec_Mul_Pregunta maneja preguntas de opción múltiple en el examen. Permite al usuario elegir entre varias opciones y compara la respuesta seleccionada con la respuesta correcta para determinar si la respuesta es correcta.

Exam :
La clase Exam administra un conjunto de preguntas para un examen dado. Permite agregar preguntas al examen y calcular el puntaje total y el porcentaje obtenido después de que el usuario responde a todas las preguntas.

ExamDemo
La clase ExamDemo contiene el método main que ejecuta el programa. Crea un examen y agrega preguntas de futbol (nuestra eleccíon). Luego, realiza el examen y muestra el porcentaje obtenido y el puntaje total al usuario.
