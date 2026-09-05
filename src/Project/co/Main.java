package Project.co;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
         Studentservice studentservice = new Studentservice();
        Scanner input = new Scanner(System.in);

        System.out.println("WELCOME");
        System.out.println("What do you want to do? (Just choose a number)");
        System.out.println("1. Add student");
        System.out.println("2. Get all student");
        System.out.println("3. Find student by ID");
        System.out.println("4. Update student");
        System.out.println("5. Delete student");
        System.out.println("6. Calculate average GPA");
        System.out.println("7. Finish");

        int choose = input.nextInt();
        String a = input.nextLine();

        if (choose == 7) {
            System.out.println("Finish the process");
        }

        while(true) {


            if (choose == 1) {
                System.out.println("Please enter name:");
                String addname = input.nextLine();
                System.out.println("Please enter age:");
                int addage = input.nextInt();
                String b = input.nextLine();
                System.out.println("Please enter major:");
                String addmajor = input.nextLine();
                System.out.println("Please enter gpa:");
                double addgpa = input.nextDouble();
                studentservice.Addsutdent(addname, addage, addmajor, addgpa);
                System.out.print(" the ID of " + addname + " is: ");
                System.out.println(studentservice.getNextId());

            }
            else if (choose == 2) {
                studentservice.Getallstudent();

            }
            else if (choose == 3) {
              System.out.println("Please enter ID to find the student:");
              int inputeID = input.nextInt();
              Student student = studentservice.FindbyId(inputeID);
              if (student == null) {
                System.out.println("There is no student with this ID");
              }
              else {
                System.out.println(student);
              }
             

            }
            else if (choose == 4) {
                System.out.println("Please enter ID to find the student:");
                int findID = input.nextInt();
                String c = input.nextLine();
                System.out.println("Please enter new name:");
                String newname = input.nextLine();
                String d = input.nextLine();
                System.out.println("please enter new major:");
                String newmajor = input.nextLine();
                System.out.println("Please enter new age:");
                int newage = input.nextInt();
                System.out.println("Please enter new gpa");
                double newgpa = input.nextDouble();
                studentservice.Updatestudent(findID, newname, newmajor, newage, newgpa);

            }
            else if (choose == 5) {
                System.out.println("Please enter ID:");
                int deleteID = input.nextInt();
                studentservice.Deletestudent(deleteID);
            }
            else if (choose == 6) {
                studentservice.CalculateAvgGpa();
            }
            else if (choose == 7) {
                System.out.println("Finish the process");
                break;
            }
            System.out.println("What do you want to do next?");
            choose = input.nextInt();
            String e = input.nextLine();
        }

    }
}
