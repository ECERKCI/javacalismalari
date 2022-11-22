import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<customer> customers = new ArrayList<customer>();
        customers.add(new customer(1, "Ece", "ERKCİ"));
        customers.add(new customer(2, "Hamza", "KESKİNILIÇ"));
        customers.add(new customer(3, "Ege", "KESKİNKILIÇ"));
        for (customer customer : customers) {
            System.out.println(customer.firstName);
            System.out.println(customer.lastName);
        }
    }
}