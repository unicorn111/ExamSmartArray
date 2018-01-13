package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{
    MyPredicate pr;

    public FilterDecorator(BaseArray smartArray, MyPredicate pr) {
        super(smartArray);
        this.pr = pr;
        for (int i=0;i < smartArray.size();i++){
            boolean numb = pr.test(smartArray.get(i));
            if (numb == false){
                smartArray.delete(smartArray.get(i));
            }
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
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
