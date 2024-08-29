import java.lang.invoke.StringConcatFactory;

public class TipeDataString {
    public static void main(String[] args) {
        //perbedaan prim dan non prim

        String firstName = "Felicia";
        String lastName = "Ketaren";

        // concat
        //String fullName = firstName+ " " + lastName;

        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }

}
