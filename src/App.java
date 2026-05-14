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
                    if (listaRestaurantes.isEmpty()) {
                        System.out.println("No hay restaurantes para editar.");
                    } else {
                        System.out.println("\n--- EDITAR RESTAURANTE ---");

                        for (int i = 0; i < listaRestaurantes.size(); i++) {
                            System.out.println(i + ". " + listaRestaurantes.get(i).getNombre());
                        }

                        int indice = Validaciones.leerEntero("Introduce el número del restaurante que quieres editar:");

                        if (indice >= 0 && indice < listaRestaurantes.size()) {
                            System.out.println("Editando: " + listaRestaurantes.get(indice).getNombre());

                            String nuevoNombre = Validaciones.leerTexto("Nuevo nombre:");
                            String nuevaDir = Validaciones.leerTexto("Nueva dirección:");
                            String nuevaCocina = Validaciones.leerTexto("Nuevo tipo de cocina:");
                            double nuevaNota = Validaciones.leerPuntuacion();

                            Restaurante r = listaRestaurantes.get(indice);
                            r.setNombre(nuevoNombre);
                            r.setDireccion(nuevaDir);
                            r.setTipoCocina(nuevaCocina);
                            r.setPuntuacion(nuevaNota);

                            System.out.println(">> Registro actualizado correctamente.");
                        } else {
                            System.out.println("Error: Índice no válido.");
                        }
                    }
                    break;
                case 3:
                    if (listaRestaurantes.isEmpty()) {
                        System.out.println("No hay restaurantes para mostrar.");
                    } else {
                        System.out.println("\n--- RANKING DE RESTAURANTES (DESCENDENTE) ---");
                        listaRestaurantes.sort((r1, r2) -> Double.compare(r2.getPuntuacion(), r1.getPuntuacion()));
                        for (Restaurante r : listaRestaurantes) {
                            System.out.println("-----------------------------------");
                            System.out.println("Nombre: " + r.getNombre());
                            System.out.println("Puntuación: " + r.getPuntuacion() + " ⭐");
                            System.out.println("Cocina: " + r.getTipoCocina());
                            System.out.println("Dirección: " + r.getDireccion());
                        }
                    }
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
