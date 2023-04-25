import java.util.Scanner;

class sigla{
public static void main(String[] args){
    //Variaveis
    String sigla;
    Scanner entrada;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.println("Digite uma sigla de um estado: ");
    sigla = entrada.next();
    entrada.close ();

    switch (sigla){
        case "PR":
            System.out.println("Seu estado é o Paraná, seu código é 41 e sua região é a Sul");
            break;
        case "SC": 
            System.out.println("Seu estado é Santa Catarina, seu código é 42 e sua região é a Sul");
            break;
        case "RS":
            System.out.println("Seu estado é o Rio Grande do Sul, seu código é 43 e sua região é a Sul");
            break;
        default:
        System.out.println("O estado não consta na base de dados");
    }
    }
}

