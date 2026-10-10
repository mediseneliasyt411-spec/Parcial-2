import java.util.Scanner;

/**
 * TAREA (ARRAYS): CLASIFICACIÓN DE BASES DE DATOS
 * Versión Java.
 *
 * Recorre un arreglo de sistemas, solicita una clasificación,
 * guarda las respuestas en otro arreglo y muestra el resumen.
 */
public class TareaArrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] sistemas = {
            "PostgreSQL",
            "MongoDB",
            "InfluxDB",
            "MySQL",
            "Redis",
            "Prometheus",
            "SAP HANA",
            "Cassandra",
            "Oracle",
            "OpenTSDB"
        };

        String[] clasificaciones = {
            "Relacional",
            "No relacional",
            "Series temporales"
        };

        String[] respuestas = new String[sistemas.length];

        System.out.println("CLASIFICACIÓN DE BASES DE DATOS");
        System.out.println("Opciones: 1. Relacional | 2. No relacional | 3. Series temporales");

        for (int i = 0; i < sistemas.length; i++) {
            System.out.println("\nSistema: " + sistemas[i]);
            int opcion;

            while (true) {
                System.out.println("1. Relacional");
                System.out.println("2. No relacional");
                System.out.println("3. Series temporales");
                System.out.print("Escribe el número de clasificación: ");

                if (entrada.hasNextInt()) {
                    opcion = entrada.nextInt();
                    if (opcion >= 1 && opcion <= 3) {
                        respuestas[i] = clasificaciones[opcion - 1];
                        break;
                    }
                } else {
                    entrada.next(); // Descarta la entrada que no es número.
                }

                System.out.println("Opción no válida. Escribe 1, 2 o 3.");
            }
        }

        System.out.println("\n===== RESUMEN DE CLASIFICACIÓN =====");
        for (int i = 0; i < sistemas.length; i++) {
            System.out.println(sistemas[i] + ": " + respuestas[i]);
        }

        entrada.close();
    }
}
