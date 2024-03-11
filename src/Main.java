import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valorPago;
        int troco;
        int qtdCanetas;
        double valorUnitario;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantidade de canetas: ");
        qtdCanetas = input.nextInt();
        System.out.print("\nValor da nota usada no pagamento: ");
        valorPago = input.nextInt();
        System.out.print("\nTroco recebido: ");
        troco = input.nextInt();
        valorUnitario = (double) (valorPago - troco) / qtdCanetas;
        System.out.printf("\n\nO valor de cada caneta eh R$ %.2f",
                valorUnitario);

    }
}