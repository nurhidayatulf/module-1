package day1;

public class NameInitial {
    public static void main(String[] args) {
        //5. Print your name initial in uppercase
        String myName = "Nur Hidayatul Fatihah";

        // Split the name into parts
        String[] myNameParts = myName.split(" ");

        // Initialize a StringBuilder to hold the initials
        StringBuilder initials = new StringBuilder();

        // Loop through each part of the name and get the first letter
        for (String part : myNameParts) {
            initials.append(part.charAt(0));
        }

        // Print the initials in uppercase
        System.out.println(initials.toString().toUpperCase());
    }
}
