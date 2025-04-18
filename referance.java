import java.awt.Point;
import java.util.Date;
public class referance {
    public static void main(String[] args) {
        int a=8;
        int b=a;            //primitives
        a=6;
        System.out.println(a);
        System.out.println(b);

        Point p1=new Point(5,6);
        Point p2=p1;                    //referance type
        System.out.println(p2);

        p1.x=4;
        System.out.println(p1);
        System.out.println(p2);


    
}
}
