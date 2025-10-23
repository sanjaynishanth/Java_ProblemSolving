package collection;
import java.util.*;

public class ListAllFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Create a list
	        List<String> fruits = new ArrayList<>();

	        // 1. Add elements
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Mango");

	        System.out.println("Original list: " + fruits);

	        // 2. Add element at specific index
	        fruits.add(2, "Orange"); // Insert at index 2
	        System.out.println("After adding Orange at index 2: " + fruits);

	        // 3. Get element at index
	        System.out.println("Element at index 3: " + fruits.get(3));

	        // 4. Set (replace) element at index
	        fruits.set(1, "Blueberry");
	        System.out.println("After setting Blueberry at index 1: " + fruits);

	        // 5. Remove element by value
	        fruits.remove("Cherry");
	        System.out.println("After removing 'Cherry': " + fruits);

	        // 6. Remove element by index
	        fruits.remove(2);
	        System.out.println("After removing element at index 2: " + fruits);

	        // 7. Check if list contains an element
	        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));
	        System.out.println("Contains 'Pineapple'? " + fruits.contains("Pineapple"));

	        // 8. Get index of an element
	        System.out.println("Index of 'Apple': " + fruits.indexOf("Apple"));

	        // 9. Check if list is empty
	        System.out.println("Is list empty? " + fruits.isEmpty());

	        // 10. Get size of the list
	        System.out.println("Size of list: " + fruits.size());

	        // 11. Iterate using for-each loop
	        System.out.print("Iterating using for-each: ");
	        for (String fruit : fruits) {
	            System.out.print(fruit + " ");
	        }
	        System.out.println();

	        // 12. Sort the list
	        Collections.sort(fruits);
	        System.out.println("Sorted list: " + fruits);

	        // 13. Reverse the list
	        Collections.reverse(fruits);
	        System.out.println("Reversed list: " + fruits);

	        // 14. Clear the list
	        fruits.clear();
	        System.out.println("After clearing, is list empty? " + fruits.isEmpty());
	        
	        System.out.print("IntegerList");
	        
	        // Create a list of integers
	        List<Integer> numbers = new ArrayList<>();

	        // 1. Add elements
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        System.out.println("Original list: " + numbers);

	        // 2. Add element at specific index
	        numbers.add(2, 25); // Insert at index 2
	        System.out.println("After adding 25 at index 2: " + numbers);

	        // 3. Get element at index
	        System.out.println("Element at index 3: " + numbers.get(3));

	        // 4. Set (replace) element at index
	        numbers.set(1, 99);
	        System.out.println("After setting 99 at index 1: " + numbers);

	        // 5. Remove element by value
	        numbers.remove(Integer.valueOf(30));  // use Integer.valueOf to remove by value
	        System.out.println("After removing 30: " + numbers);

	        // 6. Remove element by index
	        numbers.remove(2);
	        System.out.println("After removing element at index 2: " + numbers);

	        // 7. Check if list contains an element
	        System.out.println("Contains 10? " + numbers.contains(10));
	        System.out.println("Contains 50? " + numbers.contains(50));

	        // 8. Get index of an element
	        System.out.println("Index of 10: " + numbers.indexOf(10));

	        // 9. Check if list is empty
	        System.out.println("Is list empty? " + numbers.isEmpty());

	        // 10. Get size of the list
	        System.out.println("Size of list: " + numbers.size());

	        // 11. Iterate using for-each loop
	        System.out.print("Iterating using for-each: ");
	        for (Integer num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println();

	        // 12. Sort the list
	        Collections.sort(numbers);
	        System.out.println("Sorted list: " + numbers);

	        // 13. Reverse the list
	        Collections.reverse(numbers);
	        System.out.println("Reversed list: " + numbers);

	        // 14. Clear the list
	        numbers.clear();
	        System.out.println("After clearing, is list empty? " + numbers.isEmpty());
	    

	}

}


