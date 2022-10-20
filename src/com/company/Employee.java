package com.company;

public class Employee {
    private String name;
    private float salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, float salary, int workHours, int hireYear){
        this.setName(name);
        this.setSalary(salary);
        this.setWorkHours(workHours);
        this.setHireYear(hireYear);
    }

    public float tax(float salary){
        float tax;

        if (salary <= 1000){
            tax = 0;
           // System.out.println("There is no tax for " + getName());
        }
        else{

            tax = (float) (salary*(3.0f/100.0f));
            //System.out.println("Tax for " + getName() + " is: " + tax);


        }
        return tax;
    }

    public float bonus(float salary){
        float bonus;
        if (workHours <= 40){
            bonus = 0;
           // System.out.println("There is no bonus for " + getName());
        }
        else{
            bonus = (workHours - 40) * 30;
           // System.out.println(getName() + " won "+ bonus + "₺ bonus money");
            }

        salary = salary + bonus;

        return bonus;
    }
    public float editedSalary(float salary){
        float newSalary;
        Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
        float tax = employee.tax(getSalary());
        float bonus = employee.bonus(getSalary());
        newSalary = (salary + bonus - tax);
        return newSalary;
    }

    public float raiseSalary(){
        int difference;
        float newSalary;
        difference = 2021 - hireYear;
        if (difference < 10){
            newSalary = salary + (float) (salary*5.0f/100.0f);
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            float tax = employee.tax(getSalary());
            float bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
          //  System.out.println(getName() + "'s salary after addition is: " +salary);
        }
        else if(difference>=10 && difference<20){
            newSalary = salary + (int)(salary*10.0f/100.0f);
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            float tax = employee.tax(getSalary());
            float bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
           // System.out.println(getName() + "'s salary after addition is: " +salary);

        }
        else if(difference>=20){
            newSalary = salary + (float) (salary*(15.0f/100.0f));
            Employee employee = new Employee(getName(),getSalary(),getWorkHours(),getHireYear());
            float tax = employee.tax(getSalary());
            float bonus = employee.bonus(getSalary());
            setSalary(newSalary + bonus - tax);
          //  System.out.println(getName() + "'s salary after addition is: " +salary);


        }

        return salary;
    }

    public String toString(){
        return "Adı:" + name + " Maaşı:" + salary + " Çalışma Saati:" + workHours + " Başlangıç Yılı:" + hireYear + " Vergi:" +tax(getSalary()) +
               " Bonus:" + bonus(getSalary()) +" Vergi ve bonuslar ile birlikte maaş:" + editedSalary(getSalary()) + " Toplam Maaş:" + raiseSalary();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
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
