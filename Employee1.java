class EmployeeDetail{
    String name;
    float sal;
    int joinYear;
    String address;

EmployeeDetail (String n,int s,int y,String a ){
name=n;
sal=s;
joinYear=y;
address=a;
}


}

class Employee1{
    public static void main(String args[]) {

EmployeeDetail emp1 = new EmployeeDetail("Robert",2500,1994,"64C- WallStreet");
EmployeeDetail emp2 = new EmployeeDetail("Sam",15000,2000,"68D- WallStreet");
EmployeeDetail emp3 = new EmployeeDetail("John",60000,1999,"26B- WallStreet");

System.out.println("Name \t Year of joining \t Address\n");
System.out.print(emp1.name+"\t\t"+emp1.joinYear+"\t\t"+emp1.address+"\n");
System.out.print(emp2.name+"\t\t"+emp2.joinYear+"\t\t"+emp2.address+"\n");
System.out.print(emp3.name+"\t\t"+emp3.joinYear+"\t\t"+emp3.address+"\n");
    
}

}