public class Operadores {

    public static void main(String args[]){

            operacoesAritimetrica();
            operacoesAtribuicoes();
            operacoesIncrementoDecremento();
            operacoesRelacionais();
            operacoesLogicas();
    }

    private static void operacoesLogicas() {
        System.out.println("**** operacoesLogicas ****");

        int nun1 = 10;
        int nun2 = 10;

        boolean isDentro10 = nun1 >= 1 && nun1 <= 10;//Variavel de verificação de valores entre 1 e 10
        System.out.println("indetro10:" + isDentro10);

        boolean isDentro_10 = nun1 >= 1 || nun2 <=9;//Execulta a primeira condição se for igual ao valor
        System.out.println("isdetro_10:" + !isDentro_10);//Colocando uma esclamação inverte os valores

        boolean isNot = nun1 >=1;//Desfaz ou inverte os resultados
        System.out.println("isNot:" + isNot);
    }

    private static void operacoesRelacionais() {
        System.out.println("**** operacoesRelacionais ****");

        int nun1 = 10;
        int nun2 = 10;
        boolean isMaior = nun1 > nun2;//Variavel de comparação
        System.out.println("isMaior:" + isMaior);

        boolean isIgual = nun1 == nun2;//Variavel de igualdade
        System.out.println("isIgual:" + isIgual);

        boolean isDiff = nun1 != nun2;//Variavel de diferença
        System.out.println("isDiff:" + isDiff);

        boolean isMaiorIgual = nun1 >= nun2;//Variavel de maior ou igual
        System.out.println("isMaiorIgual:" + isMaiorIgual);





    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("**** operacoesIncrementoDecremeto ****");

        int nun1 = 10;//valor da variavel
        System.out.println(nun1);

        nun1++;//Soma o valor da variavel mais 1
        System.out.println(nun1);

        nun1--;//Subitrai o valor da variavel nenos 1
        System.out.println(nun1);


    }

    private static void operacoesAtribuicoes() {

        System.out.println("**** operacoesAtribuicoes ****");

        int numero1 = 10;
        int numero2 = 10;

        int numero3 = numero1 + numero2;//exemplo 1
        System.out.println(numero3);// Imprimi o primeiro valor
        numero3 += numero3;//soma o resultado com o menmo valor
        System.out.println(numero3);//imprime o segundo valor

        int numero4 = numero3 + 20;//exemplo 2 do codigo acima
        System.out.println(numero4);

    }

    public static void operacoesAritimetrica(){

        System.out.println("**** operacoesAritimetricas ****");
        int nun1 = 130;
        int nun2 = 250;
        int nun3 = 155;

        int nun4 = nun1 + nun2;
        int nun5 = nun4 * nun3;
        int nun6 = nun5 / nun3;
        int nun7 = nun6 - nun3;
        int nun8 = (10 + 30) / 2;

        System.out.println(nun4);
        System.out.println(nun5);
        System.out.println(nun6);
        System.out.println(nun7);
        System.out.println(nun8);
    }
}
