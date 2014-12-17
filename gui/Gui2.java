import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;
    private JCheckBox box;
    private int x = 10;
    private int y = 10;
    

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintcomponent(g);
	    get.setcolor(Color.red);
	    g.fillOval(30,30,30,30);
	}
    }
    

    private class Key implements KeyListener{
	public void keyPressed(KeyEvent e){}
	public void keyReleased(KeyEvent e ){}
	public void keyTyped(KeyEvent e){
	    if(box.isSelected()){
		String s = text.getText();
		text.setText(s);
	    }
  
	}
	

    }
    
	
    public void actionPerformed(ActionEvent e) {
	if( e.getsource()== b1){
	    System.out.println("You clicked me");
	    System.out.println("By the way the textbox has" +text.getText());
	    System.out.println();
	}else if (e.getsource() == b2){
	    System.out.println("Shutting Down");
	    System.exit(0);
	}else if ( e.getsource() == labeler){
	    l.setText(text.getText);
	}
	       
    }

    public Gui2(){
	
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	l = new JLabel("The Label:");
	pane.add(l);					       
	b1 = new JButton("click me");
	pane.add(b1);
	b1.addActionListener(this); 
	b2 = new JButton("exit");
	b2.addActionListener(this);
	pane.add(b2);
	box = new JCheckBox("cap");
	pane.add(box);

	labeler = new JButton ("Labeler");
	labeler.addActionListener(this);
	pane.add(labeler)
	
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	text.addKEyListener( new Key
	pane.add(text);
	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);
				
}		

    public static void main(String[] args) {
	Gui2 f = new Gui2();
	f.setVisible(true);
		}
}
