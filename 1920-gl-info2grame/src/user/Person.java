package user;

import java.util.ArrayList;

public class Person{

    //Attributes
    private String FirstName;
    private String LastName;
    private ArrayList<Role> roles;

    //Constructors
    public Person(){
        roles = new ArrayList<Role>();
    }

    public Person(String firstName, String lastName, ArrayList<Role> roles) {
        FirstName = firstName;
        LastName = lastName;
        this.roles = roles;
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
        roles = new ArrayList<Role>();
    }

    //Getter & Setter

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }
}