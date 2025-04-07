import java.util.*;
//Stella Bertoli 4/7/25
public class AccountSetUp{
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        System.out.print("Enter password that is at least 8 characters: ");
        String password = input.nextLine();
        do{
            System.out.print("Enter password that is at least 8 characters: ");
            password = input.nextLine();
            if(password.length()>=8){
                break;
            }
        }while((password.length())<8);
        input.close();
        System.out.println("Your user name is " + username + " and your password is " + password);
        
    }

}