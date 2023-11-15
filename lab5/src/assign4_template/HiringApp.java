//Assign 4, HiringApp
package assign4_template;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class HiringApp {

    public static void main(String[] args) {

        //Define the data structures for 3 different groups of people:
        //  new applicants
        //  current employees (those who were hired), 
        //  past employees (those who were fired)
        //
        //Hint: for queue: Queue<Person>,  ArrayDeque, LinkedList
        //      for stack: Deque<Person>   ArrayDeque, LinkedList
        Queue<Person> aplicants = new LinkedList<>();
        Deque<Person> pastEmployee = new LinkedList<>();
        Deque<Person> currentEmployees = new LinkedList<>();
        Scanner uI = new Scanner(System.in);
        //display the menu
        int choice = 0;
        choice = getChoice();
        while(choice > 0 && choice < 4){
            switch (choice){
                case 1:
                    Person newP = getApplication();
                    aplicants.offer(newP);
                    break;
                case 2:
                    String userInput ="";
                    if(!pastEmployee.isEmpty()){
                        Person app = pastEmployee.peek();
                        System.out.println(pastEmployee.pop().getName() + " Has been Hired");
                        currentEmployees.push(app);
                        break;
                    }
                    if(aplicants.isEmpty()){
                        System.out.println("There is no remainging aplicants to hire ");
                        break;
                    }
                    if(pastEmployee.isEmpty()){
                        Person app = aplicants.peek();
                        System.out.println(aplicants.poll().getName() + " Has been Hired");
                        currentEmployees.push(app);
                        break;
                    }
                    break;
                case 3:
                    if(currentEmployees.isEmpty()){
                        System.out.println("There is no employees to fire");
                        break;
                    }
                    String userInput3 ="";
                    pastEmployee.push(currentEmployees.peek());
                    System.out.println(currentEmployees.pop().getName() + " Has been fired");
                    break;

            }
            choice = getChoice();
        }
        //get the menu choice
        
        //process user selected service request.
        
        //loop until the user decides to quit.
        
    }

    //other methods for code modularization
    //method for getting user choice
    public static int getChoice() {
        Scanner uI =  new Scanner(System.in);
        int userNum = 0;
        //display the menu
        menu();
        userNum = uI.nextInt();
        uI.nextLine();
        //get user choice
        //return user choice as an integer
        
        return userNum;
    }

    //method for accepting an applicant and reurn this applicant as a Person object
    public static Person getApplication() {
        //display prompt for user to enteran applicant's name
        //get user input
        Scanner uI = new Scanner(System.in);
        System.out.println("Please enter the users name");
        String name = uI.nextLine();
        //display prompt for user to enter an applicant's degree
        //get user input
        System.out.println("Please enter the users degree");
        String degree = uI.nextLine();
        //display prompt for user to enter an applicant's skill list
        //  (first how many skills, then enter skill one by one)
        //use a loop to get each skill
        int numSkills = 0;
        String skills = "";
        ArrayList<String> aSkills = new ArrayList<>();
        System.out.println("Please enter the number of skills");
        numSkills = uI.nextInt();
        uI.nextLine();
        int index = 0;
        System.out.println("Num Skils: " + numSkills);
        while(index < numSkills){
            System.out.println("Please enter the skill");
            skills = uI.nextLine();
            aSkills.add(skills);
            index++;
            System.out.println("index: " +index);
        }
        Person temp = new Person(name,degree,aSkills);
        //create a Person object using the name, degree, skill list
        //and return this Person object
        System.out.println("test");
        return temp;
    }
    public static void menu(){
        System.out.println("Press 1 to accept");
        System.out.println("Press 2 to hire");
        System.out.println("Press 3 to fire");
        System.out.println("Enter a negative number to quit");
    }

    //You can either implement hire and fire functionalities in main(...),
    //   or implement them here as separate methods:
    //hire method
    //fire method
}
