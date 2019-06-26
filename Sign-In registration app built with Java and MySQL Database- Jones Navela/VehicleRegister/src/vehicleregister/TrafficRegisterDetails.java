/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleregister;

/**
 *
 * @author Jones Navela
 */
public class TrafficRegisterDetails {
    private String firstName;
    private String surname;
    private int age;
    private String address;
    private String traffic;

    public TrafficRegisterDetails(String FirstName, String Surname, int Age, String Address, String Traffic) {
        this.firstName = FirstName;
        this.surname = Surname;
        this.age = Age;
        this.address = Address;
        this.traffic = Traffic;
    }

    public TrafficRegisterDetails() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String Surname) {
        this.surname = Surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String Traffic) {
        this.traffic = Traffic;
    }
    
    
}
