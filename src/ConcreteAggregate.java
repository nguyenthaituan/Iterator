
public class ConcreteAggregate extends Aggregate{
    
    int A[] = {1,2,3,4,5,6,7,8,9};

    public int[] getA() {
        return A;
    }
    
    public int count(){
        return A.length;
    }

    public int getItem(int i) {
        return A[i];
    }
   
    @Override
    public Iterator CreateIterator() {
      return new ConcreateIterator(this);
    }
    

}
