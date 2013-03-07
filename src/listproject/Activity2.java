
package listproject;

import java.util.ArrayList;
import java.util.List;

public class Activity2 {

    public static void main(String[] args) {
        
        Employee e1 = new Employee("John Smith", "21340");
        Employee e2 = new Employee("Jane Doe", "21341");
        Employee e3 = new Employee("Saly Smith", "21342");
        Employee e4 = new Employee("Jane Doe", "21341");
         
        List<Employee> employee = new ArrayList<Employee>();
        
        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        
        System.out.println(employee.size());
        
        
        
    }
}
