import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {
        isValid("aBderg3f");

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

        if(hasUpperCase(password)){
            System.out.println("Password contains uppercase letter(s)");
        }else{
            System.out.println("Password contains only lowercase letter(s). Think about putting some uppercase letters");
        }

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

    }
