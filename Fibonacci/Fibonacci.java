//Java program for Fibonacci Series using Space and calculate the sum of all the numbers in the series
import java.util.*;
class fibonacci 
{ 
    static int fib(int n) 
    { 
        /* Declare an array to store Fibonacci numbers. */
    int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0; 
    f[1] = 1; 
   
      
    for (i = 2; i <= n; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
   
    } 
       
    return f[n]; 
    
    } 
    static int sum(int n) {
        
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0 
    int i; 
       
    /* 0th and 1st number of the series are 0 and 1*/
    f[0] = 0; 
    f[1] = 1; 
    int sum = f[0] + f[1];
      
    for (i = 2; i <= n; i++) 
    { 
       /* Add the previous 2 numbers in the series 
         and store it */
        f[i] = f[i-1] + f[i-2]; 
        sum += f[i]; 
    } 
       
    return f[n]; 
    
    } 
        
  
    public static void main (String args[]) 
    { 
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n)); 
        System.out.println("the sum is "+ sum(n)); 
    } 
}
