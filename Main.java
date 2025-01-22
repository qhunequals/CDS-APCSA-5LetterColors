// 5 Letter Colors            A+CR
import java.util.ArrayList;

public class Main
{
   public static void main(String[] arg)
   {
      ArrayList<String> colors = new ArrayList<String>();
      String[] data = {"Blue", "Red", "Green", "Black", "White", "Cyan", "Magenta", "Yellow"};
      for(String s : data)
         colors.add(s);
      System.out.println(colors);
      
      //Write the code below that would create a new 
      //ArrayList called colorLengths5 that would add any  
      //color of length 5 from colors

   }
}