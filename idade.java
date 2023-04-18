import java.util.Scanner;

class idade{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    int idade;


    //Entrada
    entrada = new Scanner(System.in);
    System.out.println("Digite sua idade ");
    idade = entrada.nextInt ();
    entrada.close ();

    //Saída
    System.out.printf("Parabéns! Você tem %d anos \n", idade);

    if (idade >= 18)

    {
        System.out.printf ("Você é maior de idade.");
    }
    
    }
}

