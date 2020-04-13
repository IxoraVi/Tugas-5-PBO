package ageassert;
public class AgeAssert {
    public static void main(String[] args) {
        int age = 33;
        assert(age>0);
        if (age >= 18) {
            System.out.println("Congrats! You are an adult!");
        }
        else if (age<=18) {
            System.out.println("You are still Children!");
        }
        else {
            System.out.println("You dead!");
        }
    }
}
