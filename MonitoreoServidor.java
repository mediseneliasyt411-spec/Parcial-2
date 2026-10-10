import java.util.Scanner;

public class MonitoreoServidor {

    public static double leerPorcentaje(String nombre, Scanner sc) {
        System.out.print("Ingrese el porcentaje de " + nombre + ": ");
        return sc.nextDouble();
    }

    public static String evaluarProcesador(double porcentaje) {
        if (porcentaje <= 70) {
            return "Estado normal";
        } else if (porcentaje <= 85) {
            return "Requiere supervisión";
        } else {
            return "Estado crítico";
        }
    }

    public static String evaluarMemoria(double porcentaje) {
        if (porcentaje <= 75) {
            return "Estado normal";
        } else if (porcentaje <= 85) {
            return "Requiere supervisión";
        } else {
            return "Estado crítico";
        }
    }

    public static String evaluarAlmacenamiento(double porcentaje) {
        if (porcentaje <= 75) {
            return "Estado normal";
        } else if (porcentaje <= 85) {
            return "Requiere supervisión";
        } else {
            return "Estado crítico";
        }
    }

    public static String evaluarServidor(String estadoProc, String estadoMem, String estadoAlm) {
        if (estadoProc.equals("Estado crítico") || estadoMem.equals("Estado crítico") || estadoAlm.equals("Estado crítico")) {
            return "Estado crítico";
        } else if (estadoProc.equals("Requiere supervisión") || estadoMem.equals("Requiere supervisión") || estadoAlm.equals("Requiere supervisión")) {
            return "Requiere supervisión";
        } else {
            return "Estado normal";
        }
    }

    public static void mostrarResultados(double proc, String estadoProc,
                                         double mem, String estadoMem,
                                         double alm, String estadoAlm,
                                         String estadoServidor) {
        System.out.println("Procesador: " + (int)proc + "% — " + estadoProc);
        System.out.println("Memoria RAM: " + (int)mem + "% — " + estadoMem);
        System.out.println("Almacenamiento: " + (int)alm + "% — " + estadoAlm);
        System.out.println("Estado del servidor: " + estadoServidor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Monitoreo de un servidor");

        double porcentajeProc = leerPorcentaje("procesador", sc);
        double porcentajeMem = leerPorcentaje("memoria RAM", sc);
        double porcentajeAlm = leerPorcentaje("almacenamiento", sc);

        String estadoProc = evaluarProcesador(porcentajeProc);
        String estadoMem = evaluarMemoria(porcentajeMem);
        String estadoAlm = evaluarAlmacenamiento(porcentajeAlm);
        String estadoServidor = evaluarServidor(estadoProc, estadoMem, estadoAlm);

        mostrarResultados(porcentajeProc, estadoProc, porcentajeMem, estadoMem, porcentajeAlm, estadoAlm, estadoServidor);

        sc.close();
    }
}
