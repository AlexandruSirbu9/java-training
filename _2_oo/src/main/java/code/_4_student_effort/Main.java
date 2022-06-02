package code._4_student_effort;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.format("x = %d , y= %d\n" , x , y);
    }

    private static void swap(int a, int b) {
        int aux = a;
        a = b ;
        b = aux;
    }
}
