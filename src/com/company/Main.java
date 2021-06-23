package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<SomeObject> someObjects = new ArrayList<>();
        someObjects.add(new SomeObject(1, "first ", 1));
        someObjects.add(new SomeObject(2, "Alexandra", 2));
        someObjects.add(new SomeObject(3, "Artem", 3));
        someObjects.add(new SomeObject(4, "Max", 4));
        someObjects.add(new SomeObject(5, "fifth", 5));
        someObjects.add(new SomeObject(6, "sixth", 6));

        System.out.println("List of Names");
        System.out.println(getListOfNames(someObjects) + "\n");
        System.out.println("Max id has Object : " + getMaxIdObject(someObjects).toString() + "\n");
        System.out.println("The sum of counts Objects with char a in name is " + sumOfCountSpecial(someObjects) + "\n");
        System.out.println("The MAP of names with key by id");
        System.out.println(getMapOfNamesById(someObjects));

    }

    private static List<String> getListOfNames(List<SomeObject> someObjects) {
        return someObjects.stream().map(SomeObject::getName).collect(Collectors.toList());
    }

    private static SomeObject getMaxIdObject(List<SomeObject> list) {
        return list.stream()
                .max((o1, o2) -> o1.getId() - o2.getId()).orElse(new SomeObject(-1, "", 0));

    }

    private static int sumOfCountSpecial(List<SomeObject> list) {
        return list.stream()
                .filter(s -> s.getName().toLowerCase().contains("a"))
                .mapToInt(SomeObject::getCount)
                .sum();

    }

    private static Map<Integer, String> getMapOfNamesById(List<SomeObject> list) {
        return list.stream()
                .collect(Collectors.toMap(SomeObject::getId, SomeObject::getName));
    }


}
