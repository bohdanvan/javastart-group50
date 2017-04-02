/**
 * @author bvanchuhov
 */
public class IntegerVariable {

    public static void main(String[] args) {
        int age = 30;

        age = age + 10; // 40
        age += 10; // 50
        age += 1; // 51
        age++; // increment, 52
        ++age; // increment, 53
        age--; // decrement, 52
        --age; // decrement, 51

        System.out.println("age = " + age);
    }
}
