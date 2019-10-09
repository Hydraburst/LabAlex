/*Класс прямоугольный треугольник который включает в себя функцию проверки: "является ли данный треугольник прямоугольным",
функцию поиска наименьшой гипотенузы треугольника, метод вывода параметров прямоугольного треугольника (стороны, углы и т.д.).
Данный класс является дочерним классом Треугольник, т.е. он наследует методы класса Треугольник */
public class WriteTriangle extends Triangle {
    static final String FORMAT = "%6.2f";


    public WriteTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    public double getPerimetr() {
        return getA() + getB() + getC();
    }

    public double halfPerimetr() {
        return getPerimetr() / 2;
    }

    public double getSquare() {
        return (Math.sqrt(halfPerimetr() * (halfPerimetr() - getA()) * (halfPerimetr() - getB()) * (halfPerimetr() - getC())));
    }

    public double getDegreesToA() {
        return Math.toDegrees(Math.acos((Math.pow(getB(), 2) + Math.pow(getC(), 2) - Math.pow(getA(), 2)) / (2 * getB() * getC())));
    }

    public double getDegreesToB() {
        return Math.toDegrees(Math.acos((Math.pow(getA(), 2) + Math.pow(getC(), 2) - Math.pow(getB(), 2)) / (2 * getA() * getC())));
    }

    public double getDegreesToC() {
        return Math.toDegrees(Math.acos((Math.pow(getA(), 2) + Math.pow(getB(), 2) - Math.pow(getC(), 2)) / (2 * getA() * getB())));
    }

    public String toString() {
        return "Сторона прямоугольного  треуглольника А = " + String.format("%6.2f", getA()) +
                "; Сторона прямоугольного треуглольника В = " + String.format("%6.2f", getB()) +
                "; Сторона прямоугольного треуглольника С = " + String.format("%6.2f", getC()) +
                "; Периметр прямоугольного треугольника = " + String.format("%6.2f", getPerimetr()) +
                "; Площадь прямоугольного треугольника = " + String.format("%6.2f", getSquare()) +
                "; Угoл a : " + String.format("%6.2f", getDegreesToA()) +
                "; Угoл b : " + String.format("%6.2f", getDegreesToB()) +
                "; Угoл c : " + String.format("%6.2f", getDegreesToC());
    }

    private void chek1(double a, double b, double c) {
        if (Math.pow(getC(), 2) != Math.pow(getB(), 2) + Math.pow(getA(), 2)) {
            throw new IllegalArgumentException("Треугольник не являеться прямоугольным, проверьте правильность вводимых данных , Квадрат гипотенузы должен равняться квадрату суммы катетов !");
        }
    }
}

