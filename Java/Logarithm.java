public class Logarithm
{
    public static void main(String[] args)
    {
        System.out.println(log(2, 8)); // prints 3.0
    }
    private static double log(double base, double num)
    {
        return Math.log(num) / Math.log(base);
    }
}
