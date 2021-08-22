/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaos X
 */
public class Employee {
    protected int employee_id;
    protected int age;
    protected String name;
    protected String address;
    protected float salary;

    public Employee(int employee_id, int age, String name, String address, float salary) {
        this.employee_id = employee_id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    
    public Employee() {
        this.employee_id = 0;
        this.age = 0;
        this.name = "";
        this.address = "";
        this.salary = 0;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
