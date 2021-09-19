
package evidence;

import java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive Integer Number :");
        int num = sc.nextInt();
        int fact = 1;
        
        for(int i =num; i>=1; i--){
            fact*=i;
      
        }
        
        System.out.println("The Factorial of "+num+ " is = "+fact);
    }
    
}
