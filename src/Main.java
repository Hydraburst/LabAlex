import java.util.ArrayList;

public class Main {
    public static void main(String[] argc) {
        Triangle triangle1 = new Triangle(3, 4, 5);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(triangle1.toString());//вывод параметров об обьекте triangle1
        Triangle triangle2 = new Triangle(4, 5, 6);
        System.out.println(triangle2.toString());//вывод параметров об обьекте triangle2

        ArrayList<Triangle> arrtriangle = new ArrayList<>();//создание пустого массива треугольников
        arrtriangle.add(triangle1);//добавление обекьта triangle1 в массив
        arrtriangle.add(triangle2);//добавление обьекта triangle2 в массив
        triangle1.getMaxSquare(arrtriangle);//вызов метода поиска треугольника с наибольшей площадью

        WriteTriangle writeTriangle1 = new WriteTriangle(3, 4, 5);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(writeTriangle1.toString());//вывод параметров обьекта writeTriangle1
        WriteTriangle writeTriangle2 = new WriteTriangle(8, 6, 10);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(writeTriangle2.toString());

        ArrayList<WriteTriangle> arrWriteTriangle = new ArrayList<>();//создание массива
        arrWriteTriangle.add(writeTriangle1);//добавление обьекта в массив
        arrWriteTriangle.add(writeTriangle2);
        writeTriangle1.getMinC(arrWriteTriangle);//вызов метода поиска наименьшой гипотенузы
    }
}
