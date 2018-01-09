

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] array = {121,153,222,370,111,371,407};
    int a;
	int b;
	int c;
	int m;
	for(int i=0;i<array.length;i++){
    	a = array[i]/100;
    	m = array[i]%100;
    	b = m/10;
    	c = m%10;
    	if(a*a*a+b*b*b+c*c*c==array[i]){
    		System.out.println(array[i]);
    	}
    }
    
}
}
