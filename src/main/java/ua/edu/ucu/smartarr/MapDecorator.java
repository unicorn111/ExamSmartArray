package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    MyFunction func;
    ArrayList<Object> arr;
    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.func = func;
        this.arr = new ArrayList<>();
        for (Object ob : smartArray.toArray()) {
            ob = func.apply(ob);
            arr.add(ob);
        }
        for (int i = 0; i< arr.size(); i++){
            smartArray.toArray()[i] = arr.get(i);
        }
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return smartArray.size();
    }
}
