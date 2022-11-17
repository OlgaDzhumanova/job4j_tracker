package prof;

import prof.Doctor;
import prof.Profession;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday,
                   String license, String operation) {
        super(surname, education, birthday, license);
        this.operation = operation;
    }

    public String treatment(Doctor doctor) {
        return doctor.diagnosis(operation);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public String qualification(Profession profession) {
        return super.qualification(profession);
    }
}
