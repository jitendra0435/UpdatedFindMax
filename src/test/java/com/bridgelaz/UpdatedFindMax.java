package com.bridgelaz;
import org.junit.Assert;
import org.junit.Test;

public class UpdatedFindMax {

    @Test
    public void givenThreeIntegerNumber_ReturnMaximumNumber_FromFirstPlace() {
        FindMaxNumber findMaxNumber=new FindMaxNumber(80,20,10);
        Assert.assertEquals(Integer.valueOf(80),findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeIntegerNumber_ReturnMaximumNumber_FromSecoundplace() {
         FindMaxNumber findMaxNumber=new FindMaxNumber(10,50,30);
        Assert.assertEquals(Integer.valueOf(50), findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeIntegerNumber_ReturnMaximumNumber_FromThirdplace() {
        FindMaxNumber findMaxNumber=new FindMaxNumber(10,20,30);
        Assert.assertEquals(Integer.valueOf(30), findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeDoublesNumbers_ReturnMaximumNumberFromFirstPlace() {
        FindMaxNumber findMaxNumber=new FindMaxNumber(30.00, 10.00, 15.00);
        Assert.assertEquals(Double.valueOf(30), findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeDoublesNumbers_ReturnMaximumNumberFromSecoundPlace() {
        FindMaxNumber findMaxNumber= new FindMaxNumber(10.00, 30.00, 15.00);
        Assert.assertEquals(Double.valueOf(30.00), findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeDoublesNumbers_ReturnMaximumNumberFromThirdPlace() {
        FindMaxNumber  findMaxNumber=new FindMaxNumber(10.00, 30.00, 50.00);
        Assert.assertEquals(Double.valueOf(50.00), findMaxNumber.checkMaxValue());
    }

    @Test
    public void givenThreeString_ReturnMaxFrom_firstplace() {
        FindMaxNumber findMaxNumber=new FindMaxNumber("peach", "apple", "banana");
        Assert.assertEquals("peach",findMaxNumber.checkMaxValue());

    }
    @Test
    public void givenThreeString_ReturnMaxFrom_Secoundplace() {
        FindMaxNumber findMaxNumber= new FindMaxNumber("apple", "peach", "banana");
        Assert.assertEquals("peach",findMaxNumber.checkMaxValue());

    }
    @Test
    public void givenThreeString_ReturnMaxFrom_Thirdplace() {
        FindMaxNumber findMaxNumber= new FindMaxNumber("banana", "apple", "peach");
        Assert.assertEquals("peach",findMaxNumber.checkMaxValue());
    }
}




