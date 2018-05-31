package com.iuminov.binarysearch;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static com.iuminov.binarysearch.BinarySearch.find;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class BinarySearchTest {
    private int[] array;

    @Before
    public void init() {
        array = new int[] {1, 2, 4, 5, 8, 10, 12, 14};
    }

    @Test
    public void testBinarySearchHappyPathFirstElement() {
        int expectedResult = 0;
        int actualResult = find(1, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathSecondElement() {
        int expectedResult = 1;
        int actualResult = find(2, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathThirdElement() {
        int expectedResult = 2;
        int actualResult = find(4, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathFourthElement() {
        int expectedResult = 3;
        int actualResult = find(5, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathFifthElement() {
        int expectedResult = 4;
        int actualResult = find(8, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathSixthElement() {
        int expectedResult = 5;
        int actualResult = find(10, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathSeventhElement() {
        int expectedResult = 6;
        int actualResult = find(12, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchHappyPathLastElement() {
        int expectedResult = 7;
        int actualResult = find(14, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchSadPathMissingElementWithinRange() {
        int expectedResult = -1;
        int actualResult = find(11, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchSadPathMissingElementBelowRange() {
        int expectedResult = -1;
        int actualResult = find(-10, array);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBinarySearchSadPathMissingElementAboveRange() {
        int expectedResult = -1;
        int actualResult = find(30, array);

        assertEquals(expectedResult, actualResult);
    }
}