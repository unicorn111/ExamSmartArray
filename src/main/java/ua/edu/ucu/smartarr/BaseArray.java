package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Base array for decorators
public class BaseArray implements SmartArray {
    Object[] arr;
    ArrayList<Object> ad_arr;
    public BaseArray(Object[] integers){
        this.arr = integers;
        this.ad_arr = new ArrayList<>();
    }

    public Object[] delete(Integer num){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == num){
                this.rem(i, arr);
            }
        }
        return arr;
    }

    public static Object[] rem(int index, Object[] array) {
        Object[] newArray = new Object[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (index > i) {
                newArray[i] = array[i];
            } else if(index < i) {
                newArray[i - 1] = array[i];
            }
        }
        return newArray;
    }


    @Override
    public Object[] toArray() {
        return arr;
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return arr.length;
    }
}

