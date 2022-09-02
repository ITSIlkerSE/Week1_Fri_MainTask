import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        isValid("pdsadas2341");
/*
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter password (At least 8 digits and 1 number)");
        String password = myScanner.nextLine();

        isValid(password);

 */
    }



    public static boolean lengthOfPassword(String password) {


        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }

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

        if(lengthOfPassword(password)){
            System.out.println("Password is long enough.");
        }else {
            System.out.println("Password is not long enough !");
        }
        if (isNumber(password)) {
            ;
            System.out.println("Password has at least one digit.");
        } else {
            System.out.println("Password has no digit !");
        }

        if (lengthOfPassword(password) && isNumber(password)) {
            System.out.println("Password is safe !");
            isValid = true;
        } else {
            System.out.println("Password is not save enough, please put at least one digit and your password should be at least 8 digits long");
        }
            return isValid;
        }



    }
