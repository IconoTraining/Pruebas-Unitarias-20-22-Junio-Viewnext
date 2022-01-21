package basic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculationTest {
    @Test
    public void testFindMax(){
        int[] input = new int[]{1,3,4,2};
        int output = Calculation.findMax(input);
        assertEquals(4, output);
    }


    @Test
    public void testFindMaxWhenMaxIsFirstElement(){
        int[] input = new int[]{7, 3, 2, -6};
        int output = Calculation.findMax(input);
        assertEquals(7, output);
    }

    @Test
    public void testFindMaxWhenMaxIsLastElement(){
        int[] input = new int[]{1,3,14,19};
        int output = Calculation.findMax(input);
        assertEquals(19, output);
    }

    @Test
    public void testFindMaxWhenMaxIsRepeated(){

        int[] input = new int[]{14,3,14,9};
        int output = Calculation.findMax(input);
        assertEquals(14, output);
    }

    @Test
    public void testFindMaxWithNegativeNumbers(){

        int[] input = new int[]{-18,-1,-14,-9};
        int output = Calculation.findMax(input);
        assertEquals(-1, output);
    }

    @Test
    void testFindMaxWithNull() {
        int arr[]=null;
        assertThrows(NullPointerException.class, ()->{Calculation.findMax(arr);});
    }

    @Test
    void testFindMaxWith1Element() {
        int[] input = {3};
        int output = Calculation.findMax(input);
        assertEquals(3, output);
    }


    @Test
    public void testReverseWord(){
        String input = "Hola qué tal";
        String actualOutput = Calculation.reverseWord(input);
        assertEquals("aloH éuq lat", actualOutput);
    }
}