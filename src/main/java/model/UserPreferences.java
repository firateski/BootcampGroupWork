package model;

public class UserPreferences {
    public enum Language{
        TR,
        EN
    }

    private int id;
    private Language language;

    public UserPreferences(Language language){
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
