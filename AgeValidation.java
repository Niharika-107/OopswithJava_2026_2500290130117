/*write a programm to check whether a person is eligible to vote or not by 
creating a method to check age and creating a use define exception age invalid exception */
import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        try{
            checkAge(age);
        }catch(AgeInvalidException e){
            System.out.println(e);
        }
        finally{
            sc.close();
        }

    }
    static void checkAge(int Age) throws AgeInvalidException {
        if(Age <18) 
            throw new AgeInvalidException("Age is not valid to vote");
        System.out.println("Eligible to vote");

    }
}
class AgeInvalidException extends Exception {
    AgeInvalidException(String msg){
        super(msg);
    }
}
/*Exception class create checked exception19 */
/*runtime exception class create unchecked exception */