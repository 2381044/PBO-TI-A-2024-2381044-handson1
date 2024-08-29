public class TipeDataString {
    public static void main(String[] args) {
        // Perbedaan primitive dan nonprimitive

        String firstName = "Karla";
        String lastName = "Shanessa";

        //concat
            String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }
}
