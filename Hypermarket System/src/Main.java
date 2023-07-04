import java.util.LinkedList;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try{
            //create file reader to read input file
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\User\\eclipse-workspace\\Hypermarket System\\src\\customerList.txt"));
        
            //create arraylist named patientList
            HypermarketSystem hypermarketSystem = new HypermarketSystem();

            // Read input from file and create customer and item objects
             // Sample code to read from a file and create customers and items
            LinkedList<CustomerInformation> customerList = new LinkedList<>();
            // Read the file and populate the customerList

            // Add customers to the HypermarketSystem
             for (CustomerInformation customer : customerList) {
                hypermarketSystem.addCustomer(customer);
            }

            // Process the payment and display receipts
            hypermarketSystem.processPayment();
        }//close try
        
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found");
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }
}

