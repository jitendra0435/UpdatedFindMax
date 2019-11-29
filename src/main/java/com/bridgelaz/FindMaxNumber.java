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

    public Double checkMaxValueDouble(Double a,Double b, Double c) {
        Double maxDoubleNumber=0.0;
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            maxDoubleNumber=a;
        else if(b.compareTo(a)>0&& b.compareTo(c)>0)
            maxDoubleNumber=b;
        else
            maxDoubleNumber=c;
        return maxDoubleNumber;
    }

    public String checkMaxValueString(String a, String b, String c) {
        String maxString ;
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            maxString=a;
        else if(b.compareTo(a)>0&& b.compareTo(c)>0)
            maxString=b;
        else
            maxString=c;
        return maxString;

    }
}
