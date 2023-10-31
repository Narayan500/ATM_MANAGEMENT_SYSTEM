package bank.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class SignupTwo extends JFrame implements ActionListener {
    JTextField Aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
         setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
         
         
         
         JLabel additonalDetails = new JLabel("Page 2: Additonal Details");
         additonalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
         additonalDetails.setBounds(290,80,600,30);
         add(additonalDetails);
         
         
         JLabel name = new JLabel("Religion:");
         name.setFont(new Font("Raleway", Font.BOLD, 20));
         name.setBounds(100,140,100,30);
         add(name);
         
         String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
         religion=new JComboBox(valreligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.WHITE);
         add(religion);
         
         
         
         
         
         
         JLabel fname = new JLabel("Category:");
         fname.setFont(new Font("Raleway", Font.BOLD, 20));
         fname.setBounds(100,190,200,30);
         add(fname);
         
         
         String valcategory[] = {"General","OBC","SC","ST","Other"};
         category=new JComboBox(valcategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);
        
         
         JLabel dob = new JLabel("Income:");
         dob.setFont(new Font("Raleway", Font.BOLD, 20));
         dob.setBounds(100,240,200,30);
         add(dob);
         
         String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
         income=new JComboBox(incomecategory);
         income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
         add(income);
         
         
         
         
         
         
         
         JLabel Education =  new JLabel("Educational:");
         Education.setFont(new Font("Raleway", Font.BOLD, 20));
         Education.setBounds(100,290,200,30);
         add(Education);
         
        
         JLabel Qualification=new JLabel("Qualification");
         Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
         Qualification.setBounds(100,315,200,30);
         add(Qualification);
         
         
         String educationValues[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
         education=new JComboBox(educationValues);
         education.setFont(new Font("Raleway", Font.BOLD, 14));
         education.setBounds(300,315,400,30);
         add(education);
         
         JLabel occ=new JLabel("Occupation:");
         occ.setFont(new Font("Raleway", Font.BOLD, 20));
         occ.setBounds(100,390,200,30);
         add(occ);
         
         
         
         String occupationValues[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
         occupation=new JComboBox(occupationValues);
         occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
           
        
                 
            
         
         
         JLabel Pannumber=new JLabel("PAN Number:");
         Pannumber.setFont(new Font("Raleway", Font.BOLD, 20));
         Pannumber.setBounds(100,440,200,30);
         add(Pannumber); 
         
         
          pan=new JTextField();
         pan.setFont(new Font("Raleway", Font.BOLD, 14));
         pan.setBounds(300,440,400,30);
         add(pan);
        
         
         
         
         JLabel Aadharnumber=new JLabel("Aadhar Number:");
         Aadharnumber.setFont(new Font("Raleway", Font.BOLD, 20));
         Aadharnumber.setBounds(100,490,200,30);
         add(Aadharnumber); 
         
          Aadhar=new JTextField();
          Aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
          Aadhar.setBounds(300,490,400,30);
         add( Aadhar);
         
         
         
         
         JLabel SeniorCitizen=new JLabel("Senior Citizen:");
         SeniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
         SeniorCitizen.setBounds(100,540,200,30);
         add(SeniorCitizen);
         
         
         syes=new JRadioButton("Yes");
         syes.setBounds(300,540,100,30);
         syes.setBackground(Color.WHITE);
         add(syes);
         
         sno=new JRadioButton("No");
         sno.setBounds(450,540,120,30);
         sno.setBackground(Color.WHITE);
         add(sno);
         
        ButtonGroup SeniorCitizengroup=new ButtonGroup();
        SeniorCitizengroup.add(syes);
        SeniorCitizengroup.add(sno);
        
         
         
         
         JLabel pincode=new JLabel("Existing Account:");
         pincode.setFont(new Font("Raleway", Font.BOLD, 20));
         pincode.setBounds(100,590,200,30);
         add(pincode);
         
         
        eyes=new JRadioButton("Yes");
         eyes.setBounds(300,590,100,30);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
         eno=new JRadioButton("No");
         eno.setBounds(450,590,120,30);
         eno.setBackground(Color.WHITE);
         add(eno);
         
        ButtonGroup ExistingAccountgroup=new ButtonGroup();
       ExistingAccountgroup.add(syes);
        ExistingAccountgroup.add(sno);
        
        
         
         
         next=new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway", Font.BOLD, 14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         String sreligion = (String)religion.getSelectedItem(); 
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String span = pan.getText();
        String saadhar = Aadhar.getText();
        
        
         String seniorcitizen=null;
         if(syes.isSelected()){ 
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){ 
            seniorcitizen = "No";
        }
         
        String eaccount =null;
        if(eyes.isSelected()){ 
            eaccount = "Yes";
        }else if(eno.isSelected()){ 
            eaccount = "No";
        }
        try{
           
                Conn c = new Conn();
                String quary = "insert into signupTwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+eaccount+"')";
                
                c.s.executeUpdate(quary);
                
                //SignupThree object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
                
      
            
        }catch(Exception e){
            System.out.println(e);
        }
         
         
         
     
     }
    public static void main(String[] args) {
        new SignupTwo ("");
        
    }
    
}
