import java.util.LinkedList;

public class CheckoutLine {

    // TODO: declare the field that stores your Customer records.
    // Decide: ArrayList<Customer> or LinkedList<Customer>?
    LinkedList<String> Customer = new LinkedList<>();


    public void addToBack(Customer c) {
        // TODO
        Customer.addLast(c.getName());
    }

    public void addToFront(Customer c) {
        // TODO
        Customer.addFirst(c.getName());
    }

    public Customer removeFromFront() {
        // TODO
        Customer.removeFirst();
        return null;
    }

    public Customer removeFromBack() {
        // TODO
        Customer.removeLast();
        return null;
    }

    public int size() {
        // TODO
        if(Customer.isEmpty()){
            return 0;
        } else {
            return Customer.size();
        }
    }
}