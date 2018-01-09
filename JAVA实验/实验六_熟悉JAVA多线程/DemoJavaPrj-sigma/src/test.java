public class test {
    public static void main(String[] args){
        int numberSum=0;
        Thread[] jobs=new Thread[4];
        try{
            for(int i=0;i<jobs.length;i++){
                jobs[i]=new Thread(new Sigma(i));
                jobs[i].start();
                jobs[i].join();
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("总和为"+Sigma.getSum());
    }
}
