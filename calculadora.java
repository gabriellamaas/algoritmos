import java.util.Scanner;

class calculadora{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    float a,b;
    String op;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.println("Digite a: ");
    a = entrada.nextFloat();
    System.out.println("Digite b: ");
    b = entrada.nextFloat();
    System.out.println("Digite a operação (+, -, * ou /): ");
    op = entrada.next();
    entrada.close ();

    if (op.equals("+")){
        System.out.printf("%.2f+%.2f=%.2f\n", a, b, a+b);
    }
    if (op.equals("-")){
        System.out.printf("%.2f-%.2f=%.2f\n", a, b, a-b);
    }
    if (op.equals("*")){
        System.out.printf("%.2f*%.2f=%.2f\n", a, b, a*b);
    }
    if (op.equals("/")){
        System.out.printf("%.2f/%.2f=%.2f\n", a, b, a/b);
    }

   if (!op.equals ("+") && !op.equals ("-") && !op.equals ("*") && !op.equals ("/")); 
   System.out.println ("Operador inválido");{
   }


    //Saída
    //System.out.printf("Você digitou: %d \n", n);
    //System.out.println ("Hello World");
    }
}

