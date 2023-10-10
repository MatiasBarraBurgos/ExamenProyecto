package examenproyecto;

public abstract class Pregunta {
    private int peso;
    private String text;

    public Pregunta(String text, int peso) {
        this.text = text;
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public abstract boolean buscar();

    public String getText() {
        return text;
    }
}

//Contiene una variable peso para representar el peso de la pregunta, así como una variable text para el texto de la pregunta. El texto de la pregunta se establece a través del constructor y no se puede cambiar posteriormente.
//Se le aplica el métodoabstracto buscar() que permite a las subclases implementar su propia lógica para buscar la respuesta y determinar si es correcta. 
//Esta función imprime un mensaje que indica si la respuesta es correcta o no.

