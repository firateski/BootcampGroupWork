import channel.Channel;
import channel.email.EmailSender;
import model.EmailDTO;
import model.User;
import model.UserPreferences;

public class Main {
    public static void main(String[] args) {
        User userFrom = new User();
        userFrom.setUserPreferences(new UserPreferences(UserPreferences.Language.EN));
        userFrom.setEmail("from@gmail.com");
        userFrom.setPhone("1234567890");

        User userTo = new User();
        userTo.setEmail("to@gmail.com");
        userTo.setPhone("1234567890");

        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setEmailFrom(userFrom);
        emailDTO.setEmailTo(userTo);
        emailDTO.setMessage("Sample message");
        emailDTO.setSubject("Sample Subject");

        Channel channel = new EmailSender(emailDTO);

        try {
            channel.send();
        } catch (Exception e) {
            System.out.printf("%s", e.getMessage());
        }
    }
}
