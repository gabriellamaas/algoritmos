import java.util.Scanner;

class triangulo{
public static void main(String[] args){
    //Variaveis
    float a, b, c;
    Scanner entrada;


    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Digite um número para a medida A do triângulo: ");
    a = entrada.nextFloat ();
    System.out.print("Digite um número para a medida B do triângulo: ");
    b = entrada.nextFloat ();
    System.out.print("Digite um número para a medida C do triângulo: ");
    c = entrada.nextFloat ();
    entrada.close ();

    //if (a>= b+c) {
    //   System.out.printf("Não forma triângulo.");
    //}

   // if (b>= a+c) {
   //     System.out.printf("Não forma triângulo.");
   // }

   // if (c>= a+b) {
    //    System.out.printf("Não forma triângulo.");
    //}

   // else System.out.printf("Pode formar um triângulo."); {
    //}

    if ((a>b+c) || (b>a+c) || (c>b+a)) {
        System.out.printf("Não forma triângulo.");
    }

    else System.out.printf("Pode formar um triângulo."); {
    }
    
    }
}

