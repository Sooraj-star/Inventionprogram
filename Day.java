import java.time.LocalTime;


public class Day
{
  public static void main(String[] args) {
    int time = LocalTime.now().getHour();
    if (time < 5) {
      System.out.println("Good MidNight, Sooraj");
    } else if (time >=5 && time <= 12) {:
      System.out.println("Good Morning, Sooraj");
    } else if (time >= 12 && time <= 16) {
      System.out.println("Good AfterNoon, Sooraj");
    } else if (time >= 16 && time <= 20){
      System.out.println("Good Evening, Sooraj");
    } else if (time >= 20 && time <= 24){
      System.out.println("Good tonight, Sooraj");
    } else {
      System.out.println("Good Night, Sooraj");
    }
  }
}
