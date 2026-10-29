public class Main {
    public static void main(String[] args) {

        String a = "Pranav";
        String b = "Pranav";
        String c = " Java Programming ";

        // 1. Length
        System.out.println("Length: " + a.length());

        // 2. Uppercase
        System.out.println("Uppercase: " + a.toUpperCase());

        // 3. Lowercase
        System.out.println("Lowercase: " + a.toLowerCase());

        // 4. Character at index
        System.out.println("Character: " + a.charAt(0));

        // 5. Equals
        System.out.println("Equals: " + a.equals(b));

        // 6. Equals Ignore Case
        System.out.println("Ignore Case: " + a.equalsIgnoreCase("PRANAV"));

        // 7. == Operator
        System.out.println("Reference: " + (a == b));

        // 8. Contains
        System.out.println("Contains: " + a.contains("ana"));

        // 9. Starts With
        System.out.println("Starts With: " + a.startsWith("Pra"));

        // 10. Ends With
        System.out.println("Ends With: " + a.endsWith("av"));

        // 11. Trim
        System.out.println("Trim: " + c.trim());

        // 12. Replace
        System.out.println("Replace: " + a.replace("a", "o"));

        // 13. Substring
        System.out.println("Substring: " + a.substring(2));

        // 14. Substring with start and end
        System.out.println("Substring Range: " + a.substring(0, 3));

        // 15. Index Of
        System.out.println("Index Of: " + a.indexOf("a"));

        // 16. Last Index Of
        System.out.println("Last Index Of: " + a.lastIndexOf("a"));

        // 17. Is Empty
        System.out.println("Is Empty: " + "".isEmpty());

        // 18. Is Blank (Java 11+)
        System.out.println("Is Blank: " + "   ".isBlank());

        // 19. Concat
        System.out.println("Concat: " + a.concat(" Mundhe"));

        // 20. Compare To
        System.out.println("Compare To: " + "Java".compareTo("Java"));

        // 21. To Char Array
        char[] arr = a.toCharArray();
        System.out.println("Char Array: " + arr[0]);

        // 22. Repeat (Java 11+)
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // 23. Replace First
        System.out.println("Replace First: " + "banana".replaceFirst("a", "o"));

        // 24. Split
        String[] words = "Java is easy".split(" ");
        System.out.println("Split: " + words[0]);

        // 25. Value Of
        int num = 100;
        String result = String.valueOf(num);
        System.out.println("Value Of: " + result);

        // 26. Intern
        String x = new String("Hello");
        String y = x.intern();
        System.out.println("Intern: " + (y == "Hello"));

        // 27. Format
        String name = "Omkar";
        System.out.println(String.format("Hello %s", name));

        // 28. Matches
        System.out.println("Matches: " + "123".matches("\\d+"));

        // 29. Join
        System.out.println("Join: " + String.join("-", "Java", "Core"));

        // 30. Get Bytes
        System.out.println("Bytes Length: " + a.getBytes().length);
    }
}