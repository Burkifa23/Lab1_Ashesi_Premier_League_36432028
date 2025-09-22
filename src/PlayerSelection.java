import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {

        // Variable Declaration
        String name;
        int age;
        int jerseyNum;
        double height;
        double weight;

        // In order to make final decision and use increment and decrement
        // a player will be given a certain amount of points
        // if the points will be greater than 7 the player will play
        int playingPoints =1;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the player's name: ");
        name = input.nextLine();
        System.out.print("What is the player's age: ");
        age = input.nextInt();
        System.out.print("What is the player's height (in meters): ");
        height = input.nextDouble();
        System.out.print("What is the player's weight (in pounds): ");
        weight = input.nextDouble();
        System.out.print("What is the player's jersey number: ");
        jerseyNum = input.nextInt();

        // Print Values
        // Name
        System.out.println("Player: "+ name);

        // Age
        System.out.print("Age: "+ age);
        // Age Category
        if(age<20){
            System.out.println(" Rising Star");
            playingPoints++;
        } else if (age>20 && age<30) {
            System.out.println(" Prime Player");
            playingPoints++;
        } else if (age>=30) {
            System.out.println(" Veteran");
            playingPoints--;
        } else{
            System.out.println(" Invalid Age");
            playingPoints--;
        }

        // Height
        final int meter = 100;
        // convert m to cm
        height *= meter;

        System.out.println("Height: "+ (int)height+"cm");



        // Weight
        final double pound =  0.45359237;
        // convert lb to Kg
        weight *= pound;
        System.out.println("Weight: " + (int)weight +"kg");


        // Jersey Number
        System.out.println("Jersey: " + jerseyNum);

        // Position
        System.out.print("Position: ");
        boolean isAttacker;
        switch (jerseyNum){
            case 1:
                System.out.println("Goalkeeper");
                isAttacker =false;
                playingPoints++;
                break;
            case 2:
            case 5:
                System.out.println("Defender");
                isAttacker =false;
                playingPoints++;
                break;
            case 6:
            case 8:
                System.out.println("Midfielder");
                isAttacker =true;
                playingPoints++;
                break;

            case 7:
            case 11:
                System.out.println("Winger");
                isAttacker =true;
                playingPoints++;
                break;


            case 9:
                System.out.println("Striker");
                isAttacker =true;
                playingPoints++;
                break;
            case 10:
                System.out.println("Playmaker");
                isAttacker =true;
                playingPoints++;
                break;

            default:
                System.out.println("Player position not known");
                isAttacker =false;
                playingPoints--;

        }
        // Attacking Jersey
        System.out.print("Attacker Jersey: ");
        if(isAttacker) {
            System.out.println("Yes");
            playingPoints++;
        }
        else {
            System.out.println("No");
            playingPoints--;
        }

        // Eligibility
        System.out.println("Eligibility: " + ((age>=18&&age<35&&weight<90)?"Eligible":"Not Eligible"));


        // Line up Decision

        if(age>20 && age<30){
            if(weight<80){
                System.out.println("Lineup Decision: Starting Lineup");
                playingPoints++;
            }else{
                System.out.println("Lineup Decision: Bench");
                playingPoints--;
            }
        } else{
            System.out.println("Lineup Decision: Bench");
            playingPoints--;
        }

        // Final Decision
        if(playingPoints>2)
            System.out.println("Final Decision: Play");

        else
            System.out.println("Final Decision: Rest");

    }
}
