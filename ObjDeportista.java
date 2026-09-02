public class ObjDeportista {
    String Nombre;
    int NumeroParticipante;
    Double TiempoObtenido;
    
    public ObjDeportista(String nombre, int numeroParticipante, Double tiempoObtenido) {
        Nombre = nombre;
        NumeroParticipante = numeroParticipante;
        TiempoObtenido = tiempoObtenido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNumeroParticipante() {
        return NumeroParticipante;
    }

    public void setNumeroParticipante(int numeroParticipante) {
        NumeroParticipante = numeroParticipante;
    }

    public Double getTiempoObtenido() {
        return TiempoObtenido;
    }

    public void setTiempoObtenido(Double tiempoObtenido) {
        TiempoObtenido = tiempoObtenido;
    }
    
}
