package com.bridgelaz;

public class FindMaxNumber {
    public static Integer checkMaxValue(Integer a, Integer b, Integer c) {
        Integer maxNumber;
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            maxNumber=a;
        else if(b.compareTo(a)>0&& b.compareTo(c)>0)
            maxNumber=b;
        else
            maxNumber=c;
        return maxNumber;
    }
}
