package day2;

public class RemoveFirstOccurence {
    public static void main(String[] args) {
        //4. Write a code to remove the first occurrence of a given “search string” from a string
        String originalString = "Hello world";
        String searchString = "ell";

        String resultString = removeFirstOccurrence(originalString, searchString);

        System.out.println("Original String: " + originalString);
        System.out.println("Search String: " + searchString);
        System.out.println("Result String: " + resultString);
    }

    public static String removeFirstOccurrence(String original, String search) {
        int index = original.toLowerCase().indexOf(search.toLowerCase());

        if (index != -1) {
            return original.substring(0, index) + original.substring(index + search.length());
        }

        return original;
    }
}
