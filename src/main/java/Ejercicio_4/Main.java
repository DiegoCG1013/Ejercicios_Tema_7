package Ejercicio_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Cuadricula cuadricula = new Cuadricula();
            cuadricula.visualizacionPersona();
            System.out.println("Donde quieres colocar el barco? (Coordenada X)");
            int x = sc.nextInt();
            System.out.println("Donde quieres colocar el barco? (Coordenada Y)");
            int y = sc.nextInt();
            cuadricula.colocarBarcoPersona(x, y);
            cuadricula.colocarBarcoMaquina();
            System.out.println("Barco de la maquina colocado");
            cuadricula.visualizacionMaquina();
            boolean bucle = true;
            do {
                System.out.println("¿Donde quieres disparar? (Coordenada X)");
                x = sc.nextInt();
                System.out.println("¿Donde quieres disparar? (Coordenada Y)");
                y = sc.nextInt();
                if (cuadricula.dispararPersona(x, y)) {
                    System.out.println("Has hundido un barco\n¡Has ganado!");
                    bucle = false;
                } else {
                    System.out.println("Agua");
                    System.out.println("Turno de la maquina");
                    if (cuadricula.dispararMaquina()) {
                        System.out.println("La maquina ha hundido un barco\nTu pierdes");
                        bucle = false;
                    } else {
                        System.out.println("La maquina ha fallado");
                        cuadricula.visualizacionPersona();
                        System.out.println("Tu turno");
                        cuadricula.visualizacionMaquina();
                    }
                }
            }while (bucle);
        }catch (InputMismatchException e){
            System.out.println("No has introducido un numero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No has introducido un numero entre 0 y 9");
        }
    }
}
