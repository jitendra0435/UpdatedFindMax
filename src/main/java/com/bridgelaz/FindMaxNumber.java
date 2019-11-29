package com.bridgelaz;

public class FindMaxNumber {

    public static<E extends Comparable>E checkMaxValue(E firstValue,E secoundValue, E thirdValue) {

        if(firstValue.toString().compareTo(secoundValue.toString())>0 &&
                firstValue.toString().compareTo(thirdValue.toString())>0){
            return firstValue;
        }
        else if(secoundValue.toString().compareTo(firstValue.toString())>0 &&
                secoundValue.toString().compareTo(thirdValue.toString())>0){
            return secoundValue;
        }
        else
            return  thirdValue;
    }

}
