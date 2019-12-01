package org.launchcode.techjobs_oo;

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
    public Job(){
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer,Location aLocation,PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this .coreCompetency = aCoreCompetency;
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
        return id;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public Job setName(String name) {
        this.name = name;
        return this;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Job setEmployer(Employer employer) {
        this.employer = employer;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Job setLocation(Location location) {
        this.location = location;
        return this;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public Job setPositionType(PositionType positionType) {
        this.positionType = positionType;
        return this;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public Job setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
        return this;
    }
    public int getId() {
        return id;
    }
}
