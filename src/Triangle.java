import java.util.ArrayList;

/*Класс обычный треугольник,который включает в себя метод проверки существует ли такой треугольник, методы обсчета сторон, углов,
 * полупериметра, периметра, площади, метод вывода данных об треугольнике (стороны, углы,и т.д.), и функция вывода ошибки на экран
 * об ложности введенных параметров и функция поиска наибольшей площади среди треугольников*/
public class Triangle {
    private double a;
    private double b;
    private double c;
    static final String FORMAT = "%6.2f";


    public Triangle(double a, double b, double c) {
        chek2(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getPerimetr() {
        return a + b + c;
    }

    public double halfPerimetr() {
        double halfPerimetr = getPerimetr() / 2;
        return halfPerimetr;
    }

    public double getSquare() {
        return (Math.sqrt(halfPerimetr() * (halfPerimetr() - this.a) * (halfPerimetr() - this.b) * (halfPerimetr() - this.c)));
    }

    public double getDegreesToA() {
        return Math.toDegrees(Math.acos((Math.pow(this.b, 2) + Math.pow(this.c, 2) - Math.pow(this.a, 2)) / (2 * this.b * this.c)));
    }

    public double getDegreesToB() {
        return Math.toDegrees(Math.acos((Math.pow(this.a, 2) + Math.pow(this.c, 2) - Math.pow(this.b, 2)) / (2 * this.a * this.c)));
    }

    public double getDegreesToC() {
        return Math.toDegrees(Math.acos((Math.pow(this.a, 2) + Math.pow(this.b, 2) - Math.pow(this.c, 2)) / (2 * this.a * this.b)));
    }

    public String toString() {
        return "Сторона треуглольника А = " + this.a +
                "; Сторона треуглольника В = " + this.b +
                "; Сторона треуглольника С = " + this.c +
                "; Периметр треугольника = " + String.format("%6.2f", getPerimetr()) +
                "; Площадь треугольника = " + String.format("%6.2f", getSquare()) +
                "; Угoл a : " + String.format("%6.2f", getDegreesToA()) +
                "; Угoл b : " + String.format("%6.2f", getDegreesToB()) +
                "; Угoл c : " + String.format("%6.2f", getDegreesToC());
    }




    public void chek2(double a, double b, double c) {
        if ((a + b) < c) {
            throw new IllegalArgumentException("Треугольник с такими параметрами не существует !");
        }
        if ((a + c) < b) {
            throw new IllegalArgumentException("Треугольник с такими параметрами не существует !");
        }
        if ((b + c) < a) {
            throw new IllegalArgumentException("Треугольник с такими параметрами не существует !");
        }

    }
}
