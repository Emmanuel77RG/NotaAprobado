import java.util.Scanner;


public class NotaAprobado {
    
    int nota;
    Scanner entrada = new Scanner(System.in);
    
    public void nota()
    {

        System.out.println("Introduzca nota a analizar:");
        nota = entrada.nextInt();
        if (nota > 5) {
            System.out.println("Prueba superada ");
        }
    }

    public static void main(String[] args) {
        NotaAprobado rune = new NotaAprobado();
        rune.nota();
    }

}

