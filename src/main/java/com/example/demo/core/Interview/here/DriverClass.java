package com.example.demo.core.Interview.here;

import java.util.HashMap;
import java.util.Map;

public class DriverClass {

    public static void main(String[] args) {
      Employee e1 =new Employee(1,"Akshay");
      Employee e2 = new Employee(2,"Bharat");

      System.out.println("e1.hashCode() -> "+e1.hashCode());
      System.out.println("e2.hashCode() -> "+e2.hashCode());
      System.out.println("e1.equals(e1) -> "+e1.equals(e1));
      System.out.println("e1.equals(e2) -> "+e1.equals(e2));

        Map<Employee,String> map = new HashMap<>();
        map.put(e1,"Akshay data");
        map.put(e2,"Bharat data");
        map.put(e1,"new Data");

        System.out.println(map);
        System.out.println("map.get(e1) -> "+map.get(e1));
        e1.setName("Vijay");
        System.out.println("e1.hashCode() -> "+e1.hashCode());
        System.out.println("e1.equals(e1) -> "+e1.equals(e1));
        System.out.println("e1.equals(e2) -> "+e1.equals(e2));
        System.out.println("map.get(e1) -> "+map.get(e1));
        System.out.println("map.get(e2) -> "+map.get(e2));


    }
}
