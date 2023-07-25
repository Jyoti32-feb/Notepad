import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    About(){
        setBounds(400,100,600,500);
        setLayout(null);
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("notepadIcon/windows-10-logo.png"));
        Image I2=I1.getImage().getScaledInstance(300,60, Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel headerIcon=new JLabel(I3);
        headerIcon.setBounds(70,40,400,60);
        add(headerIcon);

        ImageIcon I4=new ImageIcon(ClassLoader.getSystemResource("notepadIcon/notepad.png"));
        Image I5=I4.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon I6=new ImageIcon(I5);
        JLabel Icon=new JLabel(I6);
        Icon.setBounds(50,180,70,70);
        add(Icon);

        JLabel text=new JLabel("<html>Code for Interview with jyoti<br>Version 0.1.0(os build Java)<br>Code for Interview with jyoti<br><html/>");
        text.setBounds(150,100,500,200);
        text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
        add(text);

        JButton b1=new JButton("OK");
        b1.setBounds(150,350,120,25);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);

    }

    public static void main(String[] args){
        new About();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);

    }
}
