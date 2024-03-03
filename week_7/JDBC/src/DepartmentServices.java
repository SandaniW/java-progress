import java.util.Scanner;
public class DepartmentServices {
    public Department newDepartment(){
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Department Name: ");
        department.setDepartmentName(scanner.nextLine());
        System.out.println("Input Department Id: ");
        department.setDepartmentId(scanner.nextInt());


        return department;
    }
   
    
    
}
