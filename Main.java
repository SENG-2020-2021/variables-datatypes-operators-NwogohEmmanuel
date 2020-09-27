class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   // declare variables days the debtor defaulted, amount the debtor is to pay per day,amount the debtor paid and assign values to them
   
   //Declare the variable of the total amount the debtor is to pay, the days the debtor paid for, amount the debtor is left to pay, days the debtor has not payed for

   // calculate and print total amount the debtor is to pay

   // calculate and print the days the debtor paid for
  
  // calculate and print the amount whose day was not captured because the amount was incomplete

   // calculate and print amount the debtor is left to pay

   // calculate and print days the debtor has not payed for

   //kindly remove the statement below when you are done with the assignment
 
        int defaultedDays=25;
        int amountPerDay=640;
        int amountPaid=1440;

        int amountToPay;
        int daysPaidFor;
        int amount_Left_To_Pay;
        int days_Not_Paid;
        int amountNotPaidInDay;

        amountToPay=defaultedDays*amountPerDay;
        System.out.println("the amount to pay is "+amountToPay);

        daysPaidFor=amountPaid/amountPerDay;
        System.out.println("the days paid for are "+daysPaidFor);

        amountNotPaidInDay=amountPaid%amountPerDay;
        System.out.println("the amount that does not cover a day is "+amountNotPaidInDay);

        amount_Left_To_Pay=((defaultedDays-daysPaidFor)*amountPerDay)+(amountPerDay-amountNotPaidInDay);
        System.out.println("the amount left for the debtor to pay is "+amount_Left_To_Pay);

        days_Not_Paid=defaultedDays-daysPaidFor;
        System.out.println("the days debtor has not paid for are "+days_Not_Paid);





  }
}