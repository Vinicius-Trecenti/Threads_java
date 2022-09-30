public class exercicio2_03  implements Runnable{

    private String nome;
    private int valor = 100; //ATRIBUIR O VALOR DE 100 INICIAL
    private int rodadas = 10; //FAZER DEZ RODADAS

    //RECEBER O NOME DO JOGADOR 
    public exercicio2_03(String nome){ //se precisar pegar alguma coisa externa
        this.nome = nome;
    }

    @Override
    public void run(){
        // No programa do jogo de aposta, modifique para exibir o valor de cada 
        //jogadora a cada um segundo

        //RECEBER O NOME DO JOGADOR 
        //ATRIBUIR O VALOR DE 100 INICIAL
        //FAZER DEZ RODADAS 
            // A CADA RODADA ESPERAR UM SEGUNDO 
            //GERAR UM NUMERO MENOR QUE 21
            //SE FOR PAR SOMA SE FOR IMPAR DIMINUI
        //IMPRIMIR O VALOR FINAL

        try{
            for(int i=0; i<rodadas;i++){
                if(i == 0){
                    System.out.println("O jogador: " + nome);
                }

                System.out.println("Na rodada ["+ i + "] tem -> R$" + valor);

                if(i ==9){
                    System.out.println("-----------------------");
                }
                int banca = (int) (Math.random()*21);//GERAR UM NUMERO MENOR QUE 21

                if(banca%2==0){//SE FOR PAR SOMA SE FOR IMPAR DIMINUI
                    valor+=banca;
                } else{
                    valor-=banca;
                }
                Thread.sleep(1000);// A CADA RODADA ESPERAR UM SEGUNDO 
            }
        } catch (Exception e){

        }
        //IMPRIMIR O VALOR FINAL
        System.out.println("O jogador " + nome + " tem R$" + valor);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        //JOGADOR 1
        exercicio2_03 ex1 = new exercicio2_03("Vinicius"); 
        Thread th1 = new Thread(ex1);
        th1.run();

        //JOGADOR 2
        exercicio2_03 ex2 = new exercicio2_03("Lucas"); 
        Thread th2 = new Thread(ex2);
        th2.run();

        //JOGADOR 3
        exercicio2_03 ex3 = new exercicio2_03("Guilherme"); 
        Thread th3 = new Thread(ex3);
        th3.run();

        //JOGADOR 4
        exercicio2_03 ex4 = new exercicio2_03("Maria"); 
        Thread th4 = new Thread(ex4);
        th4.run();

        //JOGADOR 5
        exercicio2_03 ex5 = new exercicio2_03("Rafael"); 
        Thread th5 = new Thread(ex5);
        th5.run();
    }
}
