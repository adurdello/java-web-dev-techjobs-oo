package org.launchcode.techjobs_oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public static final String ANSI_RESET = "\u001B[0m";

    public static final String RED_BOLD = "\033[1;31m";    // RED

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString() {
        String jobData = "ID: " + RED_BOLD + this.getId() + ANSI_RESET + "\n";

        if (!this.name.isEmpty()){
            jobData += "Name: " + this.name + "\n";
        } else {
            jobData += "Name: Data not available" + "\n";
        }
        if (this.employer.getValue().isEmpty()){
            jobData += "Employer: Data not available" + "\n";
        } else {
            jobData += "Employer: " + this.employer + "\n";
        }
        if (this.location.getValue().isEmpty()){
            jobData += "Location: Data not available" + "\n";
        } else {
            jobData += "Location: " + this.location + "\n";
        }
        if (this.positionType.getValue().isEmpty()){
            jobData += "Position Type: Data not available" + "\n";
        } else {
            jobData += "Position Type: " + this.positionType + "\n";
        }
        if (this.coreCompetency.getValue().isEmpty()){
            jobData += "Core Competency: Data not available" + "\n";
        } else {
            jobData += "Core Competency: " + this.coreCompetency;
        }
        if (this.name.isEmpty() && this.employer.getValue().isEmpty() && this.location.getValue().isEmpty() && this.positionType.getValue().isEmpty() && this.coreCompetency.getValue().isEmpty()) {
            jobData = "OOPS! This job does not seem to exist.";
        }

        return "\n" + jobData + "\n";
    }
}
