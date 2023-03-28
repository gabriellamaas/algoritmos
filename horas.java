import java.util.Scanner;

class horas{
public static void main(String[] args){
    //Variaveis
    Scanner entrada;
    int hora, minuto, segundo, tempo;

    //Entrada
    entrada = new Scanner(System.in);
    System.out.print("Hora é: ");
    hora = entrada.nextInt ();
    System.out.print("Minuto é: ");
    minuto = entrada.nextInt ();
    System.out.print("Segundo é: ");
    segundo = entrada.nextInt ();
    entrada.close ();

    //Processamento
    tempo = hora * 3600;
    tempo = tempo + minuto * 60;
    tempo = tempo + segundo;


    //Saída
    System.out.printf("Se passaram %d segundos desde 00:00", tempo);
    }
}

