

/**
 * Created by 75293 on 2017/9/30.
 */
public class test {
    public static void main(String[] args) throws InterruptedException{
        ChocolateBoiler chocolateBoiler=ChocolateBoiler.getChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
    }
}
