public class test {
    public static void main(String[] args) throws InterruptedException{
         ChocolateTest t= new ChocolateTest();
         Thread tA=new Thread(t);
         Thread tB=new Thread(t);
         Thread tC=new Thread(t);
         Thread tD=new Thread(t);

         tA.start();
         tB.start();
         tC.start();
         tD.start();
    }
}
