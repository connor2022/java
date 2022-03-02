public class ifs {
    public static void main(String[] args) {

       boolean value = false;
       if (value) {
           System.out.println("this will  print if the value is true");
       }

       if (!value) {
           System.out.println("this will  print if the value is false");
       }

       System.out.println("_");
       System.out.println("_");

      //the code below runs a bank code and whether or not u can make a withdrawl  

      System.out.println("this is ur bank balance");
       double bankBalance = 1000; //set ur bank balance

       System.out.println(bankBalance);
       if(bankBalance <= 0) {
           System.out.println("u are mad poor my dude");
       }

       if(bankBalance > 0) {
           System.out.println("at least u aint broke");
       }

       double withdrawlAmount = 100.0 ;  // set how much u want to withdrawl
       System.out.println("you want to make a withdrawl of ");
       System.out.println(withdrawlAmount);

       if (bankBalance >= withdrawlAmount) {
           System.out.println("u can make a withdrawl");
       }
       if (bankBalance < withdrawlAmount) {
        System.out.println("u cannot make a withdrawl");
    }
System.out.println("ur new bank balance is");
System.out.println(bankBalance - withdrawlAmount);

    }
}
