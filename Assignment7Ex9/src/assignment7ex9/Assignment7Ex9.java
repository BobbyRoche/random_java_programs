/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7ex9;
import java.util.*;
/**
 *
 * @author Bobby
 */
public class Assignment7Ex9 {
static Scanner console = new Scanner(System.in);
static final double PI = 3.1416;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double x1,y1,x2,y2,radius,circumference,area;
    System.out.println("Please enter the x1, y1 coordinates (the center), followed by the x2,y2 coordinates(point on the circle).");
    x1=console.nextDouble();
    y1=console.nextDouble();
    x2=console.nextDouble();
    y2=console.nextDouble();
    radius = getRadius(x1,x2,y1,y2);
    circumference = getCircumference(radius);
    area = getArea(radius);
    System.out.println("Radius = " + radius);
     System.out.println("Circumference = " + circumference);
      System.out.println("Area = " + area);
        }
    public static double getRadius(double x1, double x2, double y1, double y2)
    {
        double length;
        length = getDistance(x1,x2,y1,y2);
        return length;
    }
     public static double getDistance(double x1, double x2, double y1, double y2)
     {
         double distance;
         distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
         return distance;
     }
     public static double getCircumference(double radius)
     {
         double circumference;
         circumference = 2*PI*radius;
         return circumference;
     }
     public static double getArea(double radius)
     {
         double area;
         area = (PI*radius*radius);
         return area;
     }
    
}
