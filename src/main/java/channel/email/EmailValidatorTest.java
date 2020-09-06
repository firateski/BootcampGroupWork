package channel.email;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EmailValidatorTest {
    @Test
    public void should_be_return_true_when_email_format_valid(){
        EmailValidator validator = new EmailValidator();
        boolean output = validator.validateEmailFormat("name@example.com");

        assertTrue(output);
    }

    @Test
    public void should_be_return_true_when_email_length_valid(){
        EmailValidator validator = new EmailValidator();
        boolean output = validator.validateEmailLength("name@example.com");

        assertTrue(output);
    }

    @Test
    public void should_be_return_true_when_email_message_valid(){
        EmailValidator validator = new EmailValidator();
        boolean output = validator.validateEmailMessageLength("Hello!");

        assertTrue(output);
    }
}
