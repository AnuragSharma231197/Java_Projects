import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
		String a;
		int b;
		int c;
		int d;
		int g;
		double g1;
		Frame f;
		Label view;
		Label edit;
		Label help;
		TextField result;
		TextField input;
		Button back;
		Button CE;
		Button C;
		Button dot;
		Button sign;
		Button underroot;
		Button divide;
		Button multiply;
		Button addition;
		Button subtract;
		Button modulous;
		Button equal;
		Button zero;
		Button onedividenum;
		Button numberone;
		Button numbertwo;
		Button numberthree;
		Button numberfour;
		Button numberfive;
		Button numbersix;
		Button numberseven;
		Button numbereight;
		Button numbernine;
	Calculator(String s){
		f=new Frame(s);
		view=new Label("view");
		view.setBounds(20,30,40,20);
		f.add(view);
		edit=new Label("edit");
		edit.setBounds(60,30,40,20);
		f.add(edit);
		help=new Label("help");
		help.setBounds(100,30,40,20);
		f.add(help);
		result=new TextField();
		result.setBounds(10,50,223,60);
		f.add(result);
		back=new Button("Cl");
		back.setBounds(10,110,45,30);
		back.addActionListener(this);
		f.add(back);
		CE=new Button("CE");
		CE.setBounds(55,110,45,30);
		CE.addActionListener(this);
		f.add(CE);
		C=new Button("C");
		C.setBounds(100,110,45,30);
		C.addActionListener(this);
		f.add(C);
		sign=new Button("+/-");
		sign.setBounds(145,110,45,30);
		sign.addActionListener(this);
		f.add(sign);
		underroot=new Button("root");
		underroot.setBounds(190,110,45,30);
		underroot.addActionListener(this);
		f.add(underroot);
		modulous=new Button("%");
		modulous.setBounds(190,140,45,30);
		modulous.addActionListener(this);
		f.add(modulous);
		onedividenum=new Button("1/x");
		onedividenum.setBounds(190,170,45,30);
		onedividenum.addActionListener(this);
		f.add(onedividenum);
		equal=new Button("=");
		equal.setBounds(190,200,45,120);
		equal.addActionListener(this);
		f.add(equal);
		divide=new Button("/");
		divide.setBounds(145,140,45,30);
		divide.addActionListener(this);
		f.add(divide);
		multiply=new Button("*");
		multiply.setBounds(145,170,45,30);
		multiply.addActionListener(this);
		f.add(multiply);
		subtract=new Button("-");
		subtract.setBounds(145,200,45,30);
		subtract.addActionListener(this);
		f.add(subtract);
		addition=new Button("+");
		addition.setBounds(145,230,45,90);
		addition.addActionListener(this);
		f.add(addition);
		dot=new Button(".");
		dot.setBounds(100,290,45,30);
		dot.addActionListener(this);
		f.add(dot);
		zero=new Button("0");
		zero.setBounds(10,290,90,30);
		zero.addActionListener(this);
		f.add(zero);
		numberone=new Button("1");
		numberone.setBounds(10,140,45,30);
		numberone.addActionListener(this);
		f.add(numberone);
		numbertwo=new Button("2");
		numbertwo.setBounds(55,140,45,30);
		numbertwo.addActionListener(this);
		f.add(numbertwo);
		numberthree=new Button("3");
		numberthree.setBounds(100,140,45,30);
		numberthree.addActionListener(this);
		f.add(numberthree);
		numberfour=new Button("4");
		numberfour.setBounds(10,170,45,30);
		numberfour.addActionListener(this);
		f.add(numberfour);
		numberfive=new Button("5");
		numberfive.setBounds(55,170,45,30);
		numberfive.addActionListener(this);
		f.add(numberfive);
		numbersix=new Button("6");
		numbersix.setBounds(100,170,45,30);
		numbersix.addActionListener(this);
		f.add(numbersix);
		numberseven=new Button("7");
		numberseven.setBounds(10,200,45,30);
		numberseven.addActionListener(this);
		f.add(numberseven);
		numbereight=new Button("8");
		numbereight.setBounds(55,200,45,30);
		numbereight.addActionListener(this);
		f.add(numbereight);
		numbernine=new Button("9");
		numbernine.setBounds(100,200,45,30);
		numbernine.addActionListener(this);
		f.add(numbernine);
		input=new TextField();
		input.setBounds(10,230,135,60);
		f.add(input);
		result.setEditable(false);
		result.setEnabled(false);
		//Frame Adding
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(245,330);
	}
	public void actionPerformed(ActionEvent e){
		
			if(e.getActionCommand().equals("0")){
			a=input.getText();
			input.setText(a+e.getActionCommand());
			}
			else if(e.getActionCommand().equals("1")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			 else if(e.getActionCommand().equals("2")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("3")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("4")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("5")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("6")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("7")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("8")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			else if(e.getActionCommand().equals("9")){
				a=input.getText();
				input.setText(a+e.getActionCommand());
				
			}
			
			if(e.getActionCommand().equals("+")){
				g=Integer.parseInt(input.getText());
				input.setText("");
				d=1;
			}
			if(e.getActionCommand().equals("-")){		
		    g=Integer.parseInt(input.getText());
			input.setText("");
			d=2;
			}
			if(e.getActionCommand().equals("*")){
				g=Integer.parseInt(input.getText());
				input.setText("");
				d=3;
			}
			if(e.getActionCommand().equals("/")){
			g=Integer.parseInt(input.getText());
			input.setText("");
			d=4;
			}
			if(e.getActionCommand().equals("%")){
				g=Integer.parseInt(input.getText());
				input.setText("");
				d=5;
			}
			if(e.getActionCommand().equals("+/-")){
				g=Integer.parseInt(input.getText())*(-1);
				result.setText(String.valueOf(g));
				input.setText(String.valueOf(g));
				
			}
			if(e.getActionCommand().equals("1/x")){
				g1=Double.parseDouble(input.getText());
				double xresult=1/g1;
				result.setText(String.valueOf(xresult));
				
			}
			if(e.getActionCommand().equals("root")){
				g=Integer.parseInt(input.getText());
				result.setText(String.valueOf(Math.sqrt(g)));
			}
			
			
			if(e.getActionCommand().equals("=")){
				if(d==1){
					b=Integer.parseInt(input.getText());
					result.setText(String.valueOf(g+b));
				}
				else if(d==2){
					b=Integer.parseInt(input.getText());
					result.setText(String.valueOf(g-b));
				}
				else if(d==3){
					b=Integer.parseInt(input.getText());
					result.setText(String.valueOf(g*b));
				}
				else if(d==4){
					b=Integer.parseInt(input.getText());
					result.setText(String.valueOf(g/b));
				}
				else if(d==5){
					b=Integer.parseInt(input.getText());
					result.setText(String.valueOf(g%b));
				}
				
				
			}
			
		
			if(e.getActionCommand().equals("C")){
				input.setText("");
				result.setText("");
				a="";
			}
			if(e.getActionCommand().equals("CE")){
				result.setText("");
			}
			/*if(e.getActionCommand().equals("Cl")){
				StringBuilder sb=new StringBuilder(a);
				String str=sb.deleteCharAt(a.length()-1).toString();
				input.setText(str);
			}*/
		
		}
public static void main(String []args){
	new Calculator("Calculator");
	}
}