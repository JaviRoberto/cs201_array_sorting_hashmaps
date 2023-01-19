// import the utilities for scanner and such 
import java.util.*;

//create main class (folder)
public class main {
    

//main method created with string arrary returned 
public static void main (String [] args)  { 

//tcreate a 2d array with the states in row 1 and the corresponding capitals are row 2.
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

//create for loop to check user input with array 1 row 

for (String city:caps) { 
    if (city.equalsIgnoreCase(userinput)) {
        same = true;
        break;}   }   
    if (same) {System.out.println("Correct! " + userinput + " is a US state capital"); }

    else System.out.println("Wrong! " + userinput + " is not a US state capital "); 


} 

}
