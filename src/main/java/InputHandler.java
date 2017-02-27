import java.util.Scanner;

/**
 * Created by Mariana_Petrushchak on 27.02.2017.
 */
public class InputHandler {
    int a;
    int b;
    private String operator;

    public InputHandler(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st operand: ");
        a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter the 2nd operand: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter what operation to do. Allowed only + and -");
        operator = sc.nextLine();
        while  (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/"))
        {
            System.out.println("Incorrect Operator, Please enter either + or - or * or /");
            operator= sc.nextLine();
        }
    }

    public InputHandler(int a, int b, String operator){
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int getOperand1(){
        return this.a;
    }

    public int getOperand2(){
        return this.b;
    }

    public String getOperator(){
            return this.operator;
    }
}
