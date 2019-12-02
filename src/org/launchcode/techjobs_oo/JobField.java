package org.launchcode.techjobs_oo;

//Let’s move all of the repeated code into a separate class. We will then have Employer, Location, CoreCompetency, and PositionType inherit this common code.
public abstract class JobField {
    private String value;
    private int id;
    private static int nextId = 1;

    // constructors
    public JobField(){
        id = nextId;
        nextId++;
    }

    public JobField(String value){
        this();
        this.value = value;
    }

    // getters and setters
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    // toString
    @Override
    public String toString() {
        return value;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobField jobField = (JobField) o;

        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
