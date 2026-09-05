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
        System.out.println();

        int choose = input.nextInt();
        String a = input.nextLine();

        while (true) {

            // Add student
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
                Student newstudent = studentservice.Addsutdent(addname, addage, addmajor, addgpa);
                System.out.print(" the ID of " + addname + " is: ");
                System.out.println(newstudent.getId());

            }
            // Get all atudent
            else if (choose == 2) {
                studentservice.Getallstudent();

            }
            // Find by ID
            else if (choose == 3) {
                System.out.println("Please enter ID to find the student:");
                int inputeID = input.nextInt();
                Student student = studentservice.FindbyId(inputeID);
                if (student == null) {
                    System.out.println("There is no student with this ID");
                } else {
                    System.out.println("ID: " + student);
                }

            }
            // Update student
            else if (choose == 4) {
                System.out.println("Please enter ID to find the student:");
                int findID = input.nextInt();
                String c = input.nextLine();
                System.out.println("Please enter new name:");
                String newname = input.nextLine();
                System.out.println("Please enter new age:");
                int newage = input.nextInt();
                String d = input.nextLine();
                System.out.println("please enter new major:");
                String newmajor = input.nextLine();
                System.out.println("Please enter new gpa");
                double newgpa = input.nextDouble();
                studentservice.Updatestudent(findID, newname, newage, newmajor, newgpa);

            }
            // Delete student
            else if (choose == 5) {
                System.out.println("Please enter ID:");
                int id = input.nextInt();
                studentservice.Deletestudent(id);
            }
            // Calculate avg gpa
            else if (choose == 6) {
                System.out.println(studentservice.CalculateAvgGpa());
            }
            // Finish
            else if (choose == 7) {
                System.out.println("Finish the process");
                break;
            }
            System.out.println("What do you want to do next?");
            System.out.println();
            System.out.println("What do you want to do? (Just choose a number)");
            System.out.println("1. Add student");
            System.out.println("2. Get all student");
            System.out.println("3. Find student by ID");
            System.out.println("4. Update student");
            System.out.println("5. Delete student");
            System.out.println("6. Calculate average GPA");
            System.out.println("7. Finish");
            System.out.println();

            choose = input.nextInt();
            String e = input.nextLine();
        }

    }
}
