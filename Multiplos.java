import java.util.Scanner;

class Main{
public static void main(String[] args){
    int a, b;
    Scanner entrada;
    entrada = new Scanner(System.in);
    System.out.print("Digite um valor: ");
    a = entrada.nextInt ();
    System.out.print("Digite outro valor: ");
    b = entrada.nextInt ();
    entrada.close ();
    if (a%b==0) {
        System.out.println("É multiplo");
    }
    if (b%a!=0) {
        System.out.println("Nao sao multiplos");
    }
    else {
        System.out.println("Não é multiplo");
    }
}
}

