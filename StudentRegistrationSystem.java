import java.util.Scanner;
class StudentRegistrationSystem{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String[] students = new String[5];
   for(int i=0;i<=students.length-1;i++){
         students[i] = sc.next();
   }
StudentRegistrationSystem newStudent = new StudentRegistrationSystem();
   newStudent.showStrings(students);

   String a  = "Dhruv";
   String b = new String("Dhruv");
   boolean ans1 = newStudent.checkEqual(a,b);
   System.out.println(ans1);
   boolean ans2 = newStudent.checkEqualbyEquals(a,b);
   System.out.println(ans2);
   /*String c  = "Dhruv";
   c = "Sharma";
   System.out.println(c);*/

   String studentGuess = sc.next();
   //students[2] = "Sarthak"
   newStudent.checkStudentRegistered(students,studentGuess);
   
   StringBuffer sb = new StringBuffer("DhruvHomeName -- Luv");
   sb.append("HelloJava");
   sb.insert(5,",");
   sb.delete(5,6);

   newStudent.stringBufferKiKahani(sb);

}
   public static void showStrings(String[] students){
    for(int i=0;i<=students.length-1;i++){
            System.out.println(students[i]);
    }
   }
   public boolean checkEqual(String a , String b){
        if(a==b){   //out of scp
            return true;
        }
        else{
            return false;
        }
   }
   public boolean checkEqualbyEquals(String a , String b){

   if(a.equals(b)){    //in scp
    return true;
   }
   else{
    return false;
   }
}
public void stringBufferKiKahani(StringBuffer sb){
    System.out.println(sb.toString());
}

public void checkStudentRegistered(String[] students,String studentGuess){
    boolean found = false;
    for(int i=0;i<=students.length-1;i++){
    
        if(studentGuess.equals(students[i])){
            found = true;
            break;
        }
   }
   if(found == true){
    System.out.println("Student Registered");
   }
   else{
    System.out.println("Student Not Registered");
   }
}

}