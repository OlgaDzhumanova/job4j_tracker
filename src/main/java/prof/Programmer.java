package prof;

import prof.Engineer;

public class Programmer extends Engineer {
    private String code;
    private String program;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getCode() {
        return code;
    }

    public String getProgram() {
        return program;
    }


    public Engineer sourceCode (Engineer engineer){
        engineer.design(code);
        return engineer;
    }

    public Engineer finalProgram (Engineer engineer){
        engineer.produce(program);
        return engineer;
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }
}

