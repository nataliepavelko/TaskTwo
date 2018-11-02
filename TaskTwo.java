package HomeTaskTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("Enter your city : ");
        String city = sc.nextLine();

        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your hobby : ");
        String hobby = sc.nextLine();

        System.out.println("");
        System.out.println("Вывод первого варианта");
        System.out.print("Name:  " + name  + "City:  " +  city + "Age:   " + age  + "Hobby: " + hobby  );

        System.out.println("");
        System.out.println("Вывод второго варианта");
        System.out.println("Человек по имени " + name + " живет в городе " + city +
                ". Этому человеку " + age + " лет и любит заниматься " + hobby);

        System.out.println("");
        System.out.println("Вывод третьего варианта");
        System.out.print( name + " - name"  + "\n" + city + " - city" + "\n"
                + age + " - age" + "\n" + hobby + " - hobby" + "\n" );


    }
}