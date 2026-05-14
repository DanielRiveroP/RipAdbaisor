package net.salesianos.validaciones;

import java.util.Scanner;

public class Validaciones {

    private static Scanner sc = new Scanner(System.in);

    public static double leerDouble(String mensaje) {
        double numero = 0;
        boolean valido = false;
        do {
            try {
                System.out.println(mensaje);
                numero = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número (puedes usar decimales con punto).");
            }
        } while (!valido);
        return numero;
    }

    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        do {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero.");
            }
        } while (!valido);

        return numero;
    }

    public static double leerPuntuacion() {
        double nota;
        do {
            nota = leerDouble("Introduce la puntuación (del 1.0 al 5.0):");
            if (nota < 1 || nota > 5) {
                System.out.println("La puntuación debe estar entre 1 y 5.");
            }
        } while (nota < 1 || nota > 5);
        return nota;
    }

    public static String leerTexto(String mensaje) {
        String texto = "";
        do {
            System.out.println(mensaje);
            texto = sc.nextLine().trim();
            if (texto.isEmpty()) {
                System.out.println("Este campo no puede estar vacío.");
            }
        } while (texto.isEmpty());
        
        return texto;
    }           
}
