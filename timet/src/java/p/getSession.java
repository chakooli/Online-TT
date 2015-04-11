
package p;

import java.util.Calendar;

   public class getSession {
   Calendar current;
   int yearDiff;
   
   public getSession(){
   current = Calendar.getInstance();
   yearDiff = current.get(Calendar.MONTH) - 7;
   }
   
   public String printSession(){
   if(yearDiff >=0)
   {
       return (Integer.toString(current.get(Calendar.YEAR)) +"-"+ Integer.toString(current.get(Calendar.YEAR)+1));
   }
   else
     return (Integer.toString(current.get(Calendar.YEAR)-1) +"-"+ Integer.toString(current.get(Calendar.YEAR)));  
   }
}
