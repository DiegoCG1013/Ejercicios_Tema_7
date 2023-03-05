package Ejercicio_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadricula {
    private char[][] cuadricula = new char[10][10];


    public Cuadricula() {
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                cuadricula[i][j] = '*';
            }
        }
    }

    public void colocarBarco(int x, int y){
            cuadricula[x][y] = 'b';
    }

    public boolean disparar(int x, int y){
        if (cuadricula[x][y] == 'b'){
            cuadricula[x][y] = 'B';
            return true;
        }else{
            cuadricula[x][y] = 'O';
            return false;
        }
    }
    public void visualizacion(){
        for (char[] chars : cuadricula) {
            for (char x : chars) {
                if (x != 'b') System.out.print(x + " ");
                else System.out.print('*' + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuadricula cuadricula = new Cuadricula();
        cuadricula.visualizacion();
        boolean bucle = true;
        cuadricula.colocarBarco((int)(Math.random() * 10), (int)(Math.random() * 10));
        System.out.println("Barco colocado");
        try {
            do {
                System.out.println("¿Donde quieres disparar? (Coordenada X)");
                int x = sc.nextInt();
                System.out.println("¿Donde quieres disparar? (Coordenada Y)");
                int y = sc.nextInt();
                if (cuadricula.disparar(x, y)) {
                    System.out.println("Has hundido un barco");
                    bucle = false;
                } else {
                    System.out.println("Agua");
                }
                cuadricula.visualizacion();
            }while (bucle);
        }catch (InputMismatchException e){
            System.out.println("No has introducido un numero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No has introducido un numero entre 0 y 9");
        }
    }
}
