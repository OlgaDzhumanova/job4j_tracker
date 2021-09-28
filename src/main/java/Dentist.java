public class Dentist extends Doctor {
    private String tooth;

    public String treatment(Doctor doctor){
        return doctor.diagnosis(tooth);
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
