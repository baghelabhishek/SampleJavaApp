package java7_using_guava.sorting;

import beanAndDomain.Employee;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static Java8.sorting.SortingMainClass.buildEmployee;

/**
 * Created by Abhishek on 04/03/18.
 */
public class SortingInGuava {



    public static void main(String[] args) {


        Comparator<Employee> idComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Ints.compare(o1.getId(),o2.getId());
            }
        };
        Employee employee1 = buildEmployee(57, "john", "Addres1", "department1");
        Employee employee2 = buildEmployee(87, "rambo", "Addres2", "department1");
        Employee employee3 = buildEmployee(542, "jack", "Addres3", "department1");
        Employee employee4 = buildEmployee(946, "james", "Addres4", "department2");
        Employee employee5 = buildEmployee(46, "ethen", "Addres5", "department2");

        List<Employee> employees = Lists.newArrayList(employee1, employee2, employee3, employee4, employee5);

        Collections.sort(employees, idComparator);

        for (Employee employee: employees){
            System.out.println(employee.getId());
        }

    }
}



