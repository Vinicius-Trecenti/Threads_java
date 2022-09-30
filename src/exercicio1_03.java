public class exercicio1_03 implements Runnable{

    private long valor;
    private long valor_sum;

    @Override
    public void run(){ 
        //Crie um programa que encontre dois números primos gêmeos;

        boolean flag = false;//variavel liga/desliga

        while(flag == false){//para ainda ficar gerando até achar os primos gemeos

            valor = (long) (Math.random()* Long.MAX_VALUE);//criar um numero primo
            
            //System.out.println(valor);

            if(isPrimo(valor)){//verificar se é primo

                valor_sum = valor+2;//somar mais dois 

                if(isPrimo(valor_sum)){//verificar se o somado é primo
                    System.out.println("Os valores: " + valor + " e " + valor_sum + " são primos gêmeos");
                    flag = true;
                }
    
            }
        }

        //criar um numero primo
        //verificar se é primo
            //somar mais dois 
            //verificar se o somado é primo 
        //imprimir 
    }


    //-------------------- DETERMINA SE É PRIMO ------------------------------------
    public boolean isPrimo(long n) {
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return n == 2 || n == 3 || n == 5 || n == 7;
        }
        long raiz = ((long) Math.sqrt(n)) + 1;
        long i = 11;
        while (i < raiz) {
            if (n % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }


    public static void main(String[] args) {
        exercicio1_03 ex = new exercicio1_03();
        Thread th = new Thread(ex);
        th.start();
    }

    
}
