
public class ConcreateIterator extends Iterator{
    ConcreteAggregate A;
    int position;

    public ConcreateIterator(ConcreteAggregate A) {
        this.A = A;
        this.position = 0;
    }

    @Override
    public int first() {
        this.position = 0;
        return A.getItem(0);
    }

    @Override
    public int next() {
        if(!this.isDone()){
            this.position += 1;
            return A.getItem(position);
        }
        return this.currentItem();
    }

    @Override
    public boolean isDone() {
        return this.position == A.count() - 1;
    }

    @Override
    public int currentItem() {
        return A.getItem(position);
    }
  
}
