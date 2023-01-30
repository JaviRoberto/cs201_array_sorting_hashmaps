// import the utilities for scanner and such 
import java.util.*;

//create main class (folder)
public class main {
    

//main method created with string arrary returned 
public static void main ()  { 
    int mySimpleArray[] ={7,4,6,1,2};

    int temp = 0;
    
    int n = mySimpleArray.length;
    
    for (int i = 0; i < n-1; i++) {
    
     for (int j = 0; j < n-i-1; j++) {
    
      if (mySimpleArray[j] > mySimpleArray[j+1]) {
    
        temp = mySimpleArray[j];
    
       mySimpleArray[j] = mySimpleArray[j+1];
    
       mySimpleArray[j+1] = temp;
    
      }
    
     }
    
    }


} 


}

