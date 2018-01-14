package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{
    MyPredicate pr;

    public FilterDecorator(BaseArray smartArray, MyPredicate pr) {
        super(smartArray);
        this.pr = pr;
        for (Object o: smartArray.toArray()){
            boolean numb = pr.test(o);
            if (numb == false){
                smartArray.delete((Integer) o);
            }
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
