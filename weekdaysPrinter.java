public class weekdaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      for(int i = 0; i < weekDays.length; i++){
        if(i< 5){
          System.out.println(weekDays[i]);
        }
        else{
          break;
        }
      }
     
    }
}
