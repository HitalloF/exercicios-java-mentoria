import java.util.Scanner;
public class descontos {

    public static void main(String[] args){
        System.out.println("Digite a forma de Pagamento: ");
        System.out.println("Digite 1 para pagamento em dinheiro ou cheque e receba 10% de desconto: ");
        System.out.println("Digite 2 para pagamento no cartão de crédito e receba 15% de desconto: ");
        System.out.println("Digite 3 para dividir em duas vezes, preço normal de etiqueta sem juros: ");
        System.out.println("Digite 4 para dividir em duas vezes, preço normal de etiqueta  mais juros de 10%: ");
        Scanner sc = new  Scanner(System.in);
        double formaDePagamento;
        double etiqueta = 555.50;
        formaDePagamento = sc.nextDouble();

        sc.close();
        if(formaDePagamento == 1){
            System.out.printf("Recebeu desconto %.2f%n", etiqueta - (etiqueta*0.1));
        }
        else if(formaDePagamento == 2){
            System.out.printf("Recebeu desconto %.2f%n", etiqueta - (etiqueta*0.15));
        }
        else if(formaDePagamento == 3){
            System.out.printf("Voce nao ecebeu desconto  irar pagar Duas vezes de %.2f%n", etiqueta/2);
        }
        else if(formaDePagamento == 4){
            System.out.printf("Recebeu desconto %.2f%n", (etiqueta + (etiqueta*0.1))/2);
        }
        else{
            System.out.println("Problema de BIOS(BIXA IGNORANTE OPERANDO O SISETMA");
        }
        }


}