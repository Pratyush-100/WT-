import java.util.*;
public class Point_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 coordinates :");
        // System.out.println("Enter 3 coordinates :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        // int z=sc.nextInt();

        Point p1 = new Point();
        Point p2 = new Point(x,y); 
        // Point p2 = new Point(x,y,z); 
        Point p3 = new Point(p2); 
        
        System.out.println("The points are:");
        p1.show();
        p2.show();
        p3.show();

        System.out.println("Distance from origin: " + p2.findDistance()+" units"); 
        System.out.println("Distance from (1, 2): " + p2.findDistance(1, 2)+" units"); 
        // System.out.println("Distance from (1, 2, 2): " + p2.findDistance(1, 2, 3)+"" units""); 
        System.out.println("Distance between p2 and p3: " + p2.findDistance(p3)+" units");
        // System.out.println("p2 equals p3: " + p2.isEqual(p3));
        sc.close();
    }
}