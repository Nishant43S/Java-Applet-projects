import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class OddEvenCheacker extends Applet implements ActionListener{
    Label num = new Label("Enter Number");
    TextField num_input = new TextField(20);
    Button result = new Button("Cheack");
    
    String stt ;

    FlowLayout g1 = new FlowLayout(FlowLayout.LEFT);
    public void init(){
        setLayout(g1);
        num.setFont(new Font(
            "arial",Font.BOLD,22
        ));
        num_input.setFont(new Font(
            "arial",Font.BOLD,22
        ));
        result.setFont(new Font(
            "arial",Font.BOLD,22
        ));
      
        add(num);
        add(num_input);
        add(result);
        result.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e) {
        try{
            int num = Integer.parseInt(num_input.getText());
            if(num%2==0){
                stt = " is Even";
            }else{
                stt = " is Odd";
            }
        }catch(Exception ee){
            stt = "Invalit input";   
        }
        repaint();
    };
    public void paint(Graphics g){
        g.setFont(new Font("arial",Font.BOLD,22));
        String output_result = num_input.getText().concat(stt);
        g.drawString(output_result, 135 ,65);
    }

}