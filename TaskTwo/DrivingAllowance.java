package TaskTwo;

import java.util.Scanner;

public class DrivingAllowance {

    public Scanner scanner = new Scanner(System.in);
    public String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public int totalCashback;
    public int moneyBack;

    public DrivingAllowance() {
        totalCashback = 0;
    }


    // Method takes input and parses to data we can use, here integers. try/catch for user input error
    public int[] createDrivingAllowanceFromString(){
        int month = 0;
        int timesDriven = 0;

        try{
            String[] input = scanner.nextLine().split(",");
            month = Integer.parseInt(input[0]);

            if(month <= 0 || month > 12){
                System.out.println("Invalid month. Please try again.");
                return createDrivingAllowanceFromString();
            }

            timesDriven = Integer.parseInt(input[1]);
            if(timesDriven <= 0 || timesDriven > 12){
                System.out.println("Your times driven is either zero or more than twelve! Please try again.");
                return createDrivingAllowanceFromString();
            }

        }
        catch(NumberFormatException e){
            System.out.println("Error! The input must be a number. Please try again.");
            return createDrivingAllowanceFromString();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error! You only gave one parameter, you need to enter both a month and how many times you drove! Please try again.");
            return createDrivingAllowanceFromString();
        }
        return new int[]{month, timesDriven};
    }

    public int calculateCashback(int month, int timesDriven){
        moneyBack = (month <= 6) ? timesDriven * 60 : timesDriven * 80;         // Ternary if statement - boolean, if true do first thing, else do second thing
        totalCashback += moneyBack;
        return moneyBack;
    }

    public void registerDrivesDialog(){
        System.out.println("Welcome to the FC Football Club's driver registration program");

        while(true){
            System.out.println("Please enter the month and how many times you drove in that month. \n(ei. 2,5 for driving five times in February)");

            int[] input = createDrivingAllowanceFromString();
            int month = input[0];
            int timesDriven = input[1];
            int moneyBack = calculateCashback(month, timesDriven);

            System.out.println("Your cashback for the month of " + months[month] + " is: " + moneyBack + "\n Your total cashback thus far is: " + totalCashback);

            System.out.println("Would you like to add another month to the cashback? Y/N");
            String answer = scanner.nextLine().toUpperCase();
            if(!answer.equals("Y")){
                break;
            }

        }
        System.out.println("Thanks for driving the team! " + totalCashback + "kr. will be deposited into your account");
        scanner.close();
    }



}
