import java.util.Scanner; // this basically puts in code to let there be a input code

public class madbuggycalculator {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in); // this is the second line needed to add the scanner

System.out.println("insert no. one");
float a = sc.nextInt();
System.out.println("First Number: " + a);

System.out.println("what to do with this number?:");
System.out.println("1 = plus, 2 = minus, 3 = times:");
int b = sc.nextInt();

if (b == 1) {
    System.out.println("u want to plus it");
}
else {
    if (b == 2) {
    System.out.println("u want to minus it");
    }
    else {
        if (b == 3) {
        System.out.println("u want to times it");
 {
    System.out.println("u didnt do 1 2 3");
}
        }
    }
}
    
    



System.out.println("insert no. two");
float c = sc.nextInt();
System.out.println("Second Number: " + c);

if (b == 1) {
    System.out.println(a + c);
}
if (b == 2) {
    System.out.println(a - c);
}
if (b == 3) {
    System.out.println(a * c);
}

else {
    System.out.println("u dumb dog");
}

sc.close(); // put this at the end of scanners or bugs
    }
}

