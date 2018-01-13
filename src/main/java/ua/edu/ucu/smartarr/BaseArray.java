package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    Integer[] cop;
    public BaseArray(Integer[] integers){
        this.cop = integers;
        
    }
    public int get(int i){
        return cop[i];
    }
    public BaseArray delete(Integer num){
        for (int i=0; i<=cop.length; i++){
            if (cop[i] == num){
                cop[i] = null;
            }
        }
        return new BaseArray(cop);
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
        return cop.length;
    }
}


