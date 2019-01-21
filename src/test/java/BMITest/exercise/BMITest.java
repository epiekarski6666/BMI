package BMITest.exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {

    private BMI exercise = new BMI();

    @Test
    public void checkIfBmiIsCorrect() throws Exception {
        String result = exercise.checkBmi(75, 1.75);
        String expected = "good weight";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfHeightOrWeightIsSmallerThan0() throws Exception {
        String result = exercise.checkBmi(-5, 1.8);
        String expected = "I don't think so";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfHeightEquals0() {
        String result = exercise.checkBmi(80, 0);
        String expected = "do not divide by 0";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfBmiIsHigherThan25() {
        String result = exercise.checkBmi(80, 1.6);
        String expected = "you need to grow";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfBmiIsLowerThanShouldBe() {
        String result = exercise.checkBmi(60, 1.9);
        String expected = "get some weight";
        assertEquals(expected, result);
    }

    @Test
    public void checkIfBmiIsEqualTo25() {
        String result = exercise.checkBmi(81, 1.8);
        String expected = "you need to grow";
        assertEquals(expected, result);
    }
}