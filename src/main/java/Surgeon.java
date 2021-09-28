public class Surgeon extends Doctor {
    private String operation;

    public String treatment(Doctor doctor) {
        return doctor.diagnosis(operation);
    }

    @Override
    public String getName() {
        return super.getName();
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
