package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        new StreamTest().withStreams();
    }


    public void withoutStreams(){
        List<Employee> employeeList = new ArrayList<>();
        List<Integer> salaries = new ArrayList<>();

        employeeList.add(new Employee(1, 18, 15000, "Sai"));
        employeeList.add(new Employee(2, 20, 150000, "Sarath"));
        employeeList.add(new Employee(3, 22, 1500, "Chandra"));
        employeeList.add(new Employee(4, 24, 1500000, "Raju"));
        employeeList.add(new Employee(5, 26, 150, "Mahesh"));

        for(Employee employee : employeeList){
            if(employee.salary >= 15000)
                salaries.add(employee.salary);
        }

        System.out.println(salaries);

    }


    public void withStreams(){
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1, 18, 15000, "Sai"));
        employeeList.add(new Employee(2, 20, 150000, "Sarath"));
        employeeList.add(new Employee(3, 22, 1500, "Chandra"));
        employeeList.add(new Employee(4, 24, 1500000, "Raju"));
        employeeList.add(new Employee(5, 26, 150, "Mahesh"));

        final List<Integer> finalResult = employeeList.stream()
                .filter(employee -> employee.salary >= 15000)
                .map(employee -> employee.salary)
                .collect(Collectors.toList());
        System.out.println(finalResult);
    }

    class Employee{
        int id;
        int age;
        int salary;
        String name;

        public  Employee(int id, int age, int salary, String name) {
            this.id = id;
            this.age = age;
            this.salary = salary;
            this.name = name;
        }

        public Employee() {
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

}
