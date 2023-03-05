package Ejercicio_4;

public class Cuadricula {
    private char[][][] cuadricula = new char[2][10][10];


    public Cuadricula() {
        for (int i = 0; i < cuadricula.length; i++) {
            for (int j = 0; j < cuadricula[i].length; j++) {
                for (int k = 0; k < cuadricula[i][j].length; k++) {
                    cuadricula[i][j][k] = '*';
                }
            }
        }
    }

    public void colocarBarcoPersona(int x, int y){
            cuadricula[0][x][y] = 'b';
    }
    public void colocarBarcoMaquina(){
        cuadricula[1][(int) (Math.random()*10)][(int) (Math.random()*10)] = 'b';
    }

    public boolean dispararPersona(int x, int y){
        if (cuadricula[1][x][y] == 'b'){
            cuadricula[1][x][y] = 'B';
            return true;
        }else{
            cuadricula[1][x][y] = 'O';
            return false;
        }
    }
    public boolean dispararMaquina(){
        boolean bucle = true;
        while (true) {
            int x = (int) (Math.random()*10);
            int y = (int) (Math.random()*10);
            if (cuadricula[0][x][y] == 'b'){
                cuadricula[0][x][y] = 'B';
                return true;
            }else if (cuadricula[0][x][y] == '*'){
                cuadricula[0][x][y] = 'O';
                return false;
            }
        }
    }
    public void visualizacionPersona(){
        System.out.println("--Tu cuadricula--");
        for (char[] chars : cuadricula[0]) {
            for (char x : chars) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public void visualizacionMaquina(){
        System.out.println("--Cuadricula de la maquina--");
        for (char[] chars : cuadricula[1]) {
            for (char x : chars) {
                if (x != 'b') System.out.print(x + " ");
                else System.out.print('*' + " ");
            }
            System.out.println();
        }
    }
}
