package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee employee = new Employee("Hatice", 7800,45,2013);
        Employee employee1 = new Employee("Selma", 800,40,2009);
        Employee employee2 = new Employee("Aslan", 10000,43,2000);
        Employee employee3 = new Employee("Metin", 7500,41,2020);
        employee.raiseSalary();
       /* employee1.tax();
        employee1.bonus();
        employee2.tax();
        employee2.bonus();
        employee3.tax();
        employee3.bonus();
 */

    }
}
