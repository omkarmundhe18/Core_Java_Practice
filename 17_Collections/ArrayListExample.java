import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {

        // 1. Create ArrayList
        ArrayList<String> students = new ArrayList<>();

        // 2. Add elements
        students.add("Omkar");
        students.add("Rahul");
        students.add("Sakshi");
        students.add("Amit");

        // 3. Display ArrayList
        System.out.println("Students: " + students);

        // 4. Add at first and last position
        students.add(0, "Akash");
        students.add("Priya");

        // 5. Get element
        System.out.println("Student at index 2: " + students.get(2));

        // 6. Update element
        students.set(1, "Rohit");

        // 7. Remove element
        students.remove("Rahul");

        // 8. Check element
        System.out.println("Contains Omkar: " + students.contains("Omkar"));

        // 9. Find size
        System.out.println("Total Students: " + students.size());

        // 10. Display using for-each
        System.out.println("Student List:");

        for (String name : students) {
            System.out.println(name);
        }

        // 11. Check empty
        System.out.println("Is Empty: " + students.isEmpty());

        // 12. Clear ArrayList
        students.clear();

        System.out.println("After Clear: " + students);
    }
}