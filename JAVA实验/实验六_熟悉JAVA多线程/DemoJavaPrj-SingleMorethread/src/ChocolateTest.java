public class ChocolateTest implements Runnable {
    @Override
    public void run() {
        while(true){
            synchronized (this){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                ChocolateBoiler chocolateBoiler=ChocolateBoiler.getChocolateBoiler();
                try {
                    chocolateBoiler.fill();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    chocolateBoiler.boil();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    chocolateBoiler.drain();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for(int i=0;i<3;i++){
                System.out.println();
            }
        }
    }
}
