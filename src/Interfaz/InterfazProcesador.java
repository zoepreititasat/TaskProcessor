package Interfaz;

public interface InterfazProcesador {
    void agregarTarea(String tarea, int prioridad);
    void comenzarTarea();
    boolean completarTarea();
    String []listarTareasEnProgreso();
    String []listarTareasPendientes();
    void inicializarCola();
    void inicializarPila();
}
