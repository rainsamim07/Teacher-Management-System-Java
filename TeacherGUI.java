import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;


public class TeacherGUI implements ActionListener {

    //declar instance variables.
    private JFrame frame;
    
    private JPanel backgroundpanel,lecturerpanel,tutorpanel;//create a diiferent JPanels  for the GUI.

    private JLabel title,choosebackgroundpanel,managementlabel,clickbackgroundpanel,imagelabel,textoflecturerlable,textoftutorlable,teacheridlecturerpanellabel,teachernamelecturerpanellabel,addresslecturerpanellabel,workingtypelecturerpanellabel,workinghourslecturerpanellabel,
    yearsofexperiencelecturerpanellabel,departmentlecturerpanellabel,employmentstatuslecturerpanellabel,teacheridtutorpanellabel,teachernametutorpanellabel,addresstutorpanellabel,workingtypetutorpanellabel,
    workinghourstutorpanellabel,salarytutorpanellabel,specializationtutorpanellabel,employmentstatustutorpanellabel,academicqualificationtutorpanellabel,performanceindextutorpanellabel,gradedscorelecturerpanellabel;

    private JTextField teacheridtextlecturer,teachernametextlecturer,addresstextlecturer,workingtypetextlecturer,workinghourstextlecturer,yearsofexperiencetextlecturer,departmenttextlecturer,
    employmentstatustextlecturer,teacheridtexttutor,teachernametexttutor,addresstexttutor,workingtypetexttutor,workinghourstexttutor,salarytexttutor,specializationtexttutor,
    employmentstatustexttutor,academicqualificationtexttutor,performanceindextexttutor,gradedscoretextlecturer;
    
    private JButton lecturerbuttonbackgroundpanel,tutorbuttonbackgroundpanel,exitbuttonbackgroundpanel,addbuttonlecturerpanel,gradedassignmentsbuttonlecturerpanel,displaybuttonlecturerpanel,
    clearbuttonlecturerpanel,backbuttonlecturerpanel,backbuttontutorpanel,addtutorbuttonpanel,setsalarybuttontutorpanel,removebuttontutorpanel,displaybuttontutorpanel,clearbuttontutorpanel;

    private ArrayList<Teacher>  teacherlist;//Create an arraylist to object to storing in teacher objects.
    
