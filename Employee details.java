package employeedetails;
public class EmployeeDetails {
int emp_year ;
String emp_name, emp_address;
public int getEmp_Year(){
    return emp_year;
}
public void setEmp_Year(int emp_year) {  
    this.emp_year = emp_year;
}  
public String getEmp_Name() {  
    return emp_name;  
}  
public void setEmp_Name(String emp_name) {  
    this.emp_name = emp_name;  
}  
public String getEmp_Address() {  
    return emp_address;  
}  
public void setEmp_Address(String emp_address) {  
    this.emp_address = emp_address;  
}

    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setEmp_Year(1994);
        emp1.setEmp_Name("Robert");
        emp1.setEmp_Address("64C-WallsStreet");
        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.setEmp_Year(2000);
        emp2.setEmp_Name("Sam");
        emp2.setEmp_Address("68D-WallsStreet");
        EmployeeDetails emp3 = new EmployeeDetails();
        emp3.setEmp_Year(1999);
        emp3.setEmp_Name("John");
        emp3.setEmp_Address("26B-WallsStreet");
        
        System.out.println("Name"+"    "+"Year of Joining"+"    "+"Address"+"\r\n"+
                emp1.emp_name+"        "+emp1.emp_year+"        "+emp1.emp_address+"\r\n"+
                emp2.emp_name+"           "+emp2.emp_year+"        "+emp2.emp_address+"\r\n"+
                emp3.emp_name+"          "+emp3.emp_year+"        "+emp3.emp_address);
    }
    
}
