import java.util.Scanner;

public class evennumbers{
    public static void main(String[] args) {

            int number, total = 0, value = 0;

            double average;

            Scanner input = new Scanner(System.in);


            System.out.print("Enter The Number : ");

            number = input.nextInt();


            for(int i = 0; i <= number; i++){

                if((i % 3 == 0) && (i % 4 == 0)){

                    total += i;

                    value += 1;

                }

            } average = total / value;

            System.out.println("Average : " + average);
        }
    }

