package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    public SortDecorator(BaseArray smartArray, MyComparator cmp) {
        super(smartArray);
        for (int i=0;i < smartArray.size();i++){
            for (int j=0;i < smartArray.size();i++){
                Integer num = cmp.compare((Object) smartArray.get(i), (Object) smartArray.get(j));
                if (num < 0){
                    smartArray.delete(smartArray.get(i));
                }
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
        return 0;
    }
}
