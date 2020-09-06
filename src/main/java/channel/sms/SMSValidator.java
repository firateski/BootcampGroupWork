package channel.sms;

public class SMSValidator {
    public boolean validateSMSLength(String sms){
        return sms.length() >= 1;
    }

    public boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.length() == 10;
    }
}
