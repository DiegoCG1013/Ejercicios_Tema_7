package Ejercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    private String name;
    private int num;

    public Cliente(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        boolean bucle = true;
        int contador = 1;
        do {
            System.out.println("-- Menú --\n" + "\n" + "1 - Mostrar clientes\n" + "\n" +
                    "2 - Crear un cliente\n" + "\n" + "3 - Salir");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Clientes: ");
                    for (Cliente x : clientes) System.out.println("Cliente " + x.num + " - " + x.name);
                    break;
                case "2":
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = sc.nextLine();
                    clientes.add(new Cliente(nombre, contador));
                    break;
                case "3":
                    bucle = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        } while (bucle);

    }
}
