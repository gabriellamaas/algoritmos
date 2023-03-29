import java.util.Scanner;

class nome{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    String nome;
    Int idade;
    Float altura;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Seu nome: ");
    nome = entrada.next();
    System.out.print("Sua idade: ");
    idade = entrada.nextInt();
    System.out.print("Sua altura: ");
    altura = entrada.nextFloat();
    
    entrada.close ();


    //Saída
    System.out.printf("Boa noite, %s \n", nome);
    System.out.printf("Sua idade é:, %d \n", idade);
    System.out.printf("Sua altura é: %f \n", altura);


    }
}

