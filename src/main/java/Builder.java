public class Builder extends Engineer {
    private String building;
    private String plan;

    public String getBuilding() {
        return building;
    }

    public Engineer finalPlan ( Engineer engineer){
        engineer.design(plan);
        return engineer;
    }

    public Engineer complectedProject( Engineer engineer){
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
