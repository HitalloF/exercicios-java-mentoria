public class PassouReprovou {

    public static void main(String[] args){
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Passou Direto Nota :"+ nota);
        }
        else if (nota >= 5 && nota <7){
            System.out.println("têm direito de fazer uma prova de recuperação, sua nota: "+ nota);
        }
        else if ( nota <5){
            System.out.println("reprovado direto sua nota: "+ nota);
        }
        else{
            System.out.println("Problema de BIOS(BIXA IGNORANTE OPERANDO O SISETMA");
        }
    }

}
