package com.bridgelaz;

public class FindMaxNumber <E extends Comparable>{
    E firstValue;
    E secoundValue;
    E thirdValue;

    public FindMaxNumber(E a, E b, E c) {
        this.firstValue = a;
        this.secoundValue = b;
        this.thirdValue = c;
    }

    E checkMaxValue(){
        return getCheckMaxVal(firstValue,secoundValue,thirdValue);
    }
    public E getCheckMaxVal(E a, E b, E c) {

        if(a.toString().compareTo(b.toString())>0 &&
                a.toString().compareTo(c.toString())>0){
            return a;
        }
        else if(b.toString().compareTo(a.toString())>0 &&
                b.toString().compareTo(c.toString())>0){
            return b;
        }
        else
            return  c;
    }
}
