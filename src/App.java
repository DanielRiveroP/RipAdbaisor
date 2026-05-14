import java.util.ArrayList;
import net.salesianos.restaurante.Restaurante;
import net.salesianos.validaciones.Validaciones;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("\n--- BIENVENIDO A RIPADBAISOR ---");
            System.out.println("a. Añadir restaurante");
            System.out.println("b. Editar restaurante");
            System.out.println("c. Mostrar ranking (descendente)");
            System.out.println("d. Eliminar restaurante");
            System.out.println("e. Salir");

            opcion = Validaciones.leerEntero("Seleccione una opción entre 1 y 5");
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Añadir");
                    // Aquí llamaremos a la lógica de añadir en la siguiente rama
                    break;
                case 2:
                    System.out.println("Has elegido: Editar");
                    break;
                case 3:
                    System.out.println("Has elegido: Mostrar");
                    break;
                case 4:
                    System.out.println("Has elegido: Eliminar");
                    break;
                case 5:
                    System.out.println("Saliendo del programa... ¡Gracias!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}
