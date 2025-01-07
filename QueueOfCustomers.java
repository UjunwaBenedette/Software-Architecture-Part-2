import java.util.ArrayList;
import java.util.List;

// Customer class definition
class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', id='" + id + "'}";
    }
}

// QueueOfCustomers class definition
class QueueOfCustomers {
    private List<Customer> customers;

    public QueueOfCustomers() {
        customers = new ArrayList<>();
        loadCustomers();
    }

    private void loadCustomers() {
        // Hardcoded customer data
        String[][] customerData = {
            {"Andrew Robertson", "X919"}, {"Ann Jones", "X064"}, {"Blair Foster", "X682"}, {"Bob Dawson", "X780"},
            {"Chris Smith", "X782"}, {"Dave Jackson", "X316"}, {"David Hunter", "X278"}, {"Donald Murray", "X720"},
            {"Fiona Thoms", "X475"}, {"Gillian Hamilton", "X386"}, {"Harry Johnston", "X857"}, {"Helen Webster", "X309"},
            {"Jack Houston", "X733"}, {"Jo Hill", "X285"}, {"Joe Woods", "X213"}, {"John Brown", "X009"},
            {"Judy Hilman", "X904"}, {"Keith Burns", "X552"}, {"Lily Watson", "X121"}, {"Lucy Grey", "X025"},
            {"Mary Brown", "X198"}, {"Pamela Field", "X521"}, {"Peter White", "X036"}, {"Robert Murray", "X606"},
            {"Susan Turner", "X214"}, {"Thomas Young", "X507"}, {"Tim Smith", "X020"}, {"Tony Lawson", "X086"},
            {"Ursula Milton", "X746"}, {"Viola Nicholson", "X540"}
        };

        for (String[] data : customerData) {
            customers.add(new Customer(data[0], data[1]));
        }
    }

    public boolean isEmpty() {
        return customers.isEmpty();
    }

    public Customer processNextCustomer() {
        return customers.isEmpty() ? null : customers.remove(0);
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        QueueOfCustomers queue = new QueueOfCustomers();

        while (!queue.isEmpty()) {
            Customer nextCustomer = queue.processNextCustomer();
            System.out.println("Processing: " + nextCustomer);
        }
    }
}
