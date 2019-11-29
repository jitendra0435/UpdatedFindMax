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

}




