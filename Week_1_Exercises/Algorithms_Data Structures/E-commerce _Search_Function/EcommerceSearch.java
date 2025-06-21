package digital.nurture;

import java.util.*;


public class EcommerceSearch {

    // Linear search
    public static Product linearSearch(Product[] products, String key) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(key)) {
                return p;
            }
        }
        return null;
    }

    // Binary search
    public static Product binarySearch(Product[] products, String key) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = key.compareToIgnoreCase(products[mid].productName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }

    // Main Test Class
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Personal Care"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Book", "Stationery"),
            new Product(105, "Shoes", "Fashion")
        };

        // Linear Search
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Book");
        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");

        // Sort 
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, "Book");
        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
    }
}
