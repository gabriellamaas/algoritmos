import java.util.Scanner;

public class Pares {
    public static void main(String[] args){
    int valor;
    Scanner entrada = new Scanner (System.in);

    System.out.println ("Entre com valores inteiros. Digite 0 para parar");

    valor = entrada.nextInt();

    while(valor != 0){

        if (valor%2==0) {
            System.out.println ("Par");
        }
        else {
            System.out.println ("Impar");
        }
        valor = entrada.nextInt();
    }

    entrada.close();

    }
}
