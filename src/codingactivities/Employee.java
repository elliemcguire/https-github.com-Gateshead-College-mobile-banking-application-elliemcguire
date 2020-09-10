package codingactivities;

public class Employee {
    public String name;
    public int age;
    public int employeeNumber;
    public String postcode;

    public Employee(String name, int age, int employeeNumber, String postcode) {
        this.name = name;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.postcode = postcode;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("employeeNumber: "+this.employeeNumber);
        System.out.println("postcode: "+this.postcode);
    }

}
