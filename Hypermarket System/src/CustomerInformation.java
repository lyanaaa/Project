import java.util.*;

public class CustomerInformation {
    private int custId;
    private String custIC;
    private int counterPaid;
    private LinkedList<ItemInformation> itemList;

    // Constructor
    public CustomerInformation(int custId, String custIC, int counterPaid) {
        this.custId = custId;
        this.custIC = custIC;
        this.counterPaid = counterPaid;
        this.itemList = new LinkedList<>();
    }

    // Getters and Setters

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustIC() {
        return custIC;
    }

    public void setCustIC(String custIC) {
        this.custIC = custIC;
    }

    public int getCounterPaid() {
        return counterPaid;
    }

    public void setCounterPaid(int counterPaid) {
        this.counterPaid = counterPaid;
    }

    public LinkedList<ItemInformation> getItemList() {
        return itemList;
    }

    public void setItemList(LinkedList<ItemInformation> itemList) {
        this.itemList = itemList;
    }

    // Method to add an item to the customer's item list
    public void addItem(ItemInformation item) {
        itemList.add(item);
    }
}

