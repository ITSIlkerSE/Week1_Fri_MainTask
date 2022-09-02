import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    @Test
    void passwordLengthValid(){

        //Given

        String passwordLengthTest = "2232213131";

        //When

        String actual = PasswordValidation.lengthOfPassword(passwordLengthTest);

        //Then

        assertEquals("Password is valid!", actual);

    }


    @Test
    void passwordLengthInvalid(){

        //Given

        String passwordLengthTest = "221";

        //When

        String actual = PasswordValidation.lengthOfPassword(passwordLengthTest);

        //Then

        assertEquals("Password is invalid!", actual);

    }

    @Test
    void isNumberInPasswordTrue(){

        //Given
        String isDigitInPassword = "dasd34illd";
        //When
        String actual = String.valueOf(PasswordValidation.isNumber(isDigitInPassword));
        //Then
        assertEquals("true", actual);
    }

    @Test
    void isNumberInPasswordFalse(){

        //Given
        String isDigitInPassword = "dasdlld";
        //When
        String actual = String.valueOf(PasswordValidation.isNumber(isDigitInPassword));
        //Then
        assertEquals("false", actual);
    }

}
