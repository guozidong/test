

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] array = {1990,1991,1992,1993,1994,1995,1996,1997,
    
    		1998,1999,2000,2001,2002,2003,2004,2005,2006,2007};
    int j  =0;
	int []result = new int[20];
    for(int i = 0;i<array.length;i++){
    	if(array[i]%4 == 0 && array[i] % 100 != 0 || array[i] % 400 == 0){
    	  
    		System.out.print(array[i]+",");
    		j++;
    		if(j==2)
    			System.out.println("");
    	}
    }
  
	}

}	

