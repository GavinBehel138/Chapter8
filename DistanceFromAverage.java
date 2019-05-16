import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        double[] userValues = new double[20];
        int entry;
        int a = 1;
        int b;
        int total = 0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer or 99999 to quit >> ");
        entry = input.nextInt();
        if(entry == 99999)
            System.out.println("Please enter a value");
        while(entry != 99999 && a < userValues.length)
        {
            userValues[a] = entry;
            total = total + entry;
            System.out.print("Enter an integer or 99999 to quit >> ");
            entry = input.nextInt();
            if(entry == 99999)
                break;
            a++;
        }

        average = total / a;
        System.out.println("You entered " + a + " numbers and their average is " + average);
        for (b = 1; b < a; ++b)
        {
            System.out.println(userValues[b] + " is " + (userValues[b] - average) + " away from the average");
        }
    }
}

