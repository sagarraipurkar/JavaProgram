package october.ex03102024;

import java.util.Scanner;

public class Lab0301 {
    public static void main(String[] args) {
        System.out.println("Enter the Table Number");
        Scanner src = new Scanner(System.in);
        int num = src.nextInt();

        for (int i=1; i<=10; i++){
            int result = num*i;
            System.out.println("10" + "x" + i + "= " + result);

        }


    }
}
