
class EmployeeDetails {  
String name;
int sal;
int year;
String address;

  
public void setName(String name) {  
    this.name = name;  
}  

public void setSalary(int sal) {  
    this.sal = sal; 
}
public void setJoinYear(int year) {  
    this.year = year; 
}   
public void setAddress(String address) {  
    this.address = address;  
}  

}

public class emp{  
 
    public static void main(String args[]) {    
      
EmployeeDetails emp1 = new EmployeeDetails(); 
EmployeeDetails emp2 = new EmployeeDetails();
EmployeeDetails emp3 = new EmployeeDetails(); 
 
        emp1.setName("Robert");  
        emp1.setSalary(2500); 
        emp1.setJoinYear(1994);
        emp1.setAddress("64C- WallStreet");  
	emp2.setName("Sam");  
        emp2.setSalary(15000); 
        emp2.setJoinYear(2000);
        emp2.setAddress("68D- WallStreet"); 
	emp3.setName("John");  
        emp3.setSalary(60000); 
        emp3.setJoinYear(1999);
        emp3.setAddress("26B- WallStreet"); 
	
	System.out.println("Name \t Year of joining \t Address\n");
	System.out.print(emp1.name+"\t\t"+emp1.year+"\t\t"+emp1.address+"\n"); 
	System.out.print(emp2.name+"\t\t"+emp2.year+"\t\t"+emp2.address+"\n"); 
	System.out.print(emp3.name+"\t\t"+emp3.year+"\t\t"+emp3.address+"\n"); 
             
    }  
}  
