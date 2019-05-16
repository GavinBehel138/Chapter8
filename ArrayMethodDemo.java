import java.util.Scanner;

public class ArrayMethodDemo
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 90, 90, 100};
        int value;
        display(numbers);
        reverse(numbers);
        sum(numbers);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value >>>> ");
        value = input.nextInt();

        lessThan(numbers, value);
        greaterThanAverage(numbers);
    }

    private static void display(int[] arr)
    {
        int a;
        System.out.print("The numbers in the array are:");
        for(a = 0; a < arr.length; ++a)
            System.out.print(" " + arr[a]);
    }

    private static void reverse(int[] arr)
    {
        int a;
        System.out.print("The numbers in the array in reverse order are:");
        for(a = 9; a >= 0; --a)
            System.out.print(" " + arr[a]);
    }

    private static void sum(int[] arr)
    {
        int a;
        int sum = 0;
        System.out.print("The total sum of the numbers in the array is ");
        for(a = 0; a < arr.length; ++a)
            sum = sum + arr[a];
        System.out.print(sum);
    }

    private static void lessThan(int[] arr, int cv)
    {
        int a;
        System.out.print("All numbers in the array that are less than " + cv + " are: ");
        for(a = 0; a < arr.length; ++a)
        {
            if(arr[a] < cv)
                System.out.print(" " + arr[a]);
        }
    }

    private static void greaterThanAverage(int[] arr)
    {
        int a, sum = 0;
        double avg;
        for(a = 0; a < arr.length; ++a)
            sum = sum + arr[a];
        avg = sum / 10;
        System.out.println("The average of the numbers in the array is " + avg);
        System.out.print("All numbers in the array that are greater than the average of the numbers is ");
        for(a = 0; a < arr.length; ++a)
        {
            if(arr[a] > avg)
                System.out.print(" " + arr[a]);
        }
    }
}
