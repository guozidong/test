


import java.util.concurrent.*;
/**
 * Created by 75293 on 2017/9/30.
 */
public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoiler;
    private ChocolateBoiler(){
        this.empty=true;
        this.boiled=false;
    }

    public static ChocolateBoiler getChocolateBoiler(){
        if(chocolateBoiler==null){
            chocolateBoiler=new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    private boolean empty;
    private boolean boiled;

    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
    public void setEmpty(boolean a){
        this.empty=a;
    }
    public void setBoiled(boolean b){
        this.boiled=b;
    }

    public void fill() throws InterruptedException {
         if(isEmpty()==true){
             System.out.println("加入巧克力和牛奶等混合物");
             System.out.println("正在添加，请稍后");
             Thread.sleep(100);
             setEmpty(false);
             System.out.println("添加完成");
         }
    }
    public void boil()throws InterruptedException{
        if(isEmpty()==false && isBoiled()==false){
              System.out.println("正在煮沸，请稍后");
              Thread.sleep(100);
              setBoiled(true);
              System.out.println("已煮沸");
        }
    }

    public void drain()throws InterruptedException{
     if (isEmpty()==false && isBoiled()==true){
         System.out.println("正在倒出，请稍后");
         Thread.sleep(100);
         setEmpty(true);
         setBoiled(false);
         System.out.println("倒出完成");
     }
    }

}
