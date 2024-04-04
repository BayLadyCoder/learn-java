public class StringInterpolation {
    public static void main (String args[]) {
        String name = "Kevin";
        String streetName = "4131 California Avenue";
        int age = 35;
        String city = "Los Angeles";
        String state = "California";
        String zipcode = "90012";
        String country = "United States";

        System.out.println(
                String.format(
                        "Name: %s, Age: %d, Address: %s, City: %s, State: %s, Zipcode: %s, Country: %s"
                        , name, age, streetName, city, state, zipcode, country
                )
        );
    }
}
