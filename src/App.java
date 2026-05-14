import java.util.ArrayList;
import net.salesianos.restaurante.Restaurante;
import net.salesianos.validaciones.Validaciones;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();

        int opcion = 0;

        do {
            System.out.println("\n--- BIENVENIDO A RIPADBAISOR ---");
            System.out.println("1. Añadir restaurante");
            System.out.println("2. Editar restaurante");
            System.out.println("3. Mostrar ranking (descendente)");
            System.out.println("4. Eliminar restaurante");
            System.out.println("5. Salir");

            opcion = Validaciones.leerEntero("Seleccione una opción entre 1 y 5");
            switch (opcion) {
                case 1:
                    System.out.println("\n Nuevo Registro");
                    
                    String nombre = Validaciones.leerTexto("Ingrese el nombre del restaurante");
                    String direccion = Validaciones.leerTexto("Ingrese la dirección del restaurante");
                    String tipoCocina = Validaciones.leerTexto("Ingrese el tipo de cocina del restaurante");
                    double puntuacion = Validaciones.leerDouble("Ingrese la puntuación del restaurante (0.0 - 5.0)");

                    Restaurante nuevoRestaurante = new Restaurante(nombre, direccion, tipoCocina, puntuacion);
                    listaRestaurantes.add(nuevoRestaurante);
                    System.out.println("Restaurante añadido exitosamente");
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
