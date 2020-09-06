package model;

public class SMSDTO {
    private User smsFrom;
    private User smsTo;

    private String message;

    public User getSmsFrom() {
        return smsFrom;
    }

    public void setSmsFrom(User smsFrom) {
        this.smsFrom = smsFrom;
    }

    public User getSmsTo() {
        return smsTo;
    }

    public void setSmsTo(User smsTo) {
        this.smsTo = smsTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
