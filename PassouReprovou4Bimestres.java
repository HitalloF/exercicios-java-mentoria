public class PassouReprovou4Bimestres {
    public static void main(String[] args){
        int nota_1 = 7;
        int nota_2 = 7;
        int nota_3 = 7;
        int nota_4 = 7;

        float media = (nota_1+nota_2+nota_3+nota_4)/4;

        if (media >= 7) {
            System.out.println("Passou Direto Nota :"+ media);
        }
        else if (media >= 5 && media <7){
            System.out.println("têm direito de fazer uma prova de recuperação, sua nota: "+ media);
        }
        else if ( media <5){
            System.out.println("reprovado direto sua nota: "+ media);
        }
        else{
            System.out.println("Problema de BIOS(BIXA IGNORANTE OPERANDO O SISETMA");
        }
    }
}
