public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(lengthOfPassword("dal"));
        System.out.println(isNumber("dasds4ad"));
    }


    public static String lengthOfPassword(String password) {


        if (password.length() >= 8) {
            return "Password is valid!";
        } else {
            return "Password is invalid!";
        }

    }

    public static boolean isNumber (String isDigit) {

        for(int i = 0; i <= 9; i++ ){
            String.valueOf(i);
            if(isDigit.contains(String.valueOf(i))){
                return true;
            }

            }
                return false;
    }


    }



