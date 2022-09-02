public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(lengthOfPassword("sdasdasd52"));

    }


    public static String lengthOfPassword(String password) {


        if (password.length() >= 8) {
            return "Password is valid!";
        } else {
            return "Password is invalid!";
        }

    }

    public static String isNumber (String password) {

        for(int i = 0; i <= 9; i++ ) {
            String.valueOf(i);
            if (password.contains(String.valueOf(i))) {
                return "Password contains at least one digit ";
            }

        }       return "Try to put at least one digit in your password ";
    }


    }



