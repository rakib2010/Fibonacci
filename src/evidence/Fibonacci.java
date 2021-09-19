
package evidence;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Desire Fibonacci Number :");
        int input = sc.nextInt();
        System.out.println("=====================================");
        int first_number = 0;
        int second_number = 1;
        int fibo;
        
        
        
        System.out.print(first_number+" "+second_number);
        
        
        for(int i = 3;i<=input; i++){
            fibo = first_number+second_number;
            System.out.print(" "+fibo);
            first_number = second_number;
            second_number = fibo;
            
            
        
        
        }
        
        System.out.println();
        
        
        
    }
    
}
