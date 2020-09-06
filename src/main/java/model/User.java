package model;

public class User {
    private int id;
    private String name;
    private String email;
    private String phone;

    private int numberOfEmailsSent = 0;
    private int numberOfSMSSent = 0;

    private UserPreferences userPreferences;

    public UserPreferences getUserPreferences() {
        return userPreferences;
    }

    public void setUserPreferences(UserPreferences userPreferences) {
        this.userPreferences = userPreferences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNumberOfEmailsSent() {
        return numberOfEmailsSent;
    }

    public void incrementNumberOfEmailsSentByOne() {
        this.numberOfEmailsSent += 1;
    }

    public int getNumberOfSMSSent() {
        return numberOfSMSSent;
    }

    public void incrementNumberOfSMSSentByOne() {
        this.numberOfSMSSent += 1;
    }
}
