public class Point_demo {
    public static void main(String[] args) {
       
        Point p1 = new Point();
        System.out.print("Point p1: ");
        p1.show();
        System.out.println("Distance from origin: " + p1.findDistance());

        Point p2 = new Point(3, 4);
        System.out.print("Point p2: ");
        p2.show();
        System.out.println("Distance from origin: " + p2.findDistance());
        System.out.println("Distance from (1, 1): " + p2.findDistance(1, 1));

        Point p3 = new Point(p2);
        System.out.print("Point p3 (copy of p2): ");
        p3.show();
        System.out.println("Distance from p2: " + p3.findDistance(p2));
    }
}