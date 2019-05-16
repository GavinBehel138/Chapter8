public class TwelveInts
{
    public static void main(String[] args){

        double[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};

        ints[0] = 10;
        ints[1] = 20;
        ints[2] = 30;
        ints[3] = 40;
        ints[4] = 50;
        ints[5] = 60;
        ints[6] = 70;
        ints[7] = 80;
        ints[8] = 90;
        ints[9] = 100;
        ints[10] = 110;
        ints[11] = 120;

        System.out.println("Integers printed one by one are:");
        System.out.println(ints[0]);
        System.out.println(ints[1]);
        System.out.println(ints[2]);
        System.out.println(ints[3]);
        System.out.println(ints[4]);
        System.out.println(ints[5]);
        System.out.println(ints[6]);
        System.out.println(ints[7]);
        System.out.println(ints[8]);
        System.out.println(ints[9]);
        System.out.println(ints[10]);
        System.out.println(ints[11]);

        displayFor(ints);
    }
    private static void displayFor(double[] ints){

        for(int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
        for(int j = ints.length-1; j >= 0; j--){
            System.out.println(ints[j]);
        }
    }
}
