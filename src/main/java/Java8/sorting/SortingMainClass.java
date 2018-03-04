package Java8.sorting;

import beanAndDomain.Employee;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/**
 * Created by Abhishek on 04/03/18.
 */
public class SortingMainClass {

    public static void main(String[] args) {

        Employee employee1 = buildEmployee(57, "john", "Addres1", "department1");
        Employee employee2 = buildEmployee(87, "rambo", "Addres2", "department1");
        Employee employee3 = buildEmployee(542, "jack", "Addres3", "department1");
        Employee employee4 = buildEmployee(946, "james", "Addres4", "department2");
        Employee employee5 = buildEmployee(46, "ethen", "Addres5", "department2");

        Function<Employee, Integer> byId = Employee::getId;
        @SuppressWarnings("Convert2MethodRef") Function<Employee, String> byName =  Employee::getName;


        ArrayList<Employee> employees = Lists.newArrayList(employee1, employee2, employee3, employee4, employee5);

        List<Employee> sortedByIdAndName = employees.stream()
                .sorted(comparing(byId).thenComparing(byName))
                .collect(toList());

        Map<String, List<Employee>> mapOfEmployeeByDepartment = employees.stream()
                .collect(groupingBy(Employee::getDepartment));

        Comparator<Employee> comparatorById = Comparator.comparing(Employee::getId);

        //largest element in each alphabate
        Map<Character, Optional<Employee>> collect = employees.stream()
                .collect(groupingBy(employee ->  employee.getName().charAt(0),
                        reducing(BinaryOperator.maxBy(comparatorById))));

        List<Employee> employeeListSortedById = employees.stream()
                .sorted((e1, e2) -> e1.idDifference(e2))
                .collect(toList());

        List<Employee> employeeListSortedById2 = employees.stream()
                .sorted(Employee::idDifference)
                .collect(Collectors.toList());




    }

    public static Employee buildEmployee(int id, String name, String address, String department) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAddress(address);
        employee.setDepartment(department);
        return employee;
    }
}
