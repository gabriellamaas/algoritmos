import java.util.Scanner;

class Cubo{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    int valor, cubo;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Digite um número: ");
    valor = entrada.nextInt ();
    entrada.close ();

    cubo = valor*valor*valor;
    
    //Saída
    System.out.printf("%d ao cubo é %d\n\n\n", valor, cubo);
    }
}

