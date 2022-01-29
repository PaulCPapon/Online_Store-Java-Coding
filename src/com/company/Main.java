package com.company;
import java.util.Scanner; //Scanner class to take user input.

public class Main {

    //Void function to print Welcome message and Items.
    public static void Shopping_Item() {

        System.out.println("Welcome to UWL online store.\nHere you can buy as much product you want.");
        System.out.println("NOTE:Press product id to buy the product and continue.");
        System.out.println("Press -1 to stop buying");


            System.out.println("Product ID & Items     Price\n" +
                    "1.     Laptop         £400.00\n" +
                    "2.     Tablet         £150.00\n" +
                    "3.     Iphone         £500.00\n" +
                    "4.     Keyboard       £50.00 \n");
    }



    public static void main(String[] args) {

        //Calling the function
        Shopping_Item();

        //Variables Item quantity
        int quantity_Laptop =0;
        int quantity_Tablet=0;
        int quantity_Iphone=0;
        int quantity_Keyboard=0;

        //Variables price item
        double price_Laptop =400.00;
        double price_Tablet =150.00;
        double price_Iphone =500.00;
        double price_Keyboard=50.00;


        //Variable totals
        double Sub_Total;

        //Declaration of Scanner class
        Scanner input= new Scanner(System.in);

        //Staring of While Loop.
        while(true){
            //Declaration of String variable.
            String Online_shopping = input.nextLine().trim();
            //if condition unless users put -1
            if(!Online_shopping.equals("-1")) {
                //Different switch cases
                switch (Online_shopping) {
                    // Case 1 for Laptop
                    case "1":
                        System.out.println("How many do you wish to buy?");
                        Scanner laptop = new Scanner(System.in);
                        quantity_Laptop = laptop.nextInt();
                        System.out.println("You have added successfully " +quantity_Laptop+ " Laptop in your basket");
                        break;
                    //Case 2 for Tablet
                    case "2":
                        System.out.println("How many do you wish to buy?");
                        Scanner tablet = new Scanner(System.in);
                        quantity_Tablet = tablet.nextInt();
                        System.out.println("You have added successfully " +quantity_Tablet+ " Tablet in your basket");
                        break;
                    //Case 3 for Iphone
                    case "3":
                        System.out.println("How many do you wish to buy?");
                        Scanner iphone = new Scanner(System.in);
                        quantity_Iphone = iphone.nextInt();
                        System.out.println("You have added successfully " +quantity_Iphone+ " Iphone in your basket");
                        break;
                    //Case 4 for Keyboard
                    case "4":
                        System.out.println("How many do you wish to buy?");
                        Scanner keyboard = new Scanner(System.in);
                        quantity_Keyboard = keyboard.nextInt();
                        System.out.println("You have added successfully " +quantity_Keyboard+ " Keyboard in your basket");
                        break;
                    //Default message to show
                    default:
                        System.out.println("You enter an invalid input:(\nPlease entre a product Id to continue");
                        break;
                }
            }
            //Else condition
            else{
                // Variable Total create to use for checkout and total.
                final var Total = (quantity_Laptop * price_Laptop) + (quantity_Tablet * price_Tablet) + (quantity_Iphone * price_Iphone)
                        + (quantity_Keyboard * price_Keyboard);

                //Different case of if statement used to get right output based on purchase.
                if (quantity_Laptop>0 && quantity_Tablet== 0 && quantity_Iphone ==0 && quantity_Keyboard==0 ){
                    Sub_Total = quantity_Laptop * price_Laptop;
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops for "+Sub_Total);
                }
                else if (quantity_Tablet>0 && quantity_Laptop== 0 && quantity_Iphone ==0 && quantity_Keyboard==0 ){
                    Sub_Total = quantity_Tablet * price_Tablet;
                    System.out.println("You have purchased successfully " + quantity_Tablet + " Tablets for "+Sub_Total);
                }
                else if (quantity_Iphone>0 && quantity_Laptop== 0 && quantity_Tablet ==0 && quantity_Keyboard==0 ){
                    Sub_Total = quantity_Iphone * price_Iphone;
                    System.out.println("You have purchased successfully " + quantity_Iphone + " Iphone for "+Sub_Total);
                }
                else if (quantity_Keyboard>0 && quantity_Laptop== 0 && quantity_Tablet ==0 && quantity_Iphone==0 ) {
                    Sub_Total = quantity_Keyboard * price_Keyboard;
                    System.out.println("You have purchased successfully " + quantity_Keyboard + " Iphone for " + Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet> 0 && quantity_Iphone ==0 && quantity_Keyboard==0 ){
                    Sub_Total = (quantity_Laptop * price_Laptop) + (quantity_Tablet * price_Tablet);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops and " +quantity_Tablet+ "Tablet for "+
                            Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet== 0 && quantity_Iphone >0 && quantity_Keyboard==0 ){
                    Sub_Total = (quantity_Laptop * price_Laptop) + (quantity_Iphone * price_Iphone);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops and " +quantity_Iphone+ "Iphone for "+
                            Sub_Total);
                }
                else if (quantity_Laptop==0 && quantity_Tablet> 0 && quantity_Iphone >0 && quantity_Keyboard==0 ){
                    Sub_Total = (quantity_Tablet * price_Tablet) + (quantity_Iphone * price_Iphone);
                    System.out.println("You have purchased successfully " + quantity_Tablet + " Tablets and " +quantity_Iphone+ "Iphone for "+
                            Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet== 0 && quantity_Iphone ==0 && quantity_Keyboard>0 ){
                    Sub_Total =(quantity_Laptop * price_Laptop) + (quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops and " +quantity_Keyboard+ "Keyboards for "+
                            Sub_Total);
                }
                else if (quantity_Laptop==0 && quantity_Tablet> 0 && quantity_Iphone ==0 && quantity_Keyboard>0 ){
                    Sub_Total= (quantity_Tablet* price_Tablet)+ (quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Tablet + " Tablet and " +quantity_Keyboard+ "Keyboard for "+
                            Sub_Total);
                }
                else if (quantity_Laptop==0 && quantity_Tablet==0 && quantity_Iphone >0 && quantity_Keyboard>0 ){
                    Sub_Total = (quantity_Iphone*price_Iphone)+(quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Iphone + " Iphone and " +quantity_Keyboard+ "Keyboard for "+
                            Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet> 0 && quantity_Iphone >0 && quantity_Keyboard==0 ){
                    Sub_Total = (quantity_Laptop*price_Laptop)+(quantity_Tablet*price_Tablet)+(quantity_Iphone*price_Iphone);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops, " +quantity_Tablet+ "Tablet and "+
                            quantity_Iphone+"Iphone for "+ Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet> 0 && quantity_Iphone ==0 && quantity_Keyboard>0 ){
                    Sub_Total = (quantity_Laptop*price_Laptop)+(quantity_Tablet*price_Tablet)+(quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops, " +quantity_Tablet+ "Tablet and "+
                            quantity_Keyboard+"Keyboard for "+ Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet== 0 && quantity_Iphone >0 && quantity_Keyboard>0 ){
                    Sub_Total = (quantity_Laptop*price_Laptop)+(quantity_Iphone*price_Iphone)+(quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops, " +quantity_Keyboard+ "Keyboard and "+
                            quantity_Iphone+"Iphone for "+ Sub_Total);
                }
                else if (quantity_Laptop==0 && quantity_Tablet> 0 && quantity_Iphone >0 && quantity_Keyboard>0 ){
                    Sub_Total = (quantity_Tablet*price_Tablet)+(quantity_Iphone*price_Iphone)+(quantity_Keyboard*price_Keyboard);
                    System.out.println("You have purchased successfully " + quantity_Keyboard + " Keyboards, " +quantity_Tablet+ "Tablet and "+
                            quantity_Iphone+"Iphone for "+ Sub_Total);
                }
                else if (quantity_Laptop>0 && quantity_Tablet> 0 && quantity_Iphone >0 && quantity_Keyboard>0 ){
                     double Sub_Total1 = Total;
                    System.out.println("You have purchased successfully " + quantity_Laptop + " Laptops, " +quantity_Tablet+ " Tablet, "+
                            quantity_Iphone+" Iphone and "+ quantity_Keyboard + " Keyboards for " + Sub_Total1);
                }
                //Total price to show
                System.out.println("Total Price:  £" + Total);
                //Giving options to user for checkout or go back to store again
                System.out.println("Press 5 to shop again, or Press 6 for going to checkout and finish your shopping activity");
                //Using try and catch method
                try{
                //Scanner to get input from user
                Scanner Exit_Checkout = new Scanner(System.in);
                //Store the user input value
                int inp = Exit_Checkout.nextInt();
                //go back to shopping
                if (inp == 5){
                    Shopping_Item();
                }
                //go to checkout
                else if (inp == 6){
                    System.out.print("Checkout " +"\n"+'£' );
                    System.out.println(Total);
                    System.exit(1);
                }
                //invalid input checking
                else if (inp < 5 || inp > 6 ) {
                    System.out.println("Invalid input");
                    Shopping_Item();
                }
            }catch (Exception e){
                //invalid message to show.
                System.out.println("Invalid input");
                Shopping_Item();
            }}
        }
    }
}