
public class BT_main {

   
    public static void main(String[] args) {
        ConcreteAggregate ag = new ConcreteAggregate();
        Iterator it = ag.CreateIterator();

        System.out.println("Phần tử hiện tại: " + it.currentItem());
        System.out.println("Phần tử tiếp theo: " + it.next());
        System.out.println("Phần tử tiếp theo: " + it.next());
        System.out.println("Phần tử tiếp theo: " + it.next());
        System.out.println("Phần tử tiếp theo: " + it.next());
        System.out.println("Phần tử tiếp theo: " + it.next());
        System.out.println("Phần tử hiện tại: " + it.currentItem());
        
        System.out.println("Phần tử đầu tiên: " + it.first());
        System.out.println("Phần tử tiếp theo: " + it.next());
    }
    
}
