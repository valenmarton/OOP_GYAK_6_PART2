import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
           
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLS input the number of employees");
       
        int numberOfEmployees = scanner.nextInt();
       
        Employee[] employees = new Employee[numberOfEmployees];
       
       
        for(int i=0; i<employees.length; i++){
            System.out.println("PLS input the name of the employee!");
        String tempName = scanner.next();
            System.out.println("PLS input the age of the employee!");
        int tempAge = scanner.nextInt();
        employees[i]= new Employee (tempName, tempAge);
        System.out.println(employees[i]);
       
        }
    // statikus metódus meghívás
       
        //Employee az osztálynév és arra hivatkozva hívjuk meg
       
        Employee.setPensionRemainingAge(75);
        for(Employee employee : employees){
            System.out.println(employee);
        }
        for(Employee employee : employees){
            if (employee.getRemainingYearsUntilPansion()<5){
                System.out.println(employee);
            }
        }
       
        int avgAgeRemaining=0;
        for( Employee employee : employees){
            avgAgeRemaining += employee.getRemainingYearsUntilPansion();
           
        }
        avgAgeRemaining/=employees.length;
       
        for( Employee employee : employees){
            if (employee.getRemainingYearsUntilPansion()>avgAgeRemaining){
                System.out.println(employee);
            }
        }
        // minimum kivalasztasos rendezes
       
        for( int i=0; i<employees.length-1; i++){
            int max=i;
            for(int j=i+1; j< employees.length; j++){
                if(employees[max].getRemainingYearsUntilPansion()< employees[j].getRemainingYearsUntilPansion()){
                    max=j;
                }
            }
            Employee tempEmployee = new Employee(employees[i].getEmployeeName(), employees[i].getAge());
            employees[i]= new Employee(employees[max].getEmployeeName(), employees[max].getAge());
            employees[max]= new Employee(tempEmployee.getEmployeeName(), tempEmployee.getAge());
           
           
        }
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

}
		
