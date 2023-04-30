import java.util.Scanner;

class Cubo{
public static void main(String[] args){
    //Variaveis
    int n, cubo;
    Scanner entrada;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Digite um número: ");
    n = entrada.nextInt();
    entrada.close ();

    cubo = n*n*n;

    //Saída
    System.out.printf("O nome que você digitou ao cubo é: %d \n", cubo);
    }
}

