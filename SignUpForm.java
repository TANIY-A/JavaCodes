import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.Choice;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class SignUpForm extends Frame implements  ActionListener{
      TextField userId=new TextField(10);
      TextField mailId=new TextField(10);
      TextField phNo=new TextField(10);
      Choice c=new Choice();
      Button submit,reset;
      Label label1,label2,label3,label4,label5;
      CheckboxGroup cbg=new CheckboxGroup();
    SignUpForm(){
         //Setting frame
          setTitle("SignUp form");
          setSize(190, 340);
          setVisible(true);
          setLayout(new FlowLayout());
          //Setting label
          label1 =new Label("USER ID");
          label2 =new Label("MAIL ID");
          label3 =new Label("PH.NO");
          label4 =new Label("GENDER");
          label5 =new Label("JOB");
          //Setting button
          submit=new Button("Submit");
          //Setting choice
          c. add("Male");
          c.add("Female");
         
          //Setting checkbox
          Checkbox checkbox1=new Checkbox("Student",cbg,false);
          Checkbox checkbox2=new Checkbox("Teacher",cbg,false);
          //adding
          add(label1);
          add(userId);
          add(label2);
          add(mailId);
          add(label3);
          add(phNo);
          add(label4);
          add(c);
          add(label5);
          add(checkbox1);
          add(checkbox2);
          add(submit);
         submit.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
     System.out.println("User Id: "+userId.getText());
     System.out.println("Mail Id: "+mailId.getText());
     System.out.println("Phone No.: "+phNo.getText());
     System.out.println("Gender: "+c.getSelectedItem());
     System.out.println("Job: "+cbg.getSelectedCheckbox());

    }
    public static void main(String[] args){
     SignUpForm ob=new SignUpForm();
    }
    
}
