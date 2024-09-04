package day1;

public class AnglesOfTriangle {
    public static void main(String[] args) {
        //3. Find angles of triangle if two angles are given
        int angle1 = 80;
        int angle2 = 65;
        int angle3 = 180 - (angle1 + angle2);

        System.out.println(angle3);
    }
}
