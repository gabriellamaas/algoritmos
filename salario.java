import java.util.Scanner;

class salario{
public static void main(String[] args){
    //Variaveis
    double aumento_porcentagem,salario_original, salario_final, aumento;
    Scanner entrada;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Digite seu salário: ");
    salario_original = entrada.nextFloat();
    System.out.print("Digite a porcentagem de aumento: ");
    aumento_porcentagem = entrada.nextFloat();
    entrada.close ();

    aumento = salario_original * (aumento_porcentagem * 0.01 );
    salario_final = aumento + salario_original;

    //Saída
    System.out.printf("Este é seu novo salário com o aumento %.2f", salario_final);
    }
}

