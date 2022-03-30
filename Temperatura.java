public class Temperatura {

    public  static  void main(String[] args){
        float temperatura = 35;
        float conversao = (temperatura * 9/5)+32;

        if (conversao >= 62.6 && conversao <=  82.4 ){
            System.out.println("Clima tá bem agradavel em " + conversao+ "F");
        }
        else if (conversao >= 82.2 ){
            System.out.println("Clima tá bem quente em " + conversao+ "F");
        }
        else if (conversao < 62.6 && conversao >=41 ){
            System.out.println("Clima esfrio é melhor usar um casaco " + conversao+ "F");
        }
        else if (conversao <41 ){
            System.out.println("Com esse frio é melhor nem sair de casa " +conversao+ "F");
        }
        else {
            System.out.println("Gostaria nem de saber qual temperatura você tentou descobrir" + conversao+ "F");
        }
    }
}
