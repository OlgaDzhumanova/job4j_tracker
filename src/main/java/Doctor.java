public class Doctor extends Profession {
    private String license;

    public String qualification(Profession profession) {
        return profession.getEducation();
    }

    public String workPermit( String license){
        return this.license = license;
    }
    public String diagnosis (String dia){
        return dia;
    }
}
