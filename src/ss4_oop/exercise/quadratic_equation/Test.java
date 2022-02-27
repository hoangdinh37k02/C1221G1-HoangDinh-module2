package ss4_oop.exercise.quadratic_equation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        double a = input.nextDouble();
        System.out.println("Enter b");
        double b = input.nextDouble();
        System.out.println("Enter c");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("The QuadraticEquation has a root: "+ quadraticEquation.getRoot1());
        }   else if (quadraticEquation.getDiscriminant()>0){
            System.out.println("The QuadraticEquation has root 1: "+ quadraticEquation.getRoot1()+" and root 2: "+quadraticEquation.getRoot2());
        }   else {
            System.out.println("The QuadraticEquation has no root");
        }
    }

}
