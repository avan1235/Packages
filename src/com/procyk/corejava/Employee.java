package com.procyk.corejava;

/**
 * Created by Maciej Procyk on 10.04.2018.
 */

import java.time.LocalDate;
import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

     public Employee(String name, double salary, int year, int month, int day){
         this.name = name;
         this.salary = salary;
         this.hireDay = LocalDate.of(year, month, day);
     }

     public String getName(){
         return this.name;
     }

     public double getSalary(){
         return this.salary;
     }

     public LocalDate getHireDay(){
         return this.hireDay;
     }

     public void raiseSalary(double byPercent){
         double raise = this.salary * byPercent / 100;
         this.salary += raise;
     }

}
