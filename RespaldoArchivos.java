import java.util.Scanner;

public class RespaldoArchivos {

    public static boolean faltanArchivos(int respaldados) {
        return respaldados < 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respaldados = 0;

        while (faltanArchivos(respaldados)) {
            System.out.println("\n1. Respalda un archivo");
            System.out.println("2. Ver avance");
            System.out.println("3. Cancelar");
            System.out.print("Elige una opción: ");
            
            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                respaldados = respaldados + 1;
                System.out.println("Archivos respaldados: " + respaldados);
                
                if (respaldados == 5) {
                    System.out.println("Respaldo listo");
                }
                
            } else if (opcion.equals("2")) {
                System.out.println("Se han respaldado " + respaldados + " archivos");
                continue;
                
            } else if (opcion.equals("3")) {
                System.out.println("Respaldo cancelado");
                break;
                
            } else {
                System.out.println("Opción no válida");
            }
        }
        
        sc.close();
    }
}
