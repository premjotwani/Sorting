
import java.io.*;
public class Bubblesort {

	public static void main(String[] args) throws IOException {
		int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of elements");
        n=Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("Enter Elements");
        for (int i =0; i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        
        // for sorting
        int temp=0;
        for(int i= 0;i<n;i++){
            for(int j=1;j<n-i;j++){
               //for swapping inputs
               if(a[j-1] < a[j]){
               temp = a[j-1];
               a[j-1]=a[j];
               a[j]=temp;
               
            }
        }
            
    }
        System.out.println("Sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);   
            
        }

	}

}
