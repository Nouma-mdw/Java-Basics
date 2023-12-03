public class Droid {
  int batteryLevel;
  String name;;

  // define constructo method
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100; 
  }

  // define method toString()
  public String toString() {
    return "Hi there, my I'm " + name + ".";
  }

  // define method 'peforming a task'
  public void performTask(String task) {
    System.out.println(name + " is performing a task: " + task);
    batteryLevel -= 10; 

  }

  // define method 'stating battery level'
  public void batteryLevel() {
    System.out.println(name + "'s new battery level is: " + batteryLevel);
  }


  // define main method
  public static void main(String[] args) {
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    Codey.performTask("Dancing");
    Codey.batteryLevel();


  }
}