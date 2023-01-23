package pl.javastart.task;

import static java.lang.Math.pow;

public class Math {

    boolean isEven(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int i) {
        if (i % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    double circleField(double r) {
        return (3.14 * r * r);
    }

    int power(int i) {
        return i * i;
    }
}
