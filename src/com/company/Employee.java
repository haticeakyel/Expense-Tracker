package com.company;

public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.setName(name);
        this.setSalary(salary);
        this.setWorkHours(workHours);
        this.setHireYear(hireYear);
    }

    public int tax(int salary){
        int tax;

        if (salary <= 1000){
            tax = 0;
            System.out.println("There is no tax for " + getName());
        }
        else{

            tax = (int)(salary*(3.0f/100.0f));
            System.out.println("Tax for " + getName() + " is: " + tax);


        }
        return tax;
    }

    public int bonus(int salary){
        int bonus;
        if (workHours <= 40){
            bonus = 0;
            System.out.println("There is no bonus for " + getName());
        }
        else{
            bonus = (workHours - 40) * 30;
            System.out.println(getName() + " won "+ bonus + "₺ bonus money");
            }

        salary = salary + bonus;

        return bonus;
    }

    public void raiseSalary(){
        int difference;
        int newSalary;
        difference = 2021 - hireYear;
        if (difference < 10){
            newSalary = salary + (int)(salary*5.0f/100.0f);
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            int tax = employee.tax(getSalary());
            int bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
            System.out.println(getName() + "'s salary after addition is: " +salary);
        }
        else if(difference>=10 && difference<20){
            newSalary = salary + (int)(salary*10.0f/100.0f);
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            int tax = employee.tax(getSalary());
            int bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
            System.out.println(getName() + "'s salary after addition is: " +salary);

        }
        else if(difference>=20){
            newSalary = salary + (int)(salary*(15.0f/100.0f));
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            int tax = employee.tax(getSalary());
            int bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
            System.out.println(getName() + "'s salary after addition is: " +salary);

        }

    }

    public void tostring(){
        Employee employee = new Employee("Hatice", 7800,45,2013);
        Employee employee1 = new Employee("Selma", 800,40,2009);
        Employee employee2 = new Employee("Aslan", 10000,40,2000);
        Employee employee3 = new Employee("Metin", 7500,40,2020);
        System.out.println("Employee's name is: ");
        employee.getName();
        System.out.println("Employee's tax is: ");
        System.out.println("Employee's bonus is: ");
        System.out.println("The salary is: ");



    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
