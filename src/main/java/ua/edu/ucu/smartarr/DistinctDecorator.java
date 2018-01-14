package ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(BaseArray smartArray) {
        super(smartArray);
        for (Object o: smartArray.toArray()){
            if (this.same(smartArray, o) == true){
                smartArray.delete((Integer) o);
                }
            }
    }

    public boolean same(BaseArray smartArray, Object o){
        int counter = 0;
        for (Object ob : smartArray.toArray()) {
            if (o.toString().equals(ob.toString())) {
                counter += 1;
            }
        }
        if (counter >=2){
            return true;
        }
        return false;
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
