
import java.awt.*;
import java.awt.event.*;


public class AWT1
{
    public static void main(String args[])
    {
    MyFrame mf = new MyFrame();
    }
}



class MyWindowAdapter extends WindowAdapter
    {
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
    }   
class MyFrame extends Frame
{
    Label lbl, l2; TextField t1;
    MyFrame()
{
    super("Sample Java Frame");
    addWindowListener(new MyWindowListener(){}); 
    setSize(500,400);
    addControls();
    setVisible(true);
}

private void addControls()
{
setLayout(null);

lbl = new Label("Sample Label",Label.CENTER);


lbl.setSize(250,22); lbl.setLocation(10,40);


//lbl.setText("This is the text in the label control"); lbl.setBackground(Color.YELLOW); lbl.setForeground(Color.RED);

//lbl.setAlignment(Label.RIGHT); add(lbl);
l2 = new Label(lbl.getText()); l2.setSize(lbl.getSize());
l2.setLocation(lbl.getLocation().x, lbl.getLocation().y + 30); l2.setAlignment(lbl.getAlignment()); l2.setBackground(lbl.getForeground()); l2.setForeground(lbl.getBackground());
//l2.setVisible(false); add(l2);

t1 = new TextField("This is some initial text in the text box control"); t1.setSize(200,22);
t1.setLocation(10,160);

t1.setEchoChar('^');
if (t1.echoCharIsSet())
{
System.out.println("Input has been masked"); System.out.println("Mask character is " + t1.getEchoChar());
}
add(t1);

t1.setEnabled(false);
//	t1.setEditable(false);
}
}
