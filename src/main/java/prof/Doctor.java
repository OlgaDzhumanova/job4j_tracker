package prof;

import prof.Profession;

public class Doctor extends Profession {
    private String license;

    public Doctor(String surname, String education, String birthday, String license) {
        super(surname, education, birthday);
        this.license = license;
    }

    public String qualification(Profession profession) {
        return profession.getEducation();
    }

    public String workPermit(String license) {
        this.license = license;
        return license;
    }

    public String diagnosis(String dia) {
        return dia;
    }
}
