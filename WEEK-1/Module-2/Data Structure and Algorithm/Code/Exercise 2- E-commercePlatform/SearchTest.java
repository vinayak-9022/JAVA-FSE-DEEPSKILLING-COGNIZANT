public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Bag", "Fashion")
        };

        int searchId = 103;

        System.out.println("Linear Search:");

        Product result = SearchAlgorithms.linearSearch(products, searchId);

        if (result != null)
            result.display();
        else
            System.out.println("Product Not Found");

        System.out.println();

        System.out.println("Binary Search:");

        result = SearchAlgorithms.binarySearch(products, searchId);

        if (result != null)
            result.display();
        else
            System.out.println("Product Not Found");

    }
}