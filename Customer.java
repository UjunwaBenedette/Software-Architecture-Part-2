import java.util.ArrayList;
import java.util.List;

// Customer class representing a customer with name and id
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
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

// QueueOfCustomers class representing a queue of customers
class QueueOfCustomers {
    private List<Customer> customers;
    private double price;

    public QueueOfCustomers() {
        customers = new ArrayList<>();
        price = 20.0; // default price is $20
        loadCustomers();
    }

    // Load hardcoded customer data into the queue
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

    // Check if the queue is empty
    public boolean isEmpty() {
        return customers.isEmpty();
    }

    // Process the next customer in the queue
    public Customer processNextCustomer() {
        return customers.isEmpty() ? null : customers.remove(0);
    }

    // Get the price
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        QueueOfCustomers queue = new QueueOfCustomers();

        // Process customers in the queue
        while (!queue.isEmpty()) {
            Customer customer = queue.processNextCustomer();
            System.out.println("Processing customer: " + customer);
            System.out.println("Price: $" + queue.getPrice());
            System.out.println();
        }
    }
}
