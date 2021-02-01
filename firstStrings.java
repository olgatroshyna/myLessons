import java.util.Scanner;

public class firstStrings {
    public static void main(String[] args) {
        System.out.println("enter your name and age");
        Scanner sc = new Scanner(System.in);
Scanner scAge= new Scanner(System.in);
       String name= sc.next();
       int age= scAge.nextInt();
        String text=String.format("Hello, %s, your age is %d ", name, age);

        System.out.println(text);
    }
}