    //Define the constructor for the TeacherGUI class.
    public TeacherGUI(){
        //Initialize the teacherlist and Arraylist.
        teacherlist = new ArrayList<>();

        //Create a new JFrame object.
        frame = new JFrame();
        //Create a new JLabel for the title.
        title = new JLabel();
        
        /*create a GUI components for TeacherGUI.*/
        //---------------Starting a Front page of GUI---------------//

        backgroundpanel = new JPanel();//Create a new Jpanel for background GUI.

        //setting the size in x-axis,y-axis,width and height format setbounds in front page. 
        
        managementlabel = new JLabel("Teacher management system.");
        managementlabel.setBackground(new Color(121,52,32));
        managementlabel.setBounds(325,38,400,35);
        managementlabel.setFont(new Font("Times New Roman",Font.ITALIC,30));
        backgroundpanel.add(managementlabel);

        choosebackgroundpanel = new JLabel("Choose an Option");
        choosebackgroundpanel.setBounds(282,114,344,38);
        choosebackgroundpanel.setFont(new Font("Times New Roman",Font.BOLD,33));
        backgroundpanel.add(choosebackgroundpanel);//Add a text to background JPanel


        clickbackgroundpanel = new JLabel("Click here!");
        clickbackgroundpanel.setBounds(535,115,173,38);
        clickbackgroundpanel.setFont(new Font("Times New Roman",Font.BOLD,30));
        backgroundpanel.add(clickbackgroundpanel);


        //create a button 
        lecturerbuttonbackgroundpanel = new JButton("Lecturer");
        lecturerbuttonbackgroundpanel.setBounds(326,169,147,46);
        lecturerbuttonbackgroundpanel.setBackground(new Color(231,120,40));
        lecturerbuttonbackgroundpanel.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
        Border borderlbg = BorderFactory.createLineBorder(new Color(253,95,85));
        lecturerbuttonbackgroundpanel.setBorder(borderlbg);
        lecturerbuttonbackgroundpanel.addActionListener(this);
        backgroundpanel.add(lecturerbuttonbackgroundpanel);


        tutorbuttonbackgroundpanel = new JButton("Tutor");
        tutorbuttonbackgroundpanel.setBounds(327,235,120,43);//setting the size in x-axis,y-axis,width and height format
        tutorbuttonbackgroundpanel.setBackground(new Color(90,227,27));//adding background color for tutor button
        tutorbuttonbackgroundpanel.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
        Border bordertbg = BorderFactory.createLineBorder(new Color(101,203,197));
        tutorbuttonbackgroundpanel.setBorder(bordertbg);
        tutorbuttonbackgroundpanel.addActionListener(this);
        backgroundpanel.add(tutorbuttonbackgroundpanel);


        exitbuttonbackgroundpanel = new JButton("Exit");
        exitbuttonbackgroundpanel.setBounds(328,296,83,42);
        exitbuttonbackgroundpanel.setBackground(new Color(194,0,235));
        exitbuttonbackgroundpanel.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,20));
        Border borderetb = BorderFactory.createEmptyBorder(1, 1, 01, 01);
        exitbuttonbackgroundpanel.setBorder(borderetb);
        exitbuttonbackgroundpanel.addActionListener(this);
        backgroundpanel.add(exitbuttonbackgroundpanel);


        //Import image for front page background set. 
        ImageIcon icon = new ImageIcon("F:\\project\\JAVA\\23050299-MD SAMIM RAIN\\23050299-MD SAMIM RAIN\\classroom.png"); // setting the path image.
        
        //Create a JLabel to display the image
        imagelabel = new JLabel();
        imagelabel.setBounds(248, 92, icon.getIconWidth(), icon.getIconHeight());
        imagelabel.setIcon(icon);
        backgroundpanel.add(imagelabel);

        backgroundpanel.setBackground(new Color(56,179,227));//set the RGB color for background panel color
        backgroundpanel.setBounds(0,0,1000,720);
        backgroundpanel.setLayout(null);
        frame.add(backgroundpanel);

        //---------------End of front page-----------------//
        
        //---------------Start a Lecturer page---------------//

        lecturerpanel = new JPanel();//Import a new panel for lecturer page.
        
        //Create a JLabel and JTextField for lecturer page.
        textoflecturerlable = new JLabel("Lecturer Page.");
        textoflecturerlable.setBackground(new Color(121,52,32));
        textoflecturerlable.setBounds(400,20,400,35);
        textoflecturerlable.setFont(new Font("Times New Roman",Font.ITALIC,30));
        lecturerpanel.add(textoflecturerlable);

        teacheridlecturerpanellabel = new JLabel("Teacher ID :");
        teacheridlecturerpanellabel.setBounds(53,75,120,30);
        teacheridlecturerpanellabel.setForeground(Color.BLACK);
        teacheridlecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(teacheridlecturerpanellabel);
        
        teacheridtextlecturer = new JTextField();
        teacheridtextlecturer.setBounds(200,75,200,30);
        teacheridtextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        teacheridtextlecturer.setForeground(Color.black);
        Border border = BorderFactory.createLineBorder(Color.black,1);
        teacheridtextlecturer.setBorder(border);
        lecturerpanel.add(teacheridtextlecturer);


        teachernamelecturerpanellabel = new JLabel("Teacher name :");
        teachernamelecturerpanellabel.setBounds(53,150,150,33);
        teachernamelecturerpanellabel.setForeground((Color.BLACK));
        teachernamelecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(teachernamelecturerpanellabel);

        teachernametextlecturer = new JTextField();
        teachernametextlecturer.setBounds(200,150,200,30);
        teachernametextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        teachernametextlecturer.setForeground(Color.BLACK);
        Border bordertnl = BorderFactory.createLineBorder(Color.black,1);
        teachernametextlecturer.setBorder(bordertnl);
        lecturerpanel.add(teachernametextlecturer);

        addresslecturerpanellabel = new JLabel("Address :");
        addresslecturerpanellabel.setBounds(53,228,105,33);
        addresslecturerpanellabel.setForeground(Color.BLACK);
        addresslecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(addresslecturerpanellabel);

        addresstextlecturer = new JTextField();
        addresstextlecturer.setBounds(200,228,200,30);
        addresstextlecturer.setForeground(Color.BLACK);
        addresstextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderal = BorderFactory.createLineBorder(Color.black,1);
        addresstextlecturer.setBorder(borderal);
        lecturerpanel.add(addresstextlecturer);

        workingtypelecturerpanellabel = new JLabel("Working type :");
        workingtypelecturerpanellabel.setBounds(53,313,150,33);
        workingtypelecturerpanellabel.setForeground(Color.BLACK);
        workingtypelecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(workingtypelecturerpanellabel);

        workingtypetextlecturer = new JTextField();
        workingtypetextlecturer.setBounds(200,313,200,30);
        workingtypetextlecturer.setForeground(Color.BLACK);
        workingtypetextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderwtl = BorderFactory.createLineBorder(Color.black,1);
        workingtypetextlecturer.setBorder(borderwtl);
        lecturerpanel.add(workingtypetextlecturer);

        gradedscorelecturerpanellabel = new JLabel("Garded Score :");
        gradedscorelecturerpanellabel.setBounds(53,400,150,36);
        gradedscorelecturerpanellabel.setForeground(Color.BLACK);
        gradedscorelecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(gradedscorelecturerpanellabel);
        
        gradedscoretextlecturer = new JTextField();
        gradedscoretextlecturer.setBounds(200,400,200,30);
        gradedscoretextlecturer.setForeground(Color.BLACK);
        gradedscoretextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border bordergsl = BorderFactory.createLineBorder(Color.black,1);
        gradedscoretextlecturer.setBorder(bordergsl);
        lecturerpanel.add(gradedscoretextlecturer);

        workinghourslecturerpanellabel = new JLabel("Working Hours :");
        workinghourslecturerpanellabel.setBounds(541,75,150,30);
        workinghourslecturerpanellabel.setForeground(Color.BLACK);
        workinghourslecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(workinghourslecturerpanellabel);

        workinghourstextlecturer = new JTextField();
        workinghourstextlecturer.setBounds(720,75,200,30);
        workinghourstextlecturer.setForeground(Color.BLACK);
        workinghourstextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderwhl = BorderFactory.createLineBorder(Color.black,1);
        workinghourstextlecturer.setBorder(borderwhl);
        lecturerpanel.add(workinghourstextlecturer);

        yearsofexperiencelecturerpanellabel = new JLabel("Years of experience :");
        yearsofexperiencelecturerpanellabel.setBounds(541,150,200,33);
        yearsofexperiencelecturerpanellabel.setForeground(Color.BLACK);
        yearsofexperiencelecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(yearsofexperiencelecturerpanellabel);

        yearsofexperiencetextlecturer=new JTextField();
        yearsofexperiencetextlecturer.setBounds(720,150,200,30);
        yearsofexperiencetextlecturer.setForeground(Color.BLACK);
        yearsofexperiencetextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderyoel = BorderFactory.createLineBorder(Color.black,1);
        yearsofexperiencetextlecturer.setBorder(borderyoel);
        lecturerpanel.add(yearsofexperiencetextlecturer);

        departmentlecturerpanellabel = new JLabel("Department :");
        departmentlecturerpanellabel.setBounds(541,228,143,33);
        departmentlecturerpanellabel.setForeground(Color.BLACK);
        departmentlecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(departmentlecturerpanellabel);

        departmenttextlecturer =new JTextField();
        departmenttextlecturer.setBounds(720,228,200,30);
        departmenttextlecturer.setForeground(Color.BLACK);
        departmenttextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderdl = BorderFactory.createLineBorder(Color.black,1);
        departmenttextlecturer.setBorder(borderdl);
        lecturerpanel.add(departmenttextlecturer);

        employmentstatuslecturerpanellabel = new JLabel("Employment Status :");
        employmentstatuslecturerpanellabel.setBounds(541,313,200,33);
        employmentstatuslecturerpanellabel.setForeground(Color.BLACK);
        employmentstatuslecturerpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        lecturerpanel.add(employmentstatuslecturerpanellabel);

        employmentstatustextlecturer = new JTextField();
        employmentstatustextlecturer.setBounds(720,313,200,30);
        employmentstatustextlecturer.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        employmentstatustextlecturer.setForeground(Color.BLACK);
        Border borderesl = BorderFactory.createLineBorder(Color.black,1);
        employmentstatustextlecturer.setBorder(borderesl);
        lecturerpanel.add(employmentstatustextlecturer);

        //---------------End of Jlabel and JTextField variables which is added in lecturer page.---------------//

        //----------Adding a Button for lecturer page-----------//

        addbuttonlecturerpanel = new JButton("Add Lecturer");
        addbuttonlecturerpanel.setBounds(113,520,150,30);
        addbuttonlecturerpanel.setBackground(new Color(189,171,196));
        addbuttonlecturerpanel.addActionListener(this);
        lecturerpanel.add(addbuttonlecturerpanel);

        gradedassignmentsbuttonlecturerpanel = new JButton("Graded Assignments");
        gradedassignmentsbuttonlecturerpanel.setBounds(113,590,165,30);
        gradedassignmentsbuttonlecturerpanel.setBackground(new Color(166,195,227));
        gradedassignmentsbuttonlecturerpanel.addActionListener(this);
        lecturerpanel.add(gradedassignmentsbuttonlecturerpanel);

        displaybuttonlecturerpanel = new JButton("Display");
        displaybuttonlecturerpanel.setBounds(300,520,94,30);
        displaybuttonlecturerpanel.setBackground(new Color(166,195,227));
        displaybuttonlecturerpanel.addActionListener(this);
        lecturerpanel.add(displaybuttonlecturerpanel);

        clearbuttonlecturerpanel = new JButton("Clear");
        clearbuttonlecturerpanel.setBounds(300,590,94,30);
        clearbuttonlecturerpanel.setBackground(new Color(168,156,240));
        clearbuttonlecturerpanel.addActionListener(this);
        lecturerpanel.add(clearbuttonlecturerpanel);

        backbuttonlecturerpanel = new JButton("Back");
        backbuttonlecturerpanel.setBounds(878,22,103,35);
        backbuttonlecturerpanel.setBackground(new Color(249,63,11));
        backbuttonlecturerpanel.setForeground(Color.black);
        backbuttonlecturerpanel.addActionListener(this);
        lecturerpanel.add(backbuttonlecturerpanel);
        
        //---------------End of Jlabel,JTextField, and Buuton part variables which is added in lecturer page.---------------//

        //Adding a RGB color for lecturer page.
        lecturerpanel.setBackground(new Color(171,235,235));
        lecturerpanel.setBounds(0,0,1000,720);//start with 0,0 X and Y -axis and width(1000) and height(720). 
        lecturerpanel.setLayout(null);


        //---------------Start a new page for Tutor---------------//

        //adding a panel for tutor page.
        tutorpanel = new JPanel();

        //create a Jlabel and JTextField for Tutor page.
        textoftutorlable = new JLabel("Tutor Page.");
        textoftutorlable.setBackground(new Color(121,52,32));
        textoftutorlable.setBounds(400,20,400,35);
        textoftutorlable.setFont(new Font("Times New Roman",Font.ITALIC,30));
        tutorpanel.add(textoftutorlable);

        teacheridtutorpanellabel = new JLabel("Teacher ID :");
        teacheridtutorpanellabel.setBounds(53,75,120,30);
        teacheridtutorpanellabel.setForeground(Color.BLACK);
        teacheridtutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(teacheridtutorpanellabel);

        teacheridtexttutor = new JTextField();
        teacheridtexttutor.setBounds(200,75,200,30);
        teacheridtexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        teacheridtexttutor.setForeground(Color.BLACK);
        Border bordertidt = BorderFactory.createLineBorder(Color.black,1);
        teacheridtexttutor.setBorder(bordertidt);
        tutorpanel.add(teacheridtexttutor);

        teachernametutorpanellabel = new JLabel("Teacher name :");
        teachernametutorpanellabel.setBounds(53,150,150,33);
        teachernametutorpanellabel.setForeground(Color.BLACK);
        teachernametutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(teachernametutorpanellabel);

        teachernametexttutor = new JTextField();
        teachernametexttutor.setBounds(200,150,200,30);
        teachernametexttutor.setForeground(Color.BLACK);
        teachernametexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border bordertnt = BorderFactory.createLineBorder(Color.black,1);
        teachernametexttutor.setBorder(bordertnt);
        tutorpanel.add(teachernametexttutor);

        addresstutorpanellabel = new JLabel("Address :");
        addresstutorpanellabel.setBounds(53,228,105,33);
        addresstutorpanellabel.setForeground(Color.BLACK);
        addresstutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(addresstutorpanellabel);

        addresstexttutor = new JTextField();
        addresstexttutor.setBounds(200,228,200,30);
        addresstexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        addresstexttutor.setForeground(Color.BLACK);
        Border borderat = BorderFactory.createLineBorder(Color.black,1);
        addresstexttutor.setBorder(borderat);
        tutorpanel.add(addresstexttutor);

        workingtypetutorpanellabel = new JLabel("Working type :");
        workingtypetutorpanellabel.setBounds(53,313,150,33);
        workingtypetutorpanellabel.setForeground(Color.BLACK);
        workingtypetutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(workingtypetutorpanellabel);

        workingtypetexttutor = new JTextField();
        workingtypetexttutor.setBounds(200,313,200,30);
        workingtypetexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        workingtypetexttutor.setForeground(Color.BLACK);
        Border borderwtt = BorderFactory.createLineBorder(Color.black,1);
        workingtypetexttutor.setBorder(borderwtt);
        tutorpanel.add(workingtypetexttutor);

        workinghourstutorpanellabel = new JLabel("Working Hours :");
        workinghourstutorpanellabel.setBounds(53,395,150,33);
        workinghourstutorpanellabel.setForeground(Color.BLACK);
        workinghourstutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(workinghourstutorpanellabel);

        workinghourstexttutor = new JTextField();
        workinghourstexttutor.setBounds(200,395,200,30);
        workinghourstexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        workingtypetexttutor.setForeground(Color.BLACK);
        Border borderwht = BorderFactory.createLineBorder(Color.black,1);
        workinghourstexttutor.setBorder(borderwht);
        tutorpanel.add(workinghourstexttutor);

        salarytutorpanellabel = new JLabel("Salary :");
        salarytutorpanellabel.setBounds(520,75,143,33);
        salarytutorpanellabel.setForeground(Color.BLACK);
        salarytutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(salarytutorpanellabel);

        salarytexttutor = new JTextField();
        salarytexttutor.setBounds(720,75,200,30);
        salarytexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        salarytexttutor.setForeground(Color.BLACK);
        Border borderst = BorderFactory.createLineBorder(Color.black,1);
        salarytexttutor.setBorder(borderst);
        tutorpanel.add(salarytexttutor);

        specializationtutorpanellabel = new JLabel("Specialization :");
        specializationtutorpanellabel.setBounds(520,150,143,33);
        specializationtutorpanellabel.setForeground(Color.BLACK);
        specializationtutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(specializationtutorpanellabel);

        specializationtexttutor = new JTextField();
        specializationtexttutor.setBounds(720,150,200,30);
        specializationtexttutor.setFont(new Font("ARial",Font.ROMAN_BASELINE,14));
        specializationtexttutor.setForeground(Color.BLACK);
        Border borderspt = BorderFactory.createLineBorder(Color.black,1);
        specializationtexttutor.setBorder(borderspt);
        tutorpanel.add(specializationtexttutor);

        employmentstatustutorpanellabel = new JLabel("Employment Status :");
        employmentstatustutorpanellabel.setBounds(520,228,200,33);
        employmentstatustutorpanellabel.setForeground(Color.BLACK);
        employmentstatustutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(employmentstatustutorpanellabel);

        employmentstatustexttutor = new JTextField();
        employmentstatustexttutor.setBounds(720,228,200,30);
        employmentstatustexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        Border borderest = BorderFactory.createLineBorder(Color.black,1);
        employmentstatustexttutor.setBorder(borderest);
        tutorpanel.add(employmentstatustexttutor);

        academicqualificationtutorpanellabel = new JLabel("Academic Qualification :");
        academicqualificationtutorpanellabel.setBounds(520,315,200,22);
        academicqualificationtutorpanellabel.setForeground(Color.BLACK);
        academicqualificationtutorpanellabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        tutorpanel.add(academicqualificationtutorpanellabel);

        academicqualificationtexttutor = new JTextField();
        academicqualificationtexttutor.setBounds(720,313,200,30);
        academicqualificationtexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        academicqualificationtexttutor.setForeground(Color.BLACK);
        Border borderaqt = BorderFactory.createLineBorder(Color.black,1);
        academicqualificationtexttutor.setBorder(borderaqt);
        tutorpanel.add(academicqualificationtexttutor);

        performanceindextutorpanellabel = new JLabel("Performance Index :");
        performanceindextutorpanellabel.setBounds(520,395,200,33);
        performanceindextutorpanellabel.setForeground(Color.BLACK);
        performanceindextutorpanellabel.setFont(new Font("Times NEw Roman",Font.PLAIN,20));
        tutorpanel.add(performanceindextutorpanellabel);

        performanceindextexttutor = new JTextField();
        performanceindextexttutor.setBounds(720,395,200,30);
        performanceindextexttutor.setFont(new Font("Arial",Font.ROMAN_BASELINE,14));
        performanceindextexttutor.setForeground(Color.BLACK);
        Border borderpit = BorderFactory.createLineBorder(Color.black,1);
        performanceindextexttutor.setBorder(borderpit);
        tutorpanel.add(performanceindextexttutor);

        //-----Adding a button tutor page-----//

        addtutorbuttonpanel = new JButton("Add Tutor");
        addtutorbuttonpanel.setBounds(113,500,150,30);
        addtutorbuttonpanel.setBackground(new Color(189,171,196));
        addtutorbuttonpanel.addActionListener(this);
        tutorpanel.add(addtutorbuttonpanel);

        setsalarybuttontutorpanel = new JButton("Set Salary");
        setsalarybuttontutorpanel.setBounds(113,560,150,30);
        setsalarybuttontutorpanel.setBackground(new Color(166,195,227));
        setsalarybuttontutorpanel.addActionListener(this);
        tutorpanel.add(setsalarybuttontutorpanel);
        
        removebuttontutorpanel = new JButton("Remove Tutor");
        removebuttontutorpanel.setBounds(113,625,150,30);
        removebuttontutorpanel.setBackground(new Color(223,235,200));
        removebuttontutorpanel.addActionListener(this);
        tutorpanel.add(removebuttontutorpanel);

        displaybuttontutorpanel = new JButton("Display");
        displaybuttontutorpanel.setBounds(300,500,94,30);
        displaybuttontutorpanel.setBackground(new Color(166,195,227));
        displaybuttontutorpanel.addActionListener(this);
        tutorpanel.add(displaybuttontutorpanel);

        clearbuttontutorpanel = new JButton("Clear");
        clearbuttontutorpanel.setBounds(300,560,94,30);
        clearbuttontutorpanel.setBackground(new Color(168,156,240));
        clearbuttontutorpanel.addActionListener(this);
        tutorpanel.add(clearbuttontutorpanel);

        backbuttontutorpanel = new JButton("Back");
        backbuttontutorpanel.setBounds(878,22,103,35);
        backbuttontutorpanel.setBackground(new Color(249,63,11));
        backbuttontutorpanel.setForeground(Color.black);
        backbuttontutorpanel.addActionListener(this);
        tutorpanel.add(backbuttontutorpanel);

        //-----//

        tutorpanel.setBackground(new Color(171,235,235));//import a RGB color 
        tutorpanel.setBounds(0,0,1000,720);
        tutorpanel.setLayout(null);

        //---------------End of Tutor page part which is includes varables JLabel, JTextField, and Button part---------------//

        
        //----------Some import a GUI components frame added----------//

        //adding title for frame.
        frame.add(title);
        frame.setTitle("Teacher management system.");
        // Display the  frame properties
        frame.setSize(1000,720); //adujst size as needed
        frame.setLayout(null);//using null layout
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//using null location relative to
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Handling action events when buttons are clicked.

        if (e.getSource() == lecturerbuttonbackgroundpanel) {
            frame.remove(backgroundpanel);//Removed background panel and add lecturer panel.
            frame.add(lecturerpanel);
            frame.revalidate();//To check revalidate the frame tp reflect change.
            frame.repaint();//Calling repaint method.
        }

        if (e.getSource() == tutorbuttonbackgroundpanel) {
            frame.remove(backgroundpanel);
            frame.add(tutorpanel);
            frame.revalidate();
            frame.repaint();
        }

        if (e.getSource()==backbuttonlecturerpanel){
            frame.add(backgroundpanel);
            frame.remove(lecturerpanel);
            frame.revalidate();
            frame.repaint();
        }

        if (e.getSource()==backbuttontutorpanel){
            frame.add(backgroundpanel);
            frame.remove(tutorpanel);
            frame.revalidate();
            frame.repaint();
        }
        if (e.getSource()==exitbuttonbackgroundpanel) {
            System.exit(0);
        }

        if (e.getSource() == addbuttonlecturerpanel) {
            try {
                int teacherid = Integer.parseInt(teacheridtextlecturer.getText());
                String teachername = teachernametextlecturer.getText();
                String address = addresstextlecturer.getText();
                String workingtype = workingtypetextlecturer.getText();
                String employmentstatus = employmentstatustextlecturer.getText();
                int workinghours = Integer.parseInt(workinghourstextlecturer.getText());
                String department = departmenttextlecturer.getText();
                int yearsofexperience = Integer.parseInt(yearsofexperiencetextlecturer.getText());
        
                if (teacheridtextlecturer.getText().isEmpty() || teachername.isEmpty() ||
                    address.isEmpty() || workingtype.isEmpty() ||
                    employmentstatus.isEmpty() || workinghourstextlecturer.getText().isEmpty() ||
                    department.isEmpty() || yearsofexperiencetextlecturer.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(lecturerpanel, "The fields is empty." + "\n Please fill in all the blank fields.","Message.",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Check if the teacherid already exists
                    boolean teacheridExists = false;
                    for (Teacher Lecturer : teacherlist) {
                        if (Lecturer.getTeacherId() == teacherid) {
                            teacheridExists = true;
                            break;
                        }
                    }
                    //check if teacher id same show error message.
                    if (teacheridExists) {
                        JOptionPane.showMessageDialog(lecturerpanel, "Teacher ID already exists. Please, fill in the unique ID.","Message.",JOptionPane.ERROR_MESSAGE);
                    } 
                    else {
                        Lecturer Lecturer = new Lecturer(teacherid, teachername, address, workingtype, employmentstatus, workinghours, department, yearsofexperience);
        
                        // Add the new lecturer to the list
                        teacherlist.add(Lecturer);
        
                        JOptionPane.showMessageDialog(lecturerpanel, "Lecturer details added successfuly.","Lectur Details.", JOptionPane.INFORMATION_MESSAGE);

                        // Clear text fields
                        teacheridtextlecturer.setText("");
                        teachernametextlecturer.setText("");
                        addresstextlecturer.setText("");
                        workingtypetextlecturer.setText("");
                        workinghourstextlecturer.setText("");
                        yearsofexperiencetextlecturer.setText("");
                        employmentstatustextlecturer.setText("");
                        departmenttextlecturer.setText("");
                        gradedscoretextlecturer.setText("");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lecturerpanel, "Invalid input values."+"\n(Teacher ID, Working hours, and Years of experience.)","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        // Action listener for graded assignments button in lecturer panel
        if (e.getSource() == gradedassignmentsbuttonlecturerpanel) {
            try {
                // Parsing input values
                int teacherid = Integer.parseInt(teacheridtextlecturer.getText());
                int gradedscore = Integer.parseInt(gradedscoretextlecturer.getText());
                String department = departmenttextlecturer.getText();
                int yearsofexperience = Integer.parseInt(yearsofexperiencetextlecturer.getText());
                
                // Check for empty fields
                if (teacheridtextlecturer.getText().isEmpty() || gradedscoretextlecturer.getText().isEmpty() || department.isEmpty() || yearsofexperiencetextlecturer.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(lecturerpanel, "The text fields empty.","Error",JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean found = false;
                    // Iterate through teacher list to find matching teacher ID
                    for (Teacher teacher : teacherlist) {
                        // Found matching lecturer, update graded score
                        if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherid) {
                            ((Lecturer)teacher).gradedAssignment(gradedscore, department, yearsofexperience);
                            found = true;
                           
                            JOptionPane.showMessageDialog(lecturerpanel, "Your graded assignments has been successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                    // If lecturer not found, display error message
                    if (!found) {
                        JOptionPane.showMessageDialog(lecturerpanel, "TeacherID not found.");
                    }
                    // Clear text fields
                    teacheridtextlecturer.setText("");
                    teachernametextlecturer.setText("");
                    addresstextlecturer.setText("");
                    workingtypetextlecturer.setText("");
                    workinghourstextlecturer.setText("");
                    yearsofexperiencetextlecturer.setText("");
                    employmentstatustextlecturer.setText("");
                    departmenttextlecturer.setText("");
                    gradedscoretextlecturer.setText("");
                }
            } catch (NumberFormatException ex) {
                // Handle invalid input
                JOptionPane.showMessageDialog(lecturerpanel, "Invalid input. Please enter valid values.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Action listener for display button in lecturer panel
        if (e.getSource() == displaybuttonlecturerpanel) {
            try {
                int teacherid = Integer.parseInt(teacheridtextlecturer.getText());
                if (teacheridtextlecturer.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(lecturerpanel, "The text field is empty", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean lecturerfound = false;
                    // Iterate through teacher list to find matching teacher ID
                    for (Teacher teacher : teacherlist) {
                        if (teacher instanceof Lecturer && teacher.getTeacherId() == teacherid) {
                            // Found matching lecturer
                            Lecturer lecturer = (Lecturer) teacher;
                            lecturerfound = true;
                            if (lecturer.getGradedScore() == 0) {
                                // Display lecturer details
                                JOptionPane.showMessageDialog(lecturerpanel,
                                        "Teacher ID: " + lecturer.getTeacherId() + "\n" +
                                                "Teacher Name: " + lecturer.getTeachername() + "\n" +
                                                "Address: " + lecturer.getAddress() + "\n" +
                                                "Working Type: " + lecturer.getWorkingtype() + "\n" +
                                                "Working Hours: " + lecturer.getWorkinghours() + "\n" +
                                                "Years of Experience: " + lecturer.getyearsOfExperience() + "\n" +
                                                "Department: " + lecturer.getdepartment() + "\n" +
                                                "Employment Status: " + lecturer.getEmployment_Status() + "\n" +
                                                "Graded Score:" + lecturer.getGradedScore(),
                                        "Lecturer Details", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(lecturerpanel,
                                        "Teacher ID: " + lecturer.getTeacherId() + "\n" +
                                                "Teacher Name: " + lecturer.getTeachername() + "\n" +
                                                "Address: " + lecturer.getAddress() + "\n" +
                                                "Working Type: " + lecturer.getWorkingtype() + "\n" +
                                                "Working Hours: " + lecturer.getWorkinghours() + "\n" +
                                                "Years of Experience: " + lecturer.getyearsOfExperience() + "\n" +
                                                "Department: " + lecturer.getdepartment() + "\n" +
                                                "Employment Status: " + lecturer.getEmployment_Status() + "\n" +
                                                "Graded Score: " + lecturer.getGradedScore(),
                                        "Lecturer Details", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break; 
                        }
                    }
                    if (!lecturerfound) {
                        JOptionPane.showMessageDialog(lecturerpanel,
                                "No lecturer details is added.", "Empty List", JOptionPane.INFORMATION_MESSAGE);
                    }
                    teacheridtextlecturer.setText("");
                    teachernametextlecturer.setText("");
                    addresstextlecturer.setText("");
                    workingtypetextlecturer.setText("");
                    workinghourstextlecturer.setText("");
                    yearsofexperiencetextlecturer.setText("");
                    employmentstatustextlecturer.setText("");
                    departmenttextlecturer.setText("");
                    gradedscoretextlecturer.setText("");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(lecturerpanel, "Invalid input. Please enter a numeric value in Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        // Action listener for clear button in lecturer panel
        if (e.getSource() == clearbuttonlecturerpanel) {
            // Clear text fields
            teacheridtextlecturer.setText("");
            teachernametextlecturer.setText("");
            addresstextlecturer.setText("");
            workingtypetextlecturer.setText("");
            workinghourstextlecturer.setText("");
            yearsofexperiencetextlecturer.setText("");
            employmentstatustextlecturer.setText("");
            departmenttextlecturer.setText("");
            gradedscoretextlecturer.setText("");
        }
        // Action listener for adding a tutor
        if(e.getSource() == addtutorbuttonpanel){
            try{
                int teacherid = Integer.parseInt(teacheridtexttutor.getText());
                String teachername = teachernametexttutor.getText();
                String address = addresstexttutor.getText();
                String workingtype = workingtypetexttutor.getText();
                int workinghours = Integer.parseInt(workinghourstexttutor.getText());
                double salary = Double.parseDouble(salarytexttutor.getText());
                String specialization = specializationtexttutor.getText();
                String employmentstatus = employmentstatustexttutor.getText();
                String academicqualifications = academicqualificationtexttutor.getText();
                int performanceindex = Integer.parseInt(performanceindextexttutor.getText());

                // Check for empty fields
                if((teacheridtexttutor.getText()).isEmpty() || teachername.isEmpty() || address.isEmpty() || workingtype.isEmpty() || workinghourstexttutor.getText().isEmpty() || salary<=0.0|| specialization.isEmpty() || employmentstatus.isEmpty() || academicqualifications.isEmpty() || performanceindextexttutor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(tutorpanel,"The text fields empty.","Message",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    //check if teacherid already exists.
                    boolean teacheridExists = false;
                    for(Teacher Tutor : teacherlist){
                        if(Tutor.getTeacherId() == teacherid){
                            teacheridExists = true;
                            break;
                        }
                    }
                    //check if teacherid same error message then, show in tutor.
                    if(teacheridExists){
                        JOptionPane.showMessageDialog(tutorpanel,"Teacher id already exists.","TeacherId same found.",JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        // Create a new Tutor object and add it to the teacher list
                        Tutor Tutor = new Tutor(teacherid, teachername, address, workingtype, employmentstatus, workinghours, salary, specialization, academicqualifications, performanceindex);

                        teacherlist.add(Tutor);
                       // Show success message and clear text fields
                        JOptionPane.showMessageDialog(tutorpanel,"Tutor add successfully.","Tutor details",JOptionPane.INFORMATION_MESSAGE);
                        
                        teacheridtexttutor.setText("");
                        teachernametexttutor.setText("");
                        addresstexttutor.setText("");
                        workingtypetexttutor.setText("");
                        workinghourstexttutor.setText("");
                        salarytexttutor.setText("");
                        specializationtexttutor.setText("");
                        employmentstatustexttutor.setText("");
                        academicqualificationtexttutor.setText("");
                        performanceindextexttutor.setText("");
                    }
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(tutorpanel,"Invalid input values.","Invalid",JOptionPane.ERROR_MESSAGE);
            }
        }

        // Action listener for setting salary of a tutor
        if(e.getSource() == setsalarybuttontutorpanel){
            try{
                int teacherid = Integer.parseInt(teacheridtexttutor.getText());
                double salary = Double.parseDouble(salarytexttutor.getText());
                int performanceindex = Integer.parseInt(performanceindextexttutor.getText());

                // Check for empty fields
                if(teacheridtexttutor.getText().isEmpty() || salary <=0.0 || performanceindextexttutor.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(tutorpanel,"Fields are empty founds.","Empty",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    // Find the tutor with the given teacher ID
                    boolean found = false;
                    for (Teacher teacher : teacherlist)
                    {
                        if (teacher instanceof Tutor && teacher.getTeacherId() == teacherid)
                        {
                            Tutor tutor = (Tutor) teacher;
                            found = true;
                             // Set salary based on performance index
                            tutor.setSalary(salary, performanceindex);
                            JOptionPane.showMessageDialog(tutorpanel,"Your set salary is successfully.","Message",JOptionPane.INFORMATION_MESSAGE);
                            
                            break;
                        }
                    }
                    // Show error message if tutor not found
                    if(! found){
                        JOptionPane.showMessageDialog(tutorpanel,"TeacherID has not been match.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                     // Clear text fields
                    teacheridtexttutor.setText("");
                    teachernametexttutor.setText("");
                    addresstexttutor.setText("");
                    workingtypetexttutor.setText("");
                    workinghourstexttutor.setText("");
                    salarytexttutor.setText("");
                    specializationtexttutor.setText("");
                    employmentstatustexttutor.setText("");
                    academicqualificationtexttutor.setText("");
                    performanceindextexttutor.setText("");
                }
            }catch(NumberFormatException ex){
                // Handle invalid input values
                JOptionPane.showMessageDialog(tutorpanel, "Invalid input values","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        // Action listener for removing a tutor
        if (e.getSource() == removebuttontutorpanel) {
            try {
                int teacherID = Integer.parseInt(teacheridtexttutor.getText());
                if (teacherID == 0) {
                    JOptionPane.showMessageDialog(null, "Teacher ID is empty.", "Empty Teacher ID", JOptionPane.ERROR_MESSAGE);
                } else {
                    boolean teacherFound = false;
                    Teacher Tutorremove = null;
                    // Iterate through teacher list to find the tutor with the given ID
                    for (Teacher teacher : teacherlist) {
                        if (teacher.getTeacherId() == teacherID) {
                            if (teacher instanceof Tutor) {
                                Tutor tutor = (Tutor) teacher;
                                // Check if the tutor is certified
                                if (tutor.getIsCertified()) {
                                    JOptionPane.showMessageDialog(null, "Certified tutors cannot be removed.", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                } else {
                                    teacherFound = true;
                                    Tutorremove = tutor;
                                    break;
                                }
                            }
                        }
                    }
                    if (teacherFound) {
                        // Remove the tutor from the teacher list and show success message
                        ((Tutor) Tutorremove).removeTutor();
                        teacherlist.remove(Tutorremove);
                        JOptionPane.showMessageDialog(null, "Tutor removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Show error message if tutor not found
                        JOptionPane.showMessageDialog(null, "Teacher ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }            
                        teacheridtexttutor.setText("");
                        teachernametexttutor.setText("");
                        addresstexttutor.setText("");
                        workingtypetexttutor.setText("");
                        workinghourstexttutor.setText("");
                        specializationtexttutor.setText("");
                        employmentstatustexttutor.setText("");
                        performanceindextexttutor.setText("");
                        academicqualificationtexttutor.setText("");
                        salarytexttutor.setText("");
                }
            } catch (NumberFormatException ex) {
                // Handle invalid input values
                JOptionPane.showMessageDialog(tutorpanel, "Invalid input value for Teacher ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Action listener for displaying tutor details
        if (e.getSource() == displaybuttontutorpanel) {
            try{
                // Parse teacher ID from the text field
                int teacherid =Integer.parseInt(teacheridtexttutor.getText());
                // Check if the teacher ID field is empty
                if(teacheridtexttutor.getText().isEmpty()){
                    JOptionPane.showMessageDialog(tutorpanel,"TeacherId empty.","Empty",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    boolean tutorfound = false;
                    // Iterate through the teacher list to find the tutor with the given ID
                    for(Teacher teacher : teacherlist){
                        if(teacher instanceof Tutor && teacher.getTeacherId()== teacherid){
                            Tutor tutor = (Tutor)teacher;
                            tutorfound = true;
                            // Display tutor details in a dialog box
                            JOptionPane.showMessageDialog(lecturerpanel, 
                            "Teacher ID: " + tutor.getTeacherId() + "\n" +
                            "Teacher Name: " + tutor.getTeachername() + "\n" +
                            "Address: " + tutor.getAddress() + "\n" +
                            "Working Type: " + tutor.getWorkingtype() + "\n" +
                            "Working Hours: " + tutor.getWorkinghours() + "\n" +
                            "Salary: " + tutor.getSalary() + "\n" +
                            "Specialization: " + tutor.getSpecialization() + "\n" +
                            "Employment Status: " + tutor.getEmployment_Status()+ "\n"+
                            "Academic Qualification: " + tutor.getAcademicqualifications() + "\n" +
                            "Performance index:" + tutor.getPerformanceIndex(),
                            "Tutor Details", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        }
                    }
                    // Show error message if tutor with given ID not found
                    if(!tutorfound){
                        JOptionPane.showMessageDialog(tutorpanel, "Invalid teacherId","Message",JOptionPane.ERROR_MESSAGE);
                    }
                     // Clear the text field for teacher ID
                    teacheridtexttutor.setText("");
                    teachernametexttutor.setText("");
                    addresstexttutor.setText("");
                    workingtypetexttutor.setText("");
                    workinghourstexttutor.setText("");
                    specializationtexttutor.setText("");
                    employmentstatustexttutor.setText("");
                    performanceindextexttutor.setText("");
                    academicqualificationtexttutor.setText("");
                    salarytexttutor.setText("");
                }
            }catch(NumberFormatException ex){
                // Handle invalid input for teacher ID
                JOptionPane.showMessageDialog(tutorpanel," Invalid teacherid.","Message",JOptionPane.ERROR_MESSAGE);
            }
        }

        
        // Action listener for clearing text fields
        if(e.getSource() == clearbuttontutorpanel){
            // Clear all text fields related to tutor information
            teacheridtexttutor.setText("");
            teachernametexttutor.setText("");
            addresstexttutor.setText("");
            workingtypetexttutor.setText("");
            workinghourstexttutor.setText("");
            specializationtexttutor.setText("");
            employmentstatustexttutor.setText("");
            performanceindextexttutor.setText("");
            academicqualificationtexttutor.setText("");
            salarytexttutor.setText("");
        }
    }
    
    public static void main (String[]args){
        new TeacherGUI();
    }
}