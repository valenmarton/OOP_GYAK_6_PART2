public class Employee {
   
       
   
        private String employeeName;
        private long salary;
        private int age;                                        // új anyag
       
        static int pensionRemainingAge=65;
       
    //kontstruktor                                                 //ú anyag
       
        public Employee(String employeeName, long salary, int age) {
            super();
            this.employeeName = employeeName;
            this.salary = salary;
            this.age = age;
        }
           
           
            public Employee(String employeeName, int age) {
                super();
                this.employeeName = employeeName;
                this.salary = age*10000;
                this.age = age;
            }
       
        public int getRemainingYearsUntilPansion(){
           
           
            return pensionRemainingAge = getAge();
           
        }
       
        public static int getPensionRemainingAge(){
            return pensionRemainingAge;
           
        }
        public static void setPensionRemainingAge( int pensionRemainingAge) {
            Employee.pensionRemainingAge = pensionRemainingAge;
        }
       
       
        public static Employee getYoungerEmployee (Employee employee1, Employee employee2){
                if(employee1.getRemainingYearsUntilPansion()>employee2.getRemainingYearsUntilPansion()){
                    return employee1;
                   
                }
                else return employee2;
           
        }
       
       
       
       
        // age getter setter auto generated
       
        public int getAge() {
            return age;
        }


        public void setAge(int age) {
            this.age = age;
        }
       
       
   
       

        public String toString() {
            return "Employee [employeeName=" + employeeName + ", salary="
                    + salary + ", age=" + age
                    + ", getRemainingYearsUntilPansion()="
                    + getRemainingYearsUntilPansion() + ", getAge()="
                    + getAge() + ", displayInfo()=" + displayInfo()
                    + ", getEmployeeName()=" + getEmployeeName()
                    + ", getSalary()=" + getSalary() + ", getTax()=" + getTax()
                    + "]";
        }
       
       
       
       
       
       
       
        //----------------------------------------------------------------------------------------------------------


        public long increaseSalary (long increase, long employeeSalary){
           
           
            return employeeSalary+=increase;
           
        }
   
    //    public String displayInfo(long salary, String name){
    //        return "Salary: "+ salary+ "Name: "+ name;
    //}
        public String displayInfo(){
            return "Salary: "+ this.salary+ "Name: "+ this.employeeName;
        }
       
       
       
        public String getEmployeeName() {
            return employeeName;
        }
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
        public long getSalary() {
            return salary;
        }
        public void setSalary(long salary) {
            this.salary = salary;
        }



    public boolean isInSalaryRange(long salaryStart, long salaryEnd){
        if( this.salary < salaryEnd && this.salary >= salaryStart){
            return true;
        }
        else return false;
       
    }
    public long getTax(){
        return (long) (this.salary*0.16);
    }
    public boolean hasHigherSalary(Employee employee){
        if (this.salary > employee.salary){
            return true;
        }
       
        return false;
    }
   
}