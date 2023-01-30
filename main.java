// import the utilities for scanner and such 
import java.util.*;

//create main class (folder)
public class main {
    

//main method created with string array returned 
public static void main (String [] args)  { 

//create a 2d array with the states in row 1 and the corresponding capitals are row 2.
String [][] cc = {{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
{"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"} }; 


// ask user to input a captial 
System.out.println("Please type in a US state capital below");

// create scanner to see what the user input. 
Scanner scanner = new Scanner(System.in); 
String userinput = scanner.nextLine();

//create boolean 
boolean same = false; 

//search row 1 and convers it into a 1d array. 
String [] caps = cc [1]; 

//create for loop to check user input with array row 

for (String city:caps) { 
    if (city.equalsIgnoreCase(userinput)) {
        same = true;
        break;}   }   
    if (same) {System.out.println("Correct! " + userinput + " is a US state capital"); }

    else System.out.println("Wrong! " + userinput + " is not a US state capital "); 

    //pause program so user can read until enter is pressed twice 

    System.out.println("Press Enter key twice to continue...");
    try
    {
        System.in.read();
        scanner.nextLine();
    } 
    catch (Exception e) {} 

System.out.println("Now here is the list of states and their capitals;"); 

    //pause program so user can read until enter is pressed twice 
System.out.println("Press Enter key twice to continue...");
try
{
    System.in.read();
    scanner.nextLine();
} 
catch (Exception e) {} 

//make a for loop to cycle and match all states and capitals 

for (int i = 0; i < 50; i++) { 

    System.out.println (cc[1][i] + " is the capital of " + cc[0][i]); 
} 



//use a bubble sort to sort the content by capital
    for (int j = 0; j < cc[0].length; j++) {
        for (int i = j + 1; i < cc[0].length;i++){
     
     
            String tempstate;
            String tempcit;
     
     
            if (cc[1][i].compareTo(cc[1][i]) < 0) {
                tempcit = cc[1][j];
                cc[1][j] = cc[1][i];     
                cc[1][i] = tempcit; 
                tempstate = cc[0][i]; 
                cc[0][j] = cc[0][i]; 
                cc[0][i] = tempstate; 
            }  }  
            //pause program so user can read until enter is pressed twice 
        }
        System.out.println("Press Enter key twice to continue...");
        try
        {
            System.in.read();
            scanner.nextLine();
        } 
        catch (Exception e) {} 

        //prompt user to input states 

        System.out.println("Please enter as many state capitals as possible. Do NOT put a space after each word. Once finished typing, type Done"); 


        //scan input adds correct capitals to new array for 
        Scanner scannerone = new Scanner(System.in); 
        ArrayList<String> inputlist = new ArrayList<>(); 
        boolean testend = false; 
        while (!testend) {
            String newinput = scannerone.nextLine(); 
            if (newinput.equalsIgnoreCase("done")) {
            System.out.println("input done confirmed"); 
            testend = true;  } 
            else {inputlist.add(newinput);}

        }
        //counts the correct captials and compares it to orginial array 
        int right = 0; 
String [] citiez = cc [1]; 
        int left = inputlist.size(); 
        for (String tries: inputlist) {
            for (String city : caps) {
                if (tries.equalsIgnoreCase(city))
                    right += 1;
   }

} 
//print the amount of guesses and correct guesses 
System.out.println( "Out of " + inputlist.size() + " attempts for guess capitals you got " + right + " correct"); 

    //pause program so user can read until enter is pressed twice 
System.out.println("Press Enter key twice to continue...");
try
{
    System.in.read();
    scanner.nextLine();
} 
catch (Exception e) {}; 

System.out.println("Ok, now the states and capitals will be printed using a Hashmap. These will be unordered"); 

    //pause program so user can read until enter is pressed twice 

System.out.println("Press Enter key twice to continue...");
try
{
    System.in.read();
    scanner.nextLine();
} 
catch (Exception e) {}; 
//creat hashmap with name hashcc
HashMap<String, String> hashcc = new HashMap<String, String>();


//populate hashcc with states and capitals

hashcc.put("Alabama", "Montgomery");
hashcc.put("Alaska", "Juneau");
hashcc.put("Arizona", "Phoenix");
hashcc.put("Arkansas", "Little Rock");
hashcc.put("California", "Sacramento");
hashcc.put("Colorado", "Denver");
hashcc.put("Connecticut", "Hartford");
hashcc.put("Delaware", "Dover");
hashcc.put("Florida", "Tallahassee");
hashcc.put("Georgia", "Atlanta");
hashcc.put("Hawaii ", "Honolulu");
hashcc.put("Idaho", "Boise");
hashcc.put("Illinois", "Springfield");
hashcc.put("Indiana", "Indianapolis");
hashcc.put("Iowa", "Des Moines");
hashcc.put("Kansas", "Topeka");
hashcc.put("Kentucky", "Frankfort");
hashcc.put("Louisiana", "Baton Rouge");
hashcc.put("Maine", "Augusta");
hashcc.put("Maryland", "Annapolis");
hashcc.put("Massachusetts", "Boston");
hashcc.put("Michigan", "Lansing");
hashcc.put("Minnesota", "St. Paul");
hashcc.put("Mississippi", "Jackson");
hashcc.put("Missouri ", "Jefferson City");
hashcc.put("Montana", "Helena");
hashcc.put("Nebraska", "Lincoln");
hashcc.put("Nevada", "Carson City");
hashcc.put("New Hampshire", "Concord");
hashcc.put("New Jersey", "Trenton");
hashcc.put("New Mexico", "Santa Fe");
hashcc.put("New York", "Albany");
hashcc.put("North Carolina", "Raleigh");
hashcc.put("North Dakota ", "Bismarck");
hashcc.put("Ohio", "Columbus");
hashcc.put("Oklahoma", "Oklahoma City");
hashcc.put("Oregon ", "Salem");
hashcc.put("Pennsylvania", "Harrisburg");
hashcc.put("Rhode Island ", "Providence");
hashcc.put("South Carolina", "Columbia");
hashcc.put("South Dakota", "Pierre");
hashcc.put("Tennessee", "Nashville");
hashcc.put("Texas", "Austin");
hashcc.put("Utah", "Salt Lake City");
hashcc.put("Vermont", "Montpelier");
hashcc.put("Virginia", "Richmond");
hashcc.put("Washington", "Olympia");
hashcc.put("West Virginia", "Charleston");
hashcc.put("Wisconsin ", "Madison");
hashcc.put("Wyoming", "Cheyenne");

//print out hashmap hashcc
System.out.println(hashcc); 

//pause program so user can read until enter is pressed twice 

System.out.println("Press Enter key twice to continue...");
try
{
    System.in.read();
    scanner.nextLine();
} 
catch (Exception e) {}; 



//creates treemap for binary search 
TreeMap<String, String> inorder = new TreeMap<>(hashcc);

//create line scanner

Scanner looploop = new Scanner(System.in);
//prompt user to input state 
 System.out.println("Next, please enter a state and press enter. This will return the capital of that state. This will return one and only one capital Only one state is allowed and the program will end once state is entered.");

 //create for loop to check and print capital from user input to the TreeMap
 String jump = looploop.nextLine();
 if (inorder.containsKey(jump)) { 
System.out.println(inorder.get(jump)); 
 }
else  {System.out.println("Not a state.");}  

//ends program
System.out.println("---End of Program---"); 

} 


}


