import java.util.Scanner;

class segundos{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    int hora, tempo;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Tempo é: ");
    tempo = entrada.nextInt ();
    entrada.close();


    //Processamento
    hora = tempo/3600;

    //Saída
    System.out.printf("Hora: %d\n", hora);
    }
}

