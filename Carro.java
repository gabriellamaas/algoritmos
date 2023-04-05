import java.util.Scanner;

class Carro{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    int dias;
    float ct, km;


    //Entrada
    entrada = new Scanner(System.in);
    System.out.println("Quantos km o carro percorreu?: ");
    km = entrada.nextFloat ();
    System.out.println("Por quantos dias foi alugado?: ");
    dias = entrada.nextInt();
    entrada.close ();

    //Processamento

    ct = dias*60+km*(float)0.15;

    //Saída
    System.out.printf("O custo total do aluguel foi de: %.2f \n", ct);
    }
}

