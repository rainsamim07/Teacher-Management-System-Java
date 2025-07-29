
public class Lecturer extends Teacher
{
    // instance variables - replace the example below with your own
    private String Department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    // call the constructors lecturer class
    public Lecturer(int teacherId,String teachername,String address,String workingtype,String employmentstatus,int workinghours,String Department, int YearsOfExperience)
    {
        super(teacherId,teachername,address,workingtype ,employmentstatus);
        setWorkinghours(workinghours);
        // assign the corresponding parameters values
        this.Department=Department;
        this.YearsOfExperience=YearsOfExperience;
        this.gradedScore=0;//assign default value(zero)
        this.hasGraded=false;
       
    }
    //create a accessor(getter) methods of lecturer class.
    public String getdepartment()
    {
        return Department;
    }
    public int getyearsOfExperience()
    {
        return YearsOfExperience;
    }
    public int getGradedScore()
    {
        return gradedScore;
    }
    public boolean getHasGraded()
    {
        return hasGraded;
    }
    //create a setter(mutator) method for gradedscore
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    //call a method use to grade assignment.
    public void gradedAssignment(int gradedScore, String Department, int YearsOfExperience)
    {
        // Check if the lecturer is eligible to grade the assignment based on years of experience and department
        if( YearsOfExperience >= 5 && this.Department.equals(Department))
        {
            // Assign grades based on the graded score
            if( gradedScore>=70 )
            {
                System.out.println("The graded assignment score is :A");
            }
            else if(gradedScore>=60)
            {
                System.out.println("The graded assignment score is B");
            }
            else if(gradedScore>=50)
            {
                System.out.println("The graded assignment score is C");
            }
            else if(gradedScore>=40)
            {
               System.out.println("The graded assignment score is D");
            }
            else 
            {
                System.out.println("The graded assignment score is E");
            }
            //Update the graded score and set hasGraded flag to true
            hasGraded=true;
            this.gradedScore=gradedScore;
            System.out.println("Graded Assignment successfully.");
        }
            else
            {
                System.out.println("The lecturer cannot graded assignment yet"); 
            }
    }
    //display a details of lecturer attributes 
    @Override
    public void display()
    {
        // Call the display method of the superclass (Teacher) to display common attributes
        super.display();
        
        // Display specific attributes of Lecturer
        System.out.println("");
        System.out.println("Lecturer Details");
        System.out.println("Department Name :"              + Department);
        System.out.println("Teacher year of experience :"   + YearsOfExperience);
        // Check if the assignment is graded yet and display the graded score accordingly
        if(gradedScore ==0)
        {
            System.out.println("Graded score :"              + gradedScore);
        }
        else
        {   
            System.out.println("Assignment cannot graded yet.");
        }
    }
}
