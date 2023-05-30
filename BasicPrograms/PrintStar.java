package com.BasicPrograms;

public class PrintStar {
	

	    // Function to demonstrate printing pattern
	    public static void printStars(int n)
	    {
	        int i, j;
	 
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=0; i<n; i++)
	        {
	 
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop   
	            for(j=0; j<=i; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
	   }
	    
	    public static void printStarsReverse(int n)
	    {
	        int i, j;
	 
	        // outer loop to handle number of rows
	        //  n in this case
	        for(i=n; i>1; i--)
	        {
	 
	            //  inner loop to handle number of columns
	            //  values changing acc. to outer loop   
	            for(j=1; j<n; j++)
	            {
	                // printing stars
	                System.out.print("* ");
	            }
	 
	            // ending line after each row
	            System.out.println();
	        }
	   }
	 
	    // Driver Function
	    public static void main(String args[])
	    {
	        int n = 5;
	        printStars(n);
	        System.out.println("Reverse");
	        printStarsReverse(n);
	    }
	

}
