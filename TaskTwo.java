package HomeTaskTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your city : ");
        String city = sc.nextLine();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your hobby : ");
        String hobby = sc.nextLine();

        System.out.println("Вывод первого варианта");

        System.out.println("Вывод второго варианта");
        System.out.print("Name:  " + name + "\n" + "City:  " +  city + "\n"
                + "Age:   " + age + "\n" + "Hobby: " + hobby + "\n" );

        System.out.println("Человек по имени " + name + " живет в городе " + city +
                ". Этому человеку " + age + " лет и любит заниматься " + hobby);

        System.out.println("Вывод третьего варианта");
        System.out.print( name + " - name"  + "\n" + city + " - city" + "\n"
                + age + " - age" + "\n" + hobby + " - hobby" + "\n" );


    }
}