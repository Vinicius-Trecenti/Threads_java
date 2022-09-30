

public class exercicio3_03 implements Runnable{
    
    @Override
    public void run(){
        //Crie um programa que teste a modificação apontada no método isPrimo
        //colocar o tempo aqui
        Timer temp_isnovo = new Timer();
        Timer temp_isnormal = new Timer();

        //gerar um numero primo
        //verificar se é isprimo
            //contar o tempo
        //verficar com a Novo isprimo
            //contar o tempo

        //gerar um numero grande 
        boolean flag = false; //variavel liga/desliga

        while(flag ==false){
            long n =  (long) (Math.random()* Long.MAX_VALUE); //gera o numero grande

            if(n %2 == 0){//se for par ele incrementa 1
                n++;
            }

            temp_isnormal.iniciar();
            if(isPrimo(n)){//testa se é primo
                System.out.println("");
                System.out.println("--------- Método Normal ------------");
                System.out.println(n + " é primo");//se for primo exibe
                flag = true;
                temp_isnormal.parar();
                System.out.println("O tempo para o método normal foi de: "+temp_isnormal.getTempo()+ " milisegundos");   
                System.out.println("------------------------------------");
            }

            temp_isnovo.iniciar();
            if(isNovoPrimo(n)){//testa se é primo com o novo 
                System.out.println("");
                System.out.println("--------- Método Novo ------------");
                System.out.println(n + " é primo pelo novo metodo");//se for primo exibe
                flag = true;
                temp_isnovo.parar();
                System.out.println("O tempo para o novo método foi de: "+ temp_isnovo.getTempo()+ " milisegundos");
                System.out.println("------------------------------------");
                System.out.println("");
            }
        }
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

    //-------------------- DETERMINA SE É PRIMO ------------------------------------
    public boolean isNovoPrimo(long n) {
        
        if (n % 2 == 0 ) {
            return n == 2 || n == 3 || n == 5 || n == 7;
        }
        long raiz = ((long) Math.sqrt(n)) + 1;
        long i = 3;
        while (i < raiz) {
            if (n % i == 0) {
                return false;
            }
            i += 2;
        }
        return true;
    }

    public class Timer {
    
        private long inicio;
        private long fim;
        private long tempo;
            
            public void iniciar(){
                inicio= System.currentTimeMillis();
            }
            
            public void parar(){
                fim= System.currentTimeMillis();
                tempo= fim- inicio;
            }
            
        public long getTempo(){
                return (long) (tempo);
            }    
    
    }

    public static void main(String[] args) {
        exercicio3_03 ex = new exercicio3_03();
        Thread th = new Thread(ex);

        //Timer temp1 = new Timer();
        //temp1.iniciar();
        th.start();
        //temp1.parar();
        //System.out.println("O tempo foi de: "+ temp1.getTempo());
    }
}
