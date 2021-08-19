package pro4;

import  javax.swing.*; 
import  java.awt.*;  
import  java.awt.event.*; 
import  java.util.HashMap; 
import  java.util.*;

public  class  Shop  implements  ActionListener	
{
	String  user="User1";
	String  pass="1234"; 
	String  un="";
	String  pw;
	int	id; 
	JTextField  userid,phno,Itemid,quan,name; 
	JButton  submit;
	double  total=0.0;
	
	static  HashMap<Long,Integer>users=new  HashMap<Long,Integer>();
	
	static  ArrayList<Item>  it=new  ArrayList<Item>(); Shop()
	{
		while(!un.equals(user)||  !pw.equals(pass))  
		{ 
			un=JOptionPane.showInputDialog(null,"Enter  username"); 
			if(!un.equals(user))  {
				JOptionPane.showMessageDialog(null,  "Invalid  user");
			}
			else {
				if(un.equals(user))  
				{ 
					pw=JOptionPane.showInputDialog(null,"Enter password");
					if(pw.equals(pass))  {
						break;
					}	
					else {
						JOptionPane.showMessageDialog(null,  "Invalid password");
					}
				}

				}
		}
		
	long  ph=Long.parseLong(JOptionPane.showInputDialog(null,"Enter Phone_No"));
	if(users.containsKey(ph))  { 
		id=users.get(ph);
		JOptionPane.showMessageDialog(null,  "Welcome User "+id); 
	}	
	
	else {
		id=Integer.parseInt(JOptionPane.showInputDialog(null,"New user,Enter new id"));
		users.put(ph,id); 
	}
	
	JFrame  frm=new  JFrame("Details"); 
	JLabel  name1=new  JLabel("User"); 
	JLabel  ph1=new  JLabel("Phone"); 
	JLabel  id1=new  JLabel("Itemid"); 
	JLabel  q1=new  JLabel("Quantity"); 
	JLabel  n1=new  JLabel("Item_name"); 
	userid=new  JTextField(20); 
	phno=new  JTextField(20); 
	Itemid=new  JTextField(20); 
	quan=new  JTextField(20);
	name=new  JTextField(20); 
	submit=new  JButton("Submit"); 
	frm.add(name1);frm.add(userid);
	userid.setText(String.valueOf(id)); 
	userid.setEditable(false); 
	frm.add(ph1);
	frm.add(phno); 
	phno.setText(String.valueOf(ph)); 
	frm.add(id1);
	frm.add(Itemid); 
	frm.add(q1);
	frm.add(quan);
	frm.add(n1);
	frm.add(name); 
	frm.add(submit); 
	submit.addActionListener(this); 
	frm.setSize(300,300); 
	frm.setVisible(true); 
	frm.setLayout(new  GridLayout(6,2));
	}
	
	
	public  void  actionPerformed(ActionEvent  evt)  
	{ 
		String  itid=Itemid.getText();
		int  itq=Integer.parseInt(quan.getText()); 
		String  itna=name.getText();
		String  discounts[]=  {"0","5","10","15"};
		int  r=JOptionPane.showOptionDialog(null,  "Select discount","Disc",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,discounts,discounts[0]); 
		for(Item  ii  :it)  
		{
			if(ii.id.equals(itid))  {
				total=itq*ii.price;
			}
		}
		total=total-(total*0.01*Integer.parseInt(discounts[r])); 
		String  t=String.valueOf(total); 
		JOptionPane.showMessageDialog(null,"Total  for  "+itna+"  is"+t);

	}
	
	
public  static  void  main(String  args[])  
{ 
	users.put((long)  1234567890,1); 
	it.add(new  Item("Bat","1",500));
	it.add(new  Item("Gloves","2",200));
	it.add(new  Item("Ball","3",300)); 
	it.add(new Item("Knee Pad","4",1000));
	Shop  obj=new  Shop();
}

}
