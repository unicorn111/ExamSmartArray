package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(BaseArray smartArray) {
        super(smartArray);
        for (int i=0;i < smartArray.size();i++){
            for (int j=0;i < smartArray.size();i++){
                Integer n1 = (Integer)smartArray.get(i);
                if (n1.equals(smartArray.get(j)) == false){
                    smartArray.delete(smartArray.get(i));
                }
            }
    }}

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
