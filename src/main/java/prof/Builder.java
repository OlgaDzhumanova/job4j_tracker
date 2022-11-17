package prof;

import prof.Engineer;

public class Builder extends Engineer {
    private String building;
    private String plan;

    public Builder(String surname, String education, String birthday, String scheme,
                   String project, String building, String plan) {
        super(surname, education, birthday, scheme, project);
        this.building = building;
        this.plan = plan;
    }

    public String getBuilding() {
        return building;
    }

    public Engineer finalPlan(Engineer engineer) {
        engineer.design(plan);
        return engineer;
    }

    public Engineer complectedProject(Engineer engineer) {
        engineer.produce(building);
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
