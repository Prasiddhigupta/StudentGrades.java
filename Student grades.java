
import java.util.Scanner;

public class StudentGrades 
{
  public static void main(String[]args) 
  {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int numStudents = input.nextInt();

    int[]grades = new int[numStudents];
    int sum = 0;

    for(int i = 0; i < numStudents; i++) 
    {
      System.out.print("Enter grade for student " + (i+1) +": ");
      grades[i] = input.nextInt();
      sum += grades[i];
    }

    int highest = grades[0];
    int lowest = grades[0];

    for (int grade : grades) 
    {
      if (grade > highest) 
      {
        highest = grade;
      }
      
      if (grade < lowest) 
      {
        lowest = grade;
      }
    }

    double average = (double)sum / numStudents;

    System.out.println("Average Grade:" + average);
    System.out.println("Highest Grade:" + highest);
    System.out.println("Lowest Grade:" + lowest);

    input.close();
  }
}
