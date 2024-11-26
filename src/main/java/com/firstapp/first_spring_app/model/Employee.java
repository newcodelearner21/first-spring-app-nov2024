package com.firstapp.first_spring_app.model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String designation;

    //we cannot take address in a string format as it contains int and string
    // public String designation;

    // instead we take address in Class format
    private Address address;

    //we use toString method to print the object

// adding getter and setters to tostring method for LOOSE COUPLING
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", designation='" + designation + '\'' +
                '}';
    }
}
