package edu.pe.cibertec;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static edu.pe.cibertec.Triangle.TriangleType.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

@DisplayName("Triangule - Triangle Classifier")
public class TriangleTest {

    private Triangle triangle;
     @BeforeEach

    void setUp(){
          triangle = new Triangle();
     }

     @Test
    @DisplayName("Three equal sides return EQUILATERAL")
    void givenThreeEqualSides_whenClassify_thenEquilateral(){
         assertEquals(EQUILATERAL, triangle.classify(4,4,4));
     }
    @Test
    @DisplayName("Two equal sides return ISOCELES")
    void givenTwoEqualSides_whenClassify_thenIsoceles(){
        assertEquals(ISOSCELES, triangle.classify(1,2,4));
    }
    @Test
    @DisplayName("Side equal to sum of other two returns INVALID")
    void givenSideEqualToSumOfOtherTwo_whenClassify_thenInvalid(){
        assertEquals(INVALID, triangle.classify(1,2,3));
    }
    @Test
    @DisplayName("Side greater than sum of other two returns INVALID")
    void givenSideEqualToGreaterThanSumOfOtherTwo_whenClassify_thenInvalid(){
        assertEquals(INVALID, triangle.classify(1,2,10));
    }
    @Test
    @DisplayName("Side with zero values returns INVALID")
    void givenZeroSide_whenClassify_thenInvalid(){
        assertEquals(INVALID, triangle.classify(8,0,8));
    }
    @Test
    @DisplayName("Side with negative values returns INVALID")
    void givenNegativeSide_whenClassify_thenInvalid(){
        assertEquals(INVALID, triangle.classify(-20,0,8));
    }
}
