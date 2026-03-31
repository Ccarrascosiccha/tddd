package edu.pe.cibertec;

public class Triangle {

    public enum TriangleType{
        EQUILATERAL,
        ISOCELES,
        SCALENE,
        INVALID
    }
    public TriangleType classify(int a, int b, int c) {
        if (a ==b & b==c) {
            return TriangleType.EQUILATERAL;
        }
            return TriangleType.SCALENE;
    }
}
