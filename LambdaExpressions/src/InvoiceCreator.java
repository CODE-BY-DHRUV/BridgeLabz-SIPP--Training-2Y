import java.util.*;

class Invoice {
    int transactionId;

    Invoice(int id) {
        this.transactionId = id;
        System.out.println("Invoice created for Txn: " + id);
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {

        List<Integer> txnIds = Arrays.asList(501, 502, 503);

        // Constructor reference
        txnIds.stream()
                .map(Invoice::new)   // Instead of id -> new Invoice(id)
                .forEach(i -> {});
    }
}
