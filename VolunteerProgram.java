import javax.swing.JOptionPane;

public class VolunteerProgram {
      private static int MAX_VOLUNTEERS = 500;
   public static void main(String[] args) {
      Volunteer[] member = new Volunteer[MAX_VOLUNTEERS];
      int count = 0;
      String menu =
            "---VOLUNTEER SIGN UP---" +
            "\n\nWelcome! Choose a program to enroll into by entering the corresponding number:\n\n" +
            "1: Aid for Refugees\n" + "2: Disaster Relief\n3: Punjab Water Crisis" +
            "\n4: Food Drive for the homeless"+"\n\nOR choose an option to:" +
            "\n\n5: Print member report\n6: Quit";
      boolean done = false;
      while(!done) {
         String option = JOptionPane.showInputDialog(menu);
         if(option == null){
            JOptionPane.showMessageDialog(null, "Please select a valid number");
         }
         else if (option.equals("1")){
            count = addRefugeeAid(member, count);
         }
         else if (option.equals("2")){
            count = addDisasterRelief(member, count);
         }
         else if (option.equals("3")){
            count = addWaterCrisis(member, count);
         }
         else if (option.equals("4")){
            count = addFoodDrive(member, count);
         }
         else if (option.equals("5")){
            addPrintReport(member, count);
         }
         else if (option.equals("6")){
            done = true;
         }
         else {
            JOptionPane.showMessageDialog(null, "Please enter a valid number");
         }
      }
   }
   private static int addRefugeeAid(Volunteer[] member, int count) {
      if (count == MAX_VOLUNTEERS) {
         JOptionPane.showMessageDialog(null, "The spaces are filled, please try again next time!");
      }
      else {
         String name = getMemberName();
         int age = getMemberAge();
         String email = getMemberEmail();
         Volunteer refugee = new Volunteer(name, age, email);
         member[count] = refugee;
         count++;
         }
      return count;
      }
   private static int addDisasterRelief(Volunteer[] member, int count) {
      if (count == MAX_VOLUNTEERS) {
         JOptionPane.showMessageDialog(null, "The spaces are filled, please try again next time!");
      }
      else {
         String name = getMemberName();
         int age = getMemberAge();
         String email = getMemberEmail();
         Volunteer disaster = new Volunteer(name, age, email);
         member[count] = disaster;
         count++;
         }
      return count;
      }
   private static int addWaterCrisis(Volunteer[] member, int count) {
      if (count == MAX_VOLUNTEERS) {
         JOptionPane.showMessageDialog(null, "The spaces are filled, please try again next time!");
      }
      else {
         String name = getMemberName();
         int age = getMemberAge();
         String email = getMemberEmail();
         Volunteer water = new Volunteer(name, age, email);
         member[count] = water;
         count++;
         }
      return count;
      }
   private static int addFoodDrive(Volunteer[] member, int count) {
      if (count == MAX_VOLUNTEERS) {
         JOptionPane.showMessageDialog(null, "The spaces are filled, please try again next time!");
      }
      else {
         String name = getMemberName();
         int age = getMemberAge();
         String email = getMemberEmail();
         Volunteer food = new Volunteer(name, age, email);
         member[count] = food;
         count++;
         }
      return count;
      }
   private static String getMemberName(){
      boolean done = false;
      String name = null;
      while (!done) {
         name = JOptionPane.showInputDialog("Enter the member's name");
         if (name == null || name.equals("")) {
            JOptionPane.showMessageDialog(null, "The member's name is required to be entered.");
         }
         else {
            done = true;
         }
      }
      return name;
   }
   
   private static int getMemberAge() {
      boolean done = false;
      int age = 0;
      while (!done) {
         try {
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter the member's age"));
            if (age < 1) {
               JOptionPane.showMessageDialog(null, "Please enter a valid age.");
            }
            else {
               done = true;
            }
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "The member's age is required");
         }
      }
      return age;
   }
   private static String getMemberEmail() {
      boolean done = false;
      String email = null;
      while (!done) {
         email = JOptionPane.showInputDialog("Enter the email:");
         int position = email.indexOf("@");
         if (email == null || position <= 0) {
            JOptionPane.showMessageDialog(null, "member email is required.");
         }
         else {
            done = true;
         }
      }
      return email;
   }
   private static void addPrintReport(Volunteer[] member, int count) {
      String report = "Enter the name from the list:\n";
      for (int i=0; i<count; i++){
         report += "\n" + member[i].getName();
      }
      boolean done = false;
      Volunteer user = null;
      while (!done){
         String name = JOptionPane.showInputDialog(report);
         if (name != null && !name.equals("")) {
            for (int i = 0; i < count; i++) {
               if (member[i].getName().equals(name)) {
                  user = member[i];
               }
            }
            if (user == null) {
               JOptionPane.showMessageDialog(null, "Student name not found.");
            }
            else {
               done = true;
            }
         }
         else {
            done = true;
         }
      }
      if (user != null) {
         report =
            "Volunteer member info\n\nName : " + user.getName() +
            "\nAge : " + user.getAge() +
            "\nEmail : " + user.getEmail();
         JOptionPane.showMessageDialog(null, report);
      }
   }
}