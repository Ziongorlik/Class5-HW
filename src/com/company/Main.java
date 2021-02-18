package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise-1
        String[] names = {"First", "Second", "Third"};
        names[1] = "Fourth";
        System.out.println("The Third name is: " + names[2]);

        // Exercise-2
        Dog dog1 = new Dog("Rexi", 2, "Brown");
        Dog dog2 = new Dog("Buck", 8, "Black");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        System.out.println("Dog1 age is: " + dogs.get(0).getAge());
        dogs.clear();
        System.out.println("Dogs list size: " + dogs.size());

        // Exercise-3
        ArrayList<String> days = new ArrayList<>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");

        Iterator iterator = days.iterator();
        iterator.next();
        System.out.println("The Second string is: " + iterator.next());

        // Exercise-4
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Average of numbers is : " + (double) sum / numbers.length);

        // Exercise-5
        // Because HashSet doesn't allow duplicates, it will print the word "hello" once.

        // Exercise-6
        HashMap<String, String> users = new HashMap<>();
        users.put("Admin", "123");
        users.put("User", "456");
        users.put("Tech", "789");

        for (String name : users.keySet()) {
            System.out.println(users.get(name));
        }

        // Exercise-7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number between 1 - 4 : ");
        int number = scanner.nextInt();
        String message = "";
        switch (number) {
            case 1: {
                message = String.valueOf(Seasons.WINTER);
                break;
            }
            case 2: {
                message = String.valueOf(Seasons.SUMMER);
                break;
            }
            case 3: {
                message = String.valueOf(Seasons.SPRING);
                break;
            }
            case 4: {
                message = String.valueOf(Seasons.FALL);
                break;
            }
            default:
                message = "There is no season for this number";
        }

        System.out.println(message);

        // Exercise-8
        // The code is not valid because var cannot be used for method parameters.

        // Exercise-9
        int[] numberArray = {1, 2, 5, 67, 9};
        for (int num : numberArray) {
            if (num == 67) {
                System.out.println("The number 67 exist in the array");
                break;
            }
        }

        // Exercise-10
        // In HashMap, the method containsKey("KeyName") is used for checking if a key exists
    }
}