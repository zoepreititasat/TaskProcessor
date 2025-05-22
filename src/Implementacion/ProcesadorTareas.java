package Implementacion;
import Interfaz.InterfazProcesador;
public class ProcesadorTareas implements InterfazProcesador {
    private String [] ColaTareas;
    private static int TamanioCola = 100;
    private String [] PilaTareas;
    int [] Prioridades;
    int indiceCola;
    int indicePila;

    @Override
    public void inicializarCola(){
        ColaTareas = new String[TamanioCola];
        Prioridades = new int[TamanioCola];
        indiceCola = 0;
    }

    @Override
    public void inicializarPila(){
        PilaTareas = new String[TamanioCola];
        indicePila = 0;
    }

    @Override
    public void agregarTarea(String tarea, int prioridad) {
        int i = indiceCola - 1;
        //ordena elementos según su proridad
        while (i >= 0 && Prioridades [i]> prioridad) {
            ColaTareas[i + 1] = ColaTareas[i];
            Prioridades[i + 1] = Prioridades [i];
            i--;
        }
        // Insertar nuevo elemento en la posición correcta
        ColaTareas[i + 1] = tarea;
        Prioridades[i + 1] = prioridad;
        indiceCola++;
    }

    @Override
    public void comenzarTarea() {
        if (indiceCola == 0) return;

        PilaTareas[indicePila] = ColaTareas[0];
        indicePila++;

        for (int i = 1; i < indiceCola; i++) {
            ColaTareas[i - 1] = ColaTareas[i];
            Prioridades[i - 1] = Prioridades[i];
        }

        indiceCola--;
    }

    @Override
    public boolean completarTarea() {
        String tareaCompletada = PilaTareas[0];
        indicePila--;
        for ( int i=0; i<=indicePila; i++){
            PilaTareas[i] = PilaTareas[i+1];
        }
        return true;
    }

    @Override
    public String[] listarTareasEnProgreso() {
        String [] TareasEnProgreso = new String[TamanioCola];
        //sale primero la última que entro (LIFO)
        for (int i = indicePila - 1, j = 0; i >= 0; i--, j++) {
            TareasEnProgreso[j] = PilaTareas[i];
        }
        return TareasEnProgreso;
    }

    @Override
    public String[] listarTareasPendientes() {
        String [] TareasPendientes = new String[TamanioCola];
        //sale primero la primera que entro (FIFO)
        for (int i = indiceCola - 1, j = 0; i >= 0; i--, j++) {
            TareasPendientes[j] = ColaTareas[i];
        }
        return TareasPendientes;
    }
}
