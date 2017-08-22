import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.io.*;
public class Sort {
	  public static void main(String args[])throws IOException{  
		  int n;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter no. of elements");
	        n=Integer.parseInt(br.readLine());
	        int a[] = new int[n];
	        System.out.println("Enter Elements");
	        for (int i =0; i<n;i++){
	            a[i]=Integer.parseInt(br.readLine());
	        }
	        int i, j, first, temp;  
	        for ( i = n - 1; i > 0; i--)  
	        {
	             first = 0;   
	             for(j = 1; j <= i; j ++)  
	             {
	                  if( a[ j ] < a[ first ] )         
	                    first = j;
	             }
	             temp = a[ first ];   
	             a[ first ] = a[ i ];
	             a[ i ] = temp; 
	         }
	        for(i=0;i<n;i++){
	        	System.out.println(a[i]);
	        }
	        
	      
}
	  }