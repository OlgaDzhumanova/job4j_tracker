package prof;

public class Profession {
    private String surname;
    private String education;
    private String birthday;

    public Profession(String surname, String education, String birthday) {
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
