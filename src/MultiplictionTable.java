import java.util.Scanner;

public class MultiplictionTable {

     static void multiplication(){
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         int mult;
         switch (number) {
             case 1 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 1 + " = " + mult);

                 }

             }
             case 2 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 2 + " = " + mult);
                 }

             }
             case 3 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 3 + " = " + mult);
                 }

             }
             case 4 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 4 + " = " + mult);
                 }
             }
             case 5 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 5 + " = " + mult);
                 }

             }
             case 6 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 6 + " = " + mult);
                 }

             }
             case 7 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 7 + " = " + mult);
                 }

             }
             case 8 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 8 + " = " + mult);
                 }

             }
             case 9 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 9 + " = " + mult);
                 }

             }
             case 10 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 10 + " = " + mult);
                 }

             }
             case 11 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 11 + " = " + mult);
                 }

             }
             case 12 -> {
                 for (int i = 1; i <= 12; i++) {
                     mult = i * number;
                     System.out.println(i + " x " + 12 + " = " + mult);
                 }

             }

             default -> System.out.println("Number had to be within the range of 1-12");
         }

     }


    public static void main(String[] args) {
        System.out.println("Choose the number-times of the multiplication number you want");
        multiplication();

    }
}
