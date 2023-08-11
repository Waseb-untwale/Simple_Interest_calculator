            // ******* Bank of maharastra Loan system *******///

import java.util.Scanner;
class farmar{
    int pa;
    float td;
    static float ri;
    float si;

    static{
        ri=1.2f;
    }
    


void input(){
    Scanner scan = new Scanner(System.in);
    System.out.println("please Enter the amount required");
    pa=scan.nextInt();
    System.out.println("please enter the time duration(please enter your monthly time duration) for loan system ");
    td=scan.nextFloat();


}

void compute(){
    si=(pa*td*ri)/100f;
}

void disp(){
    System.out.println("Simple Interest of required amount is :"+si);
}
}




public class Lec_08_Static {
public static void main(String[] args){
farmar f1 = new farmar();
farmar f2 = new farmar();

f1.input();
f1.compute();
f1.disp();

f2.input();
f2.compute();
f2.disp();

    
}
}
