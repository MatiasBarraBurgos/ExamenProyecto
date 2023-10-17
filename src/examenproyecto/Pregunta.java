package examenproyecto;

public abstract class Pregunta { 
private int puntaje;
    private final String text;

    public Pregunta(String text, int puntaje) {
        this.text = text;
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getText() {
        return text;
    }

    public abstract boolean buscar();

    boolean esCorrecta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }