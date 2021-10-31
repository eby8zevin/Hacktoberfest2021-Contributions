

package Programs;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class CalculatorGUI extends WindowAdapter implements ActionListener {
	JPanel bp=new JPanel();
    JPanel dp=new JPanel();
	JTextArea text;
    Button b[]=new Button[17];
    String num="",num2="",num1="";
	String operator="";
	double res=0;
    
    CalculatorGUI()
    {
    	
    	Frame f=new Frame("Calculator");  

        //super("My Window");
        
            
       dp.setBackground(Color.gray);
       dp.setBorder(new EmptyBorder(2,3,2,3));
       bp.setBackground(Color.gray);
        for(int i=0;i<=9;i++) {
        	b[i]=new Button(i+"");
        }
        b[10]=new Button("+");
        b[11]=new Button("*");
        b[12]=new Button("-");
        b[13]=new Button("/");
        b[14]=new Button("C");
        b[15]=new Button("=");
        b[16]=new Button("%");
        
        for(int i=0;i<16;i++) {
        	bp.add(b[i]);
        	b[i].setBackground(Color.lightGray);
        }
        for(int i=0;i<16;i++) {
        	b[i].addActionListener(this);
        	
        }
        
        bp.setLayout(new GridLayout(4,4,1,1));
        text=new JTextArea(5, 35);
        dp.add(text);
        f.setLayout(new BorderLayout());
        f.add(dp,BorderLayout.NORTH);
        bp.setSize(200,350);
        f.add(bp);
        
        f.addWindowListener(this);
        f.setSize(350,350);
        f.setVisible(true);

    }  
    public double calculate(String op,double num1,double num2) {
    	res=0;
    	switch(op) {
    	case"+": res=num1+num2;
    		break;
    	case"*": res=num1*num2;
		break;
    	case"/": res=num1/num2;
		break;
    	case"-": res=num1-num2;
		break;
    	}
		return res;
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		res=0;
		
		// TODO Auto-generated method stub
		String key=e.getActionCommand();	
	    if(key.equals("0")|key.equals("1")|key.equals("2")|key.equals("3")|key.equals("4")|key.equals("5")|key.equals("6")|key.equals("7")|key.equals("8")|key.equals("9")) {
	    	num+=key;
	    	text.setText(num1+operator+num);
	    }
	   else if(key.equals("+")|key.equals("-")|key.equals("*")|key.equals("/")) {
	    	operator=key;
	    	if(!num.equals("")) {
	    		num1=num;
	    		text.setText(num1+operator);
	    		num="";
	    		
	    	}
	    	else
	    		text.setText("Syntax Error");
	    }
	   else if(key.equals("=")) {
	    	num2=num;
	    	text.setText(num1+" "+operator+" "+num2);
	    	try {	
	    		if(!num1.equals("")&& !num2.equals("")) {
	    			res=calculate(operator,Double.parseDouble(num1),Double.parseDouble(num2));
	    		}
	    	}
	    	catch(NumberFormatException nfe) {
	    		
	    	}
	    	text.setText(num1+operator+num2+"=\n"+res);
	    	num2=res+"";
	    	
	    	num=num2;
	    	num1=num2;
	    	
	    	
	   	}
	    else if(key=="C") {
	    	num=num1=num2=operator="";
	    	text.setText("");
	    }
	    
   }

	
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }
 
    
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.exit(0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorGUI f=new CalculatorGUI();  
	}

}

