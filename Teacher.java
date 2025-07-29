 

public class Teacher
{
    //private attributes of teacher class.
    private int teacherId;
    private String teachername;
    private String address;
    private String workingtype;
    private String employmentstatus;
    private int workinghours;
    //constructor 
    public Teacher(int teacherId, String teachername, String address,String workingtype, String employmentstatus)
    {
        //using this keyword.
        this.teacherId=teacherId;
        this.teachername=teachername;
        this.address=address;
        this.workingtype=workingtype;
        this.employmentstatus=employmentstatus;
    }
    // create a getter(accessor) return the value of the private attributes.
    public int getTeacherId()
    {
        return teacherId;
    }
    public String getTeachername()
    {
        return teachername;
    }
    public String getAddress()
    {
        return address;
    }
    public String getWorkingtype()
    {
        return workingtype;
    }
    public String getEmployment_Status()
    {
        return employmentstatus;
    }
    public int getWorkinghours()
    {
        return workinghours;
    }
    //set a new working hours using a setter method
    // The parameter value is then assign to the attributes 
    public void setWorkinghours(int workinghours)
    {
        this.workinghours=workinghours;
    }
    //display method values of Teacher print a teacher details.
    public void display()
    {
        System.out.println("Teacher Details");
        System.out.println("");
        System.out.println("TeacherID: "             + teacherId);
        System.out.println("Teacher Name :"          + teachername);
        System.out.println("Teacher address : "      +address);
        System.out.println("Teacher working type: "  +workingtype);
        System.out.println("Employment status: "     +employmentstatus);
        if(workinghours==0)
        {
            System.out.println("The teacher working hours :"+workinghours);
        }
        else
        {
            System.out.println("The teacher working hours is not assigned ");
        }
        System.out.println("");
    }
}
