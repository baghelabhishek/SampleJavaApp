package java7_using_guava.optional;

import beanAndDomain.Employee;
import com.google.common.base.Optional;

import static Java8.sorting.SortingMainClass.buildEmployee;

/**
 * Created by Abhishek on 05/03/18.
 */
public class OptionalExample {

    public static Optional<Employee> buildEmployee(int id, String name, String address, String department) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAddress(address);
        employee.setDepartment(department);
        return Optional.of(employee) ;
    }

    public static void main(String[] args) {
        Optional<Employee> employee1 = Optional.absent();
        Optional<Employee> employee2 = buildEmployee(57, "john", "Bern", "department1");


        if(employee1.isPresent()){
            System.out.println("Employee is present");
        }else {
            System.out.println("EMployee is absent");
        }

        Employee employee = employee1.or(employee2).get();
        System.out.println(employee.getName());

    }
}
