// arrays let u store a bunch of values in like a group
// if i had 20 different ages in a group of 20 people i woild create an array of 20



// this matches to the last line somehow
import java.util.Arrays ;

public class ArrayBasics {
    
    public static void main(String args[]) {

        int size = 2;
        double[] grades = new double[size] ; // 3 bins are reserved (we will need to store 4 values)


// the code below sets the value for each in the array (the first value in grades is 75.2 so if i printed the first value it would give 75.2)
        grades[0] = 75.2 ;
        grades[1] = 50.3 ;
        grades[2] = 80.9 ;
// this would be the same as the lines above        double grades = {75.2,50.3,80.9}

// we print each of the valueas and they match up
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);


        
        // this matches to above somehow and prints all values in one line rather than individually printing
        System.out.println(Arrays.toString(grades));



        System.out.print("good stuff");


        
    }
}
