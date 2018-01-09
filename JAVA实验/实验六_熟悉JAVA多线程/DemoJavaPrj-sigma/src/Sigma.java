public class Sigma implements Runnable{
    private int num;
    private static int sum=0;

    public Sigma(int number){
        this.num=number*25;
    }
    @Override
    public void run() {
        int shortsum=0;
        for(int i=0;i<25;i++){
            num++;
            shortsum=num+shortsum;
        }
        System.out.println("这阶段的和为"+shortsum);
        sum=sum+shortsum;
    }

    public int getNum() {
        return num;
    }

    public static int getSum() {
        return sum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
