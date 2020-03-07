import org.w3c.dom.ls.LSOutput;

public class Exercise3 {

    public static void main(String[] args) {
        // your code needs to go here!
        int sum = String.valueOf(321)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);


    }

}
    /*int n = 321;
    int sum = String.valueOf(n)
            .chars()
            .map(Character::getNumericValue)
            .sum();
 */