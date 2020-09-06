package model;

public class EmailDTO {
    private User emailFrom;
    private User emailTo;

    private String subject;
    private String message;

    public User getEmailTo() {
        return emailTo;
    }

    public void setEmailFrom(User emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getSubject() {
        return subject;
    }

    public void setEmailTo(User emailTo) {
        this.emailTo = emailTo;
    }

    public User getEmailFrom() {
        return emailFrom;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
