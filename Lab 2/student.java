
import java.util.Scanner;
class student {
    public static void main(String[] args) {
String name;
int roll;
char grade,branch;
double mark;
Scanner reader=new Scanner(System.in);
System.out.print("Enter student name:");
name= reader.nextLine();
System.out.print("Enter roll number:");
roll=reader.nextInt();
System.out.print("Enter branch:");
branch=reader.next().charAt(0);
System.out.print("Enter student mark:");
mark=reader.nextDouble();
System.out.print("Enter student grade:");
grade=reader.next().charAt(0);

System.out.println("Student details:\nName: "+name+"\nRoll number: "+roll+
"\nBranch name: "+branch+"\nMArk : "+mark+"\nGrade: "+grade);

}
}

