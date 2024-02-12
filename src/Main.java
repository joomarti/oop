import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc =new Scanner(System.in);
        triangle.a = 7;
        triangle.b = 7;
        triangle.c = 5;
       triangle.area(triangle.a, triangle.c, triangle.b);


    }
}