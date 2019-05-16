public class DemoArray
{
    public static void main(String[] args){

        double[] salaries = {6.25, 6.55, 10.25, 16.85};

        salaries[0] = 6.25;
        salaries[1] = 6.55;
        salaries[2] = 10.25;
        salaries[3] = 16.85;

        System.out.println("Salaries printed one by one are:");
        System.out.println(salaries[0]);
        System.out.println(salaries[1]);
        System.out.println(salaries[2]);
        System.out.println(salaries[3]);

        displayFor(salaries);
    }
    private static void displayFor(double[] salaries){

        for(int i = 0; i < salaries.length; i++){
            System.out.println(salaries[i]);
        }
        for(int j = salaries.length-1; j >= 0; j--){
            System.out.println(salaries[j]);
        }
    }
}
