public class Volunteer {
   /*

This is a super class that creates attributes that hold the volunteer 
name, age, email address, and if the user is enrolled in the volunteer program.

*/

   private String name;
   private int age;
   private String email;
   private boolean enrolled;
   
   public Volunteer(String volName, int volAge, String volEmail){
      this.name = volName;
      this.age = volAge;
      this.email = volEmail;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   public int getAge(){
      return age;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public String getEmail(){
      return email;
   }
   
   public void setEmail(String email){
      this.email = email;
   }
   
   public boolean enrolled(){
      return enrolled;
   }
   
   public void setEnrolled (boolean enrolled){
      this.enrolled = enrolled;
   }
}
