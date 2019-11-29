package com.bridgelaz;

import org.junit.Assert;
import org.junit.Test;

public class UpdatedFindMax {

        @Test
        public void givenThreeIntegerNumber_ReturnMaximumNumber_FromFirstPlace(){
            FindMaxNumber findmax=new FindMaxNumber();
            Integer maxInteger=findmax.checkMaxValue(10,80,30);
            Assert.assertEquals(Integer.valueOf(10),maxInteger);
        }
    }




