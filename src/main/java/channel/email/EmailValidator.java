package channel.email;

public class EmailValidator {
    public boolean validateEmailFormat(String email){
        return email.contains("@");
    }

    public boolean validateEmailLength(String email){
        return email.length() >= 3;
    }

    public boolean validateEmailMessageLength(String message){
        return message.length() >= 3;
    }
}
