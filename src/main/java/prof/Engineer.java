package prof;

import prof.Profession;

public class Engineer extends Profession {
    private String scheme;
    private String project;

    public Engineer(String name, String surname, String education, String birthday, String scheme, String project) {
        super(name, surname, education, birthday);
        this.scheme = scheme;
        this.project = project;
    }

    public String getScheme() {
        return scheme;
    }

    public String getProject() {
        return project;
    }

    public String design(String scheme ) {
        this.scheme = scheme;
        return scheme;
    }

    public String produce( String project ) {
        this.project = project;
        return project;
    }
}
