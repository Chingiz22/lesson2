package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(canWalk(30, 15));
        System.out.println(canWalk(18, 2));
        System.out.println(canWalk(55, -5));
        System.out.println(canWalk(60, 45));
        System.out.println(canWalk(80, -40));
        System.out.println(canWalkWithRandomAge(20));
        System.out.println(canWalkWithRandomAge(15));
        System.out.println(canWalkWithRandomAge(-5));
    }

    public static String canWalk(int age, int temp) {

        if (
                (age >= 20 && age <= 40 && temp >= -20 && temp <= 30)
                        || (age < 20 && temp >= 0 && temp <= 28)
                        || (age > 45 && temp >= -10 && temp <= 25)
        ) {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Можно идти гулять";
        } else {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Оставайтесь дома";
        }

    }

    public static String canWalkWithRandomAge(int temp) {
        int age = generateRandomAge();
        if (
                (age >= 20 && age <= 40 && temp >= -20 && temp <= 30)
                        || (age < 20 && temp >= 0 && temp <= 28)
                        || (age > 45 && temp >= -10 && temp <= 25)
        ) {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Можно идти гулять";
        } else {
            return "Возраст: " + age + ", Температура: " + temp + " Результат: Оставайтесь дома";
        }


    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 100);

    }
}






