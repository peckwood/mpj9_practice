/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packt.addressbook.model;

/**
 *
 * @author raiden
 */
public class Contact implements Comparable<Contact>{

    public Contact(String firstName, String lastName, String homePhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homePhone = homePhone;
    }
    

    
    private String id;
    private String firstName;
    private String lastName;
    private String homePhone;
    private String workPhone;
    private String email;

    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName;
    }
    
        @Override
    public int compareTo(Contact o) {
       return this.lastName.compareTo(o.getLastName());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    
}
