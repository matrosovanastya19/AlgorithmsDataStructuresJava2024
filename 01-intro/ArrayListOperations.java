import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println("Original List: " + colors);

        System.out.println("Iterating over elements:");
        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(0, "Purple");
        System.out.println("After adding 'Purple' at the first position: " + colors);

        String elementAtIndex2 = colors.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        colors.set(2, "Orange");
        System.out.println("After updating element at index 2 to 'Orange': " + colors);

        colors.remove(2);
        System.out.println("After removing the third element: " + colors);

        boolean hasGreen = colors.contains("Green");
        System.out.println("Is 'Green' in the list? " + hasGreen);

        Collections.sort(colors);
        System.out.println("Sorted List: " + colors);

        ArrayList<String> colorsCopy = new ArrayList<>(colors);
        System.out.println("Copied List: " + colorsCopy);

        Collections.reverse(colors);
        System.out.println("Reversed List: " + colors);

        boolean areListsEqual = colors.equals(colorsCopy);
        System.out.println("Are the original and copied lists equal? " + areListsEqual);

        colors.clear();
        System.out.println("List after clearing: " + colors);

        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
        
        colors.ensureCapacity(10);
        System.out.println("Increased capacity of the list to hold at least 10 elements.");
        colors.add("Black");
        colors.add("White");
        System.out.println("List after adding elements to increase size: " + colors);

        colors.trimToSize();
        System.out.println("List after trimming capacity to size: " + colors);
    }
}