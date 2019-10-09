import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] argc) {
        Triangle triangle1 = new Triangle(3, 4, 5);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(triangle1.toString());//вывод параметров об обьекте triangle1
        Triangle triangle2 = new Triangle(4, 5, 6);
        System.out.println(triangle2.toString());//вывод параметров об обьекте triangle2

        Triangle[] triangles = {triangle1, triangle2};
        //Triangles.getMaxSquare(triangles);//вызов метода поиска треугольника с наибольшей площадью
        System.out.println("Наибольшая площадь: " + Triangles.getMaxSquare(triangles));

        WriteTriangle writeTriangle1 = new WriteTriangle(3, 4, 5);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(writeTriangle1.toString());//вывод параметров обьекта writeTriangle1
        WriteTriangle writeTriangle2 = new WriteTriangle(8, 6, 10);//создание обьекта с тремя параметрами(сторонами)
        System.out.println(writeTriangle2.toString());

        WriteTriangle[] rightTriangles ={writeTriangle1, writeTriangle2};
        //WriteTriangle.getMinC(arrWriteTriangle);
        System.out.println("Минимальная гипотенуза: " + RightTriangles.getMinC(rightTriangles));

    }
}
