package easy;
import static java.lang.Math.*;
public class Rectangle {
    public int[] constructRectangle(int area) {
     for (int i =(int)sqrt(area); i >=1 ; i--) {
         if (area % i == 0) {
             return new int[]{ area / i,i };
         }
     }
     return new int[]{1,area};
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.constructRectangle(10000000));
    }
}
