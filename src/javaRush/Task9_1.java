package javaRush;

import static java.lang.Math.toRadians;

//Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно,
// полученного как параметр. Угол задан в градусах.
// В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.
public class Task9_1 {
    public static void main(String[] args) {

    }
    public class Solution{
        public static double sin(double angle) {
            double radians = Math.toRadians(angle);
            return Math.sin(radians);
        }

        public static double cos(double angle) {
            double radians = Math.toRadians(angle);
            return Math.cos(radians);
        }

        public static double tan(double angle) {
            double radians = Math.toRadians(angle);
            return Math.tan(radians);
        }
    }
}
