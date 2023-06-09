package com.core.java8.functionalProgramming.joining;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.core.java8.functionalProgramming.consumer.Instructor;
import com.core.java8.functionalProgramming.consumer.Instructors;

public class GroupingByExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //grouping by length of string and also checking that the names contains e
        //and only return those name which has e in it
        List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        LinkedHashMap<Integer, List<String>> result = name.stream()
                .collect(Collectors.groupingBy(String::length, LinkedHashMap::new, Collectors
                        .filtering(s-> s.contains("e"),Collectors.toList())));

        System.out.println("result = " + result);
        System.out.println("------------------");

        //instructor grouping them by Senior(>10) and Junior(<10) and filter them
        //on online courses
        LinkedHashMap<String, List<Instructor>> instructorByExpAndOnline = Instructors.getAll()
                .stream().collect(Collectors.groupingBy(instructor ->
                        instructor.getYearsOfExperience()>10 ? "SENIOR": "JUNIOR",
                        LinkedHashMap::new, Collectors.filtering(s->s.isOnlineCourses(),
                                Collectors.toList())));

        instructorByExpAndOnline.forEach((key, value) -> {
            System.out.println("key  = " + key + " value = " + value);
        });
	}

}
