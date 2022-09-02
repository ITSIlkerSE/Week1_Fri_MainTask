import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    @Test
    void passwordLengthValid(){

        //Given

        String passwordLengthTest = "2232213131";

        //When

        String actual = String.valueOf(PasswordValidation.lengthOfPassword(passwordLengthTest));

        //Then

        assertEquals("true", actual);

    }


    @Test
    void passwordLengthInvalid(){

        //Given

        String passwordLengthTest = "221";

        //When

        String actual = String.valueOf(PasswordValidation.lengthOfPassword(passwordLengthTest));

        //Then

        assertEquals("false", actual);

    }

    @Test
    void isNumberInPasswordTrue(){

        //Given
        String isDigitInPassword = "dasd34illd";
        //When
        String actual = String.valueOf(PasswordValidation.isNumber(isDigitInPassword));
        //Then
        assertEquals("Password contains at least one digit ", actual);
    }

    @Test
    void isNumberInPasswordFalse(){

        //Given
        String isDigitInPassword = "dasdlld";
        //When
        String actual = String.valueOf(PasswordValidation.isNumber(isDigitInPassword));
        //Then
        assertEquals("Try to put at least one digit in your password ", actual);
    }

}
