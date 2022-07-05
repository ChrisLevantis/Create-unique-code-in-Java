/*  Create unique code... */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

public class GenerateUniCodes {

     public static boolean checkSame(ArrayList<Integer> l, int num) {
          for (int i = 0; i < l.size(); i++) {
               if (l.get(i) == num) {
                    return true;
               }
          }
          return false;
     }

     public static void main(String[] args) {
          Random rand = new Random();

          ArrayList<Integer> list = new ArrayList<Integer>();

          int randNum = 0;
          for (int i = 0; i < 5; i++) { // YOU CAN SAY THAT IT HAPPENS FOR 5 OBJECTS FOR EXAMPLE...
               while (true) {
                    randNum = rand.nextInt();
                    if (randNum < 0) {
                         continue;
                    } else if (list.size() != 0 && checkSame(list, randNum) == true) {
                         continue;
                    } else {
                         list.add(i, randNum);
                         break;
                    }
               }
               System.out.println("LIST ITEM " + i + " --> " + list.get(i));
          }
          System.out.println(list.size());
     }
}
