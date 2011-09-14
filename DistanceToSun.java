/* Xiao G. Wu
 * CS111A - Assignment 2
 * 08/29/2011
 */

public class DistanceToSun
{
    public static void main(String[] args)
    {
        // Distance between the Sun and Earth
        double distance = 93E6;
        // Halfway
        double half = distance / 2; 
        // Halfway in inches
        double inches = half * 63360; // 1 mile = 63360 inches
        System.out.println("Distance between the Sun and Earth is " + distance + " miles");
        System.out.println("Halfway is " +  half + " miles");
        System.out.println("Halfway in inches is " + inches + " inches");

        // Extra Credit
        System.out.println("Extra Credit");
        double x = 69.82;
        double y = 69.20 + 0.62;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        if(x == y)
        {
            System.out.println("Equality");
        }
        else 
        {
            System.out.println("Not Equal");
        }
    }
}
