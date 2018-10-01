import java.util.Scanner;


public class NewCircle {

	static Scanner scan = new Scanner(System.in);

	
	 
	 public static void main(String[] args) {
	
		 System.out.println("정수를 입력하시오: ");
		 
		 final int N = scan.nextInt();
		 
	  for(int i = -N; i <= N; i++)
	  {
		  
	   for(int j = -N; j <= N; j++)
	   {
		   
	    if(i * i + j * j <= N * N)
	    {
	    	
	     System.out.print("*");
	     
	    }
	    else
	    {
	     System.out.print(" ");
	     
	    }
	   }
	   System.out.println();
	   
	  }
	 }
	}