
package evidence;

import java.util.Scanner;


public class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email Address :");
        String email = sc.nextLine();
        String regEx = "^[a-z0-9]+@[a-z0-9]+\\.[a-z]{3,5}$";
        
        if(email.matches(regEx)) System.out.println(email+" is Valid Email");
        else System.out.println(email+" is Not Valid Email");
        
    }
  
}
