package channel.sms;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SMSValidatorTest {
    @Test
    public void should_be_return_true_when_sms_length_valid(){
        SMSValidator validator = new SMSValidator();
        boolean output = validator.validateSMSLength("Hello");

        assertTrue(output);
    }

    @Test
    public void should_be_return_true_when_phone_number_valid(){
        SMSValidator validator = new SMSValidator();
        boolean output = validator.validatePhoneNumber("5355803802");

        assertTrue(output);
    }
}
