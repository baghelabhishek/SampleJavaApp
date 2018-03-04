package beanAndDomain;

/**
 * Created by Abhishek on 04/03/18.
 */
public class Employee {

    private int id;
    private String name;
    private String address;
    private String department;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int idDifference(final Employee other) {
        return id - other.id;
    }
}
