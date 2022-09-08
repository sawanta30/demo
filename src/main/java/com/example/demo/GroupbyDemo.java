package com.example.demo;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GroupbyDemo {
    private static List<Employee> empList = new ArrayList<>();
    static{
        Employee e1 = new Employee(1,"Akshay",EmployeeType.REGULAR,27000.00f,Department.IT);
        Employee e2 = new Employee(2,"Bharat",EmployeeType.CONTRACT,22500.00f,Department.SECURITY);
        Employee e3 = new Employee(3,"Vijay",EmployeeType.PARTTIME,17000.00f,Department.HARDWARE);
        Employee e4 = new Employee(4,"Mayank",EmployeeType.INTERN,10000.00f,Department.IT);
        Employee e5 = new Employee(5,"Ujwal",EmployeeType.PARTTIME,27500.00f,Department.IT);
        Employee e6 = new Employee(6,"Madhuri",EmployeeType.CONTRACT,17700.00f,Department.HARDWARE);
        Employee e7 = new Employee(7,"Siddharth",EmployeeType.REGULAR,24500.00f,Department.HR);
        Employee e8 = new Employee(8,"Nitin",EmployeeType.CONTRACT,13000.00f,Department.SECURITY);
        Employee e9 = new Employee(9,"Shashikant",EmployeeType.PARTTIME,17000.00f,Department.SECURITY);
        Employee e10 = new Employee(10,"Sonabai",EmployeeType.CONTRACT,12000.00f,Department.HR);
        Employee e11 = new Employee(11,"Shikhadevi",EmployeeType.REGULAR,27000.00f,Department.IT);
        Employee e12 = new Employee(12,"Vishal",EmployeeType.INTERN,10000.00f,Department.SECURITY);
        Employee e13 = new Employee(13,"Bob",EmployeeType.PARTTIME,15000.00f,Department.HR);
        Employee e14 = new Employee(14,"Jack",EmployeeType.CONTRACT,17000.00f,Department.FINANCE);
        Employee e15 = new Employee(15,"Merle",EmployeeType.REGULAR,27000.00f,Department.FINANCE);
        Employee e16 = new Employee(16,"Rajendra",EmployeeType.CONTRACT,27000.00f,Department.HARDWARE);
        Employee e17 = new Employee(17,"Pratiksha",EmployeeType.REGULAR,37000.00f,Department.IT);
        Employee e18 = new Employee(18,"Ash",EmployeeType.INTERN,12500.00f,Department.FINANCE);
        Employee e19 = new Employee(19,"jay",EmployeeType.CONTRACT,11000.00f,Department.SECURITY);
        Employee e20 = new Employee(20,"July",EmployeeType.INTERN,12000.00f,Department.SECURITY);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        empList.add(e7);
        empList.add(e8);
        empList.add(e9);
        empList.add(e10);
        empList.add(e11);
        empList.add(e12);
        empList.add(e13);
        empList.add(e14);
        empList.add(e15);
        empList.add(e16);
        empList.add(e17);
        empList.add(e18);
        empList.add(e19);
        empList.add(e20);
    }

    public static void main(String[] args) {
//
//        Predicate<Employee> regularEmployeeTest = (emp)->emp.getEmployeeType()==EmployeeType.REGULAR;
//
//        Map<EmployeeType,Long> map = empList.stream().collect(Collectors.groupingBy(employee -> employee.getEmployeeType(),Collectors.counting()));
////        System.out.println(map);
//
//        Map<Integer,List<Employee>> elist = empList.stream().filter(regularEmployeeTest)
//                .collect(Collectors.groupingBy(e->e.getId()));
//
//        System.out.println(elist);

//        String names = empList.stream()
//                .map(e->e.getName())
//                .collect(Collectors.joining(", ","[","]"));
//
//        System.out.println(names);
//
//        Map<Department, Employee> dataMap = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
////        System.out.println(dataMap);
//
//        dataMap.entrySet()
//                .forEach(e->{
//                    System.out.println(e.getKey()+"->"+e.getValue());
//                });


        final List<Employee> financeList = empList.stream().filter(f -> Department.FINANCE.equals(f.getDepartment()))
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .values()
                .stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

//        System.out.println(financeList);


//        int[] arr = {1,2,3,4,5,6};
//        final int[] integers = Arrays.stream(arr)
//                .sorted()
//                //.boxed()
//                //.sorted(Collections.reverseOrder())
//                .skip(1)
//                //.mapToInt(Integer::intValue)
//                        .toArray();
//
//        System.out.println(Arrays.toString(integers));

        final Map<EmployeeType,Double> avgSalaryPerDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmployeeType,Collectors.averagingDouble(Employee::getSalary)));



        System.out.println(avgSalaryPerDept);

    }



}
