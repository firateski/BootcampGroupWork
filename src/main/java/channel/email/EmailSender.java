package channel.email;

import channel.Channel;
import model.EmailDTO;
import exception.RateLimitExceedException;

public class EmailSender implements Channel {
    EmailDTO emailDTO;

    public EmailSender(EmailDTO emailDTO){
        this.emailDTO = emailDTO;
    }

    public void send(){
        if(isRateLimitExceed()){
            switch (emailDTO.getEmailFrom().getUserPreferences().getLanguage()){
                case EN: throw new RateLimitExceedException("Rate limit exceed!");
                case TR: throw new RateLimitExceedException("Maksimum e-mail limitine ulaşıldı.");
            }
        }

        String emailFrom = emailDTO.getEmailFrom().getEmail();
        String emailTo = emailDTO.getEmailTo().getEmail();
        String subject = emailDTO.getSubject();
        String message = emailDTO.getMessage();

        System.out.printf("Email sent to %s from %s with subject of %s: %s",
                emailTo,
                emailFrom,
                subject,
                message);

        emailDTO.getEmailFrom().incrementNumberOfEmailsSentByOne();
    }

    public boolean isRateLimitExceed(){
        return emailDTO.getEmailFrom().getNumberOfEmailsSent() >= 10000;
    }
}
