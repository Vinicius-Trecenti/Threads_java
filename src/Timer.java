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
            return (long) (tempo/1000);
        }    
}
