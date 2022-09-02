import java.sql.Array;
import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        boolean enterpassword = true;
        while(enterpassword){

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter password");
            String password = myScanner.nextLine();

            enterpassword = !isValid(password);

        }

    }
    public static boolean lengthOfPassword(String password) {

        boolean validLength = password.length() >= 8;

        return validLength;
    }
    public static boolean isNumber(String password) {
        boolean hasNumber = false;
        for (int i = 0; i <= 9; i++) {
            String.valueOf(i);
            if (password.contains(String.valueOf(i))) {
                hasNumber = true;
            }
        }
        return hasNumber;
    }

    public static boolean isValid(String password) {
        boolean isValid = false;
        if (!badPasswords(password) && hasUpperCase(password) && lengthOfPassword(password) && isNumber(password)) {
            System.out.println("Password is valid!");
            isValid = true;

        } else{

            if(badPasswords(password)){
                System.out.println("Password is unsecure due to bad sequence ");
            }

            if(!hasUpperCase(password)){
                System.out.println("Password contains only lowercase letter(s). Think about putting some uppercase letters");
            }

            if(!lengthOfPassword(password)){
                System.out.println("Password is not long enough !");
            }
            if (!isNumber(password)) {

                System.out.println("Password has no digit !");
            }

            System.out.println("Try a new password.");
        }
        return isValid;
    }

    public static boolean hasUpperCase(String password) {

        boolean upperCase = false;
        String compareString = password.toUpperCase();

        for(int i =0; i<password.length();i++){

            if(!Character.isDigit(password.charAt(i))){
                if(password.charAt(i) == compareString.charAt(i)){
                    upperCase = true;
                }
            }

        }
        return upperCase;
    }

    public static boolean badPasswords(String password){
        boolean weakPassword = false;
        String[] badPasswordList = {"First", "Second", "abc", "123456", "first"};

        for(int i = 0; i < badPasswordList.length; i++){
            if(password.contains(badPasswordList[i])) {
                weakPassword = true;
            }
        }

        return weakPassword;
    }
}