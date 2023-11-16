import java.util.Scanner;
import java.util.Locale;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmentro:");
        int paramentroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        scanner.close();

        try {
            contar(paramentroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            contarDecrescente(paramentroUm, parametroDois);


        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        else
            System.out.println("\nRealizando contagem\n");
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimido o número " + i);
        }
    }

    static void contarDecrescente(int parametroUm, int parametroDois) {
        System.out.println("\nO segundo parâmetro deve ser maior que o primeiro");
        System.out.println("Realizando a contagem decrescente\n");
        for (int i = parametroUm; i >= parametroDois; i--) {
            System.out.println("Imprimido o número " + i);
        }
    }

}
