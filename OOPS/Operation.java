import java.util.*;

public class Operation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Complex num1 = new Complex();
        System.out.print("Enter real no 1 : ");
        num1.real = sc.nextInt();
        System.out.print("Enter imag no 1 : ");
        num1.imag = sc.nextInt();

        Complex num2 = new Complex();
        System.out.print("Enter real no 2 : ");
        num2.real = sc.nextInt();
        System.out.print("Enter imag no 2 : ");
        num2.imag = sc.nextInt();

        Complex num3 = new Complex();
        num3 = num1.Add(num2);
        System.out.print("Sum ");
        num3.print();
        Complex num4 = new Complex();
        num4 = num1.sub(num2);
        System.out.print("Subtraction ");
        num4.print();
        Complex num5 = new Complex();
        num5 = num1.Product(num2);
        System.out.print("Product ");
        num5.print();
    }
}

class Complex {
    int real;
    int imag;

    Complex Add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    Complex sub(Complex next){
        Complex result = new Complex();
        result.real = this.real - next.real;
        result.imag = this.imag - next.imag;
        return result;
    }

    Complex Product(Complex next){
        Complex result = new Complex();
        result.real = this.real * next.real;
        result.imag = this.imag * next.imag;
        return result;
    }

    void print(){
        System.out.println(" of Numbers is : " + real + " + " + imag + "i");
    }
}
