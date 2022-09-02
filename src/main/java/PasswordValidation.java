public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(lengthOfPassword("sdasdasd52"));

    }


    public static boolean lengthOfPassword(String password) {


        if (password.length() >= 8) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isNumber (String password) {

        for(int i = 0; i <= 9; i++ ) {
            String.valueOf(i);
            if (password.contains(String.valueOf(i))) {
                return true;
            }

        }       return false;
    }



    }



