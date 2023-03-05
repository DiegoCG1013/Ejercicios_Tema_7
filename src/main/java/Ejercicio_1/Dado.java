package Ejercicio_1;

public class Dado {
    private int caras;
    private int ultimoValor;

    public Dado(int caras) {
        this.caras = caras;
    }

    public Dado() {
        caras = 6;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public int getUltimoValor() {
        return ultimoValor;
    }

    public void Tirar() {
        ultimoValor = (int) (Math.random() * caras + 1);
    }

    public static void main(String[] args) {
        Dado dado6 = new Dado(6);
        Dado dado10 = new Dado(10);
        Dado dado12 = new Dado(12);
        do{
            dado6.Tirar();
            dado10.Tirar();
            dado12.Tirar();
        }while(dado6.getUltimoValor() + dado10.getUltimoValor() + dado12.getUltimoValor() >= 20);

    }
}
