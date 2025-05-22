import Implementacion.ProcesadorTareas;
import Interfaz.InterfazProcesador;

public class Main {
    public static void main(String[] args) {
        InterfazProcesador procesador = new ProcesadorTareas();

        // Inicializar estructuras
        procesador.inicializarCola();
        procesador.inicializarPila();

        // Agregar tareas
        procesador.agregarTarea("Tarea A", 5);
        procesador.agregarTarea("Tarea B", 1);
        procesador.agregarTarea("Tarea C", 1);
        procesador.agregarTarea("Tarea D", 2);
        procesador.agregarTarea("Tarea E", 4);
        procesador.agregarTarea("Tarea F", 8);

        // Mostrar tareas pendientes
        System.out.println("Tareas Pendientes:");
        for (String t : procesador.listarTareasPendientes()) {
            if (t != null) System.out.println(t);
        }

        // Comenzar una tarea
        procesador.comenzarTarea();
        procesador.comenzarTarea();
        procesador.comenzarTarea();
        procesador.comenzarTarea();

        // Mostrar tareas en progreso
        System.out.println("\nTareas en Progreso:");
        for (String t : procesador.listarTareasEnProgreso()) {
            if (t != null) System.out.println(t);
        }


        System.out.println("\nTareas en Progreso antes completar:");
        for (String t : procesador.listarTareasEnProgreso()) {
            if (t != null) System.out.println(t);
        }

        // Completar tarea
        procesador.completarTarea();

        // Ver pila después de completar
        System.out.println("\nTareas en Progreso después de completar:");
        for (String t : procesador.listarTareasEnProgreso()) {
            if (t != null) System.out.println(t);
        }
    }
}
