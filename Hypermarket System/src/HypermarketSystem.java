import java.util.*;

public class HypermarketSystem {
    private Queue<CustomerInformation> counter1;
    private Queue<CustomerInformation> counter2;
    private Queue<CustomerInformation> counter3;
    private Stack<CustomerInformation> completeStack;

    public HypermarketSystem() {
        counter1 = new LinkedList<>();
        counter2 = new LinkedList<>();
        counter3 = new LinkedList<>();
        completeStack = new Stack<>();
    }

    // Method to add a customer to the appropriate counter queue
    public void addCustomer(CustomerInformation customer) {
        int itemCount = customer.getItemList().size();

        if (itemCount <= 5) {
            if (counter1.size() <= counter2.size()) {
                counter1.add(customer);
            } else {
                counter2.add(customer);
            }
        } else {
            counter3.add(customer);
        }
    }

    // Method to process the payment for customers in the counters
    public void processPayment() {
        while (!counter1.isEmpty() || !counter2.isEmpty() || !counter3.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                if (!counter1.isEmpty()) {
                    CustomerInformation customer = counter1.poll();
                    completeStack.push(customer);
                    displayReceipt(customer);
                }

                if (!counter2.isEmpty()) {
                    CustomerInformation customer = counter2.poll();
                    completeStack.push(customer);
                    displayReceipt(customer);
                }
            }

            while (!counter3.isEmpty()) {
                CustomerInformation customer = counter3.poll();
                completeStack.push(customer);
                displayReceipt(customer);
            }
        }
    }

    // Method to display the customer details and items purchased
    public void displayReceipt(CustomerInformation customer) {
        System.out.println("Customer ID: " + customer.getCustId());
        System.out.println("Customer IC: " + customer.getCustIC());
        System.out.println("Counter Paid: " + customer.getCounterPaid());
        System.out.println("Items Purchased:");
        for (ItemInformation item : customer.getItemList()) {
            System.out.println("- " + item.getItemName() + ": RM " + item.getItemPrice());
        }
        System.out.println("Total Amount Paid: RM " + calculateTotalAmount(customer));
        System.out.println();
    }

    // Method to calculate the total amount paid by the customer
    private double calculateTotalAmount(CustomerInformation customer) {
        double totalAmount = 0.0;
        for (ItemInformation item : customer.getItemList()) {
            totalAmount += item.getItemPrice();
        }
        return totalAmount;
    }
}

