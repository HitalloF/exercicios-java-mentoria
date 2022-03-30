import java.util.Locale;

public class imc {
    public static void main(String[] args){
        double peso = 123.2;
        double altura = 1.93;
        double imc = peso/Math.pow(altura, 2);
        Locale.setDefault(Locale.US);


        if (imc < 18.5){
            System.out.printf("Seu IMC EH %.2f%n Voce esta abaixo do peso", imc);
        }
        else if (imc >= 18.5 && imc < 25){
            System.out.printf("Seu IMC EH %.2f%n Voce esta com o peso normal",imc);
        }
        else if (imc >= 25 && imc < 30){
            System.out.printf("Seu IMC EH %.2f%n Voce esta a cima do peso", imc);
        }
        else if(imc >= 30){
            System.out.printf("Seu IMC EH %.2f%n Voce esta obeso", imc);
        }
        else{
            System.out.println("Problema de BIOS(BIXA IGNORANTE OPERANDO O SISETMA");
        }
    }
}
