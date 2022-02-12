package OOP.hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        Employee emp1 = new Employee(1);
        Employee emp2 = new Employee(1);
        set.add(emp1);
        set.add(emp2);

        System.out.println(set.size());
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());


    }

     static class Employee {
        int id;

        public Employee(int id) {
            this.id = id;
        }


         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Employee employee = (Employee) o;
             return id == employee.id;
         }

         @Override
         public int hashCode() {
             return Objects.hash(id);
         }
     }
}
