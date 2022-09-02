public class PasswordValidation {

    public static void main(String[] args) {
        System.out.println(lengthOfPassword("dal"));

    }


    public static String lengthOfPassword(String password){


    if (password.length() >= 8){
        return "Password is valid!";
    } else {
        return "Password is invalid!";
    }

    }



}
