public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double [] grades = {67,78,89,45,23};
         for(int i=0;i<grades.length;i++){
    	  if(grades[i]>=90 && grades[i]<=100){
    		  System.out.print(grades[i]);
    		  System.out.println("---------优");
    		  
    	 }
    	  if(grades[i]>=80 && grades[i]<=89){
    		  System.out.print(grades[i]);
    		  System.out.println("---------良");
    		  
    	 }
    	  if(grades[i]>=70 && grades[i]<=79){
    		  System.out.print(grades[i]);
    		  System.out.println("---------中");
    		  
    	 }
    	  if(grades[i]>=60 && grades[i]<=69){
    		  System.out.print(grades[i]);
    		  System.out.println("---------及格");
    		  
    	 }
    	  if(grades[i]>=0 && grades[i]<=59){
    		  System.out.print(grades[i]);
    		  System.out.println("---------不及格");
    		  
    	 }
    	 
    	  }
	
	}
}
     
     
    
     
   