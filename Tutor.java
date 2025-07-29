 


public class Tutor extends Teacher
{
    //private attributes of Tutor class
    private double salary;
    private String specialization;
    private String academicqualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //Constructor for Tutor class
    public Tutor(int teacherId,String teachername,String address,String workingtype,String employmentstatus,int workinghours,
                    double salary, String specialization, String academicqualifications, int performanceIndex)
    {
        //Call the constructor of the superclass (Teacher) to initialize common attributes
        super(teacherId,teachername,address,workingtype ,employmentstatus);
        // Set the working hours using the setter method from the superclass
        super.setWorkinghours(workinghours);
        //Assign values to the specific attributes of Tutor
        this.salary=salary;
        this.specialization=specialization;
        this.academicqualifications=academicqualifications;
        this.performanceIndex=performanceIndex;
        this.isCertified=false;
    }
    //getter method for Tutor class
    public double getSalary()
    {
        return salary;
    }
    public String getSpecialization()
    {
        return specialization;
    }
    public String getAcademicqualifications()
    {
        return academicqualifications;
    }
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    public boolean getIsCertified()
    {
        return isCertified;
    }
    //method to set salary of tutor 
    public void setSalary(double salary, int performanceIndex)
    {
        // Check if performance index is high and working hours are sufficient
        if (performanceIndex > 5 && getWorkinghours() > 20) 
        {
            // Determine appraisal percentage based on performance index
            double appraisalPercentage;
            if (performanceIndex >= 5 && performanceIndex <= 7) 
            {
                appraisalPercentage = 0.05;
            } else if (performanceIndex >= 8 && performanceIndex <= 9) 
            {
                appraisalPercentage = 0.10;
            } else 
            {
                appraisalPercentage = 0.20;
            }
            // Calculate and set the new salary
            this.salary = salary + (appraisalPercentage * salary);
            this.isCertified = true;
            System.out.println("Tutuor salary has been approved."); 
        } 
        else 
        {
            System.out.println("Tutor has not been certified yet salary cannot be approved.");
        }
    }

    // Method to remove tutor (if not certified)
    public void removeTutor() 
    {
        if (!isCertified) 
        {
            // Reset attributes if tutor is not certified
            this.salary = 0;
            this.specialization = "";
            this.academicqualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Removed tutor successfully.");
        } else {
            System.out.println("Cannot remove certified tutor.");
        }
    }

    // Method to display details of Tutor class
    public void display() 
    {
        System.out.println("");
        
        super.display(); // Call display method of parent class
        // Display Tutor details only if certified
        if (isCertified) {
        
            System.out.println("Tutor Details:");
            System.out.println("Salary: "                + salary);
            System.out.println("Specialization: "        + specialization);
            System.out.println("Academic Qualifications:"+ academicqualifications);
            System.out.println("Performance Index: "     + performanceIndex);
        }
    }
}
