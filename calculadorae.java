import java.util.Scanner;

class calculadorae{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    float a,b,result;
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

    switch (op){
        case "+":
            result = a+b;
            System.out.printf("%.2f+%.2f=%.2f\n", a, b, result);
            break;
        case "-":
            result = a-b;
            System.out.printf("%.2f-%.2f=%.2f\n", a, b, result);
            break;
        case "*":
            result = a*b;
            System.out.printf("%.2f*%.2f=%.2f\n", a, b, result);
            break;
        case "/":
            result = a/b;
            System.out.printf("%.2f/%.2f=%.2f\n", a, b, result);
            break;
        default:
        System.out.printf("Operação inválida");
    }
    }
}

