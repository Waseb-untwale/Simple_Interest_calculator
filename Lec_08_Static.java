import java.util.Scanner;

class farmer {
    int amount;
    float time;
    static float rate_of_interest;
    float simple_interest;

    static {
        rate_of_interest = 1.2f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        amount = scan.nextInt();
        System.out.println("Enter Time Duration: ");
        time = scan.nextFloat();

    }

    void compute() {
        simple_interest = (amount * time * rate_of_interest) / 100f;
    }

    void display() {
        System.out.println("> Simple Interest: " + simple_interest);
    }
}

public class Lec_08_Static {
    public static void main(String[] args) {
        farmer f1 = new farmer();
        farmer f2 = new farmer();

        f1.input();
        f1.compute();
        f1.display();

        f2.input();
        f2.compute();
        f2.display();
    }
}
