package com.bridgelaz;

import org.junit.Assert;
import org.junit.Test;

public class UpdatedFindMax {

        @Test
        public void givenThreeIntegerNumber_ReturnMaximumNumber_FromFirstPlace(){
            FindMaxNumber findmax=new FindMaxNumber();
            Integer maxInteger=findmax.checkMaxValue(80,10,30);
            Assert.assertEquals(Integer.valueOf(80),maxInteger);
        }
        @Test
        public void givenThreeIntegerNumber_ReturnMaximumNumber_FromSecoundplace(){
            FindMaxNumber findmax=new FindMaxNumber();
            Integer maxInteger=findmax.checkMaxValue(10,50,30);
            Assert.assertEquals(Integer.valueOf(50),maxInteger);
        }
        @Test
        public void givenThreeIntegerNumber_ReturnMaximumNumber_FromThirdplace(){
            FindMaxNumber findmax=new FindMaxNumber();
            Integer maxInteger=findmax.checkMaxValue(10,20,30);
            Assert.assertEquals(Integer.valueOf(30),maxInteger);
        }
        @Test
            public void givenThreeDoublesNumbers_ReturnMaximumNumberFromFirstPlace(){
            FindMaxNumber findmax=new FindMaxNumber();
            Double maxDouble=findmax.checkMaxValueDouble(30.00,10.00,15.00);
            Assert.assertEquals(Double.valueOf(30),maxDouble);
        }

    }




