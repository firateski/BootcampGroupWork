package channel.sms;

import exception.RateLimitExceedException;
import model.SMSDTO;

public class SMSSender {
    SMSDTO smsDTO;

    public SMSSender(SMSDTO smsDTO){
        this.smsDTO = smsDTO;
    }

    public void send(){
        if(isRateLimitExceed()){
            switch (smsDTO.getSmsFrom().getUserPreferences().getLanguage()){
                case EN: throw new RateLimitExceedException("Rate limit exceed!");
                case TR: throw new RateLimitExceedException("Maksimum e-mail limitine ulaşıldı.");
            }
        }

        String smsFrom = smsDTO.getSmsFrom().getEmail();
        String smsTo = smsDTO.getSmsTo().getEmail();
        String message = smsDTO.getMessage();

        System.out.printf("SMS sent to %s from %s: %s",
                smsTo,
                smsFrom,
                message);

        smsDTO.getSmsFrom().incrementNumberOfEmailsSentByOne();
    }

    public boolean isRateLimitExceed(){
        return smsDTO.getSmsFrom().getNumberOfEmailsSent() >= 1000;
    }
}
