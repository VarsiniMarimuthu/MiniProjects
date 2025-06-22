import java.awt.*;
import java.awt.event.*;

class one extends Frame
{
private Image backgroundImage;
one()
{
Label la1=new Label("Already a User? ");
Label la2=new Label("Create an Account ");
Button bu1=new Button("SIGN IN");
Button bu2=new Button("SIGN UP");

bu1.setBounds(500,450,100,30);
bu2.setBounds(500,500,100,30);
la1.setBounds(350,450,100,30);
la2.setBounds(350,500,100,30);

add(bu1);
add(bu2);
add(la1);
add(la2);

setTitle("Blood Donation System");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood7.jpg");
setVisible(true);

bu1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
two nextPage = new two();
nextPage.setVisible(true);
}
});

bu2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
three nextPage = new three();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class two extends Frame
{
private Image backgroundImage;
two()
{
Label l1=new Label("USERNAME : ");
Label l2=new Label("PASSWORD : ");
Label l3=new Label("LOGIN PAGE");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("LOGIN");
Button b2=new Button("BACK");

l3.setFont(new Font("Arial",Font.BOLD,30));
l3.setAlignment(Label.CENTER);
l3.setBounds(475,130,200,30);
l3.setBackground(Color.RED);
b1.setBounds(450,500,100,30);
b2.setBounds(600,500,100,30);
l1.setBounds(450,250,90,30);
l2.setBounds(450,300,90,30);
t1.setBounds(550,250,150,30);
t2.setBounds(550,300,150,30);

add(b1);
add(b2);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);

setTitle("Login page");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood3.jpg");
setVisible(true);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
four nextPage = new four();
nextPage.setVisible(true);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
one nextPage = new one();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class three extends Frame
{
private Image backgroundImage;
three()
{
Label la3=new Label("SET USERNAME : ");
Label la4=new Label("SET PASSWORD : ");
Label la5=new Label("CONFIRM PASSWORD : ");
Label l=new Label("ACCOUNT CREATION");
TextField ta3=new TextField();
TextField ta4=new TextField();
TextField ta5=new TextField();
Button bu3=new Button("Continue");

bu3.setBounds(300,490,100,30);
la3.setBounds(200,290,130,30);
la4.setBounds(200,340,130,30);
la5.setBounds(200,390,130,30);
ta3.setBounds(350,290,150,30);
ta4.setBounds(350,340,150,30);
ta5.setBounds(350,390,150,30);
l.setFont(new Font("Arial",Font.BOLD,25));
l.setAlignment(Label.CENTER);
l.setBounds(215,170,270,30);

add(bu3);
add(ta3);
add(ta4);
add(la3);
add(la4);
add(la5);
add(ta5);
add(l);

setLayout(null);
setTitle("Create an Account");
setSize(1920,1080);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood5.jpg");
setVisible(true);

bu3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
two nextPage = new two();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class four extends Frame
{
private Image backgroundImage;
four()
{
Button b=new Button("Continue");
b.setBounds(600,440,100,30);
add(b);

setTitle("Blood Groups");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood9.jpeg");
setVisible(true);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
five nextPage = new five();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class five extends Frame
{
private Image backgroundImage;
five()
{
Button b1=new Button("Add Donar");
Button b2=new Button("Delete Donar");
Button b3=new Button("Search Blood");

b1.setFont(new Font("Modern No. 20",Font.BOLD,20));
b2.setFont(new Font("Modern No. 20",Font.BOLD,20));
b3.setFont(new Font("Modern No. 20",Font.BOLD,20));

b1.setBounds(70,350,200,100);
b2.setBounds(320,350,200,100);
b3.setBounds(570,350,200,100);

add(b1);
add(b2);
add(b3);

setTitle("Selection");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood6.jpg");
setVisible(true);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
ten nextPage = new ten();
nextPage.setVisible(true);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
six nextPage = new six();
nextPage.setVisible(true);
}
});

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
eight nextPage = new eight();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class six extends Frame
{
six()
{
Label l1=new Label(" Enter Donar name: ");
Label l2=new Label("Enter Donar ID: ");
Label l3=new Label("Donar Deletion ");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("DELETE");
Button b2=new Button("BACK");

l3.setFont(new Font("Algerian",Font.BOLD,40));
l3.setAlignment(Label.CENTER);
l3.setBounds(410,130,300,40);
l3.setBackground(Color.PINK);
b1.setBounds(420,500,100,30);
b2.setBounds(600,500,100,30);
l1.setBounds(410,250,120,30);
l1.setBackground(Color.PINK);
l2.setBounds(415,300,120,30);
l2.setBackground(Color.PINK);
t1.setBounds(550,250,150,30);
t2.setBounds(550,300,150,30);

add(b1);
add(b2);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);

setTitle("Donar Deletion");
setSize(1920,1080);
setBackground(Color.PINK);
setLayout(null);
setVisible(true);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
seven nextPage = new seven();
nextPage.setVisible(true);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
five nextPage = new five();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}
}

class seven extends Frame
{
seven()
{
Label l=new Label("Deleted Succesfully : )");
Button b=new Button("BACK");

l.setFont(new Font("Algerian",Font.BOLD,40));
l.setAlignment(Label.CENTER);
l.setBounds(400,130,500,50);
b.setBounds(600,400,100,30);
l.setBackground(Color.PINK);

add(l);
add(b);

setTitle("Delete Donar");
setSize(1920,1080);
setLayout(null);
setVisible(true);
setBackground(Color.PINK);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
five nextPage = new five();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}
}

class eight extends Frame
{
eight()
{
Label l1=new Label(" Enter Name: ");
Label l2=new Label("Enter Mobile No: ");
Label l4=new Label("Enter Mail-Id: ");
Label l5=new Label("Blood Group: ");
Label l3=new Label("Search Blood");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("SEARCH");
Button b2=new Button("BACK");

l3.setFont(new Font("Algerian",Font.BOLD,40));
l3.setAlignment(Label.CENTER);
l3.setBounds(410,130,300,40);
l3.setBackground(Color.PINK);
b1.setBounds(420,570,100,30);
b2.setBounds(600,570,100,30);
l1.setBounds(410,250,120,30);
l1.setBackground(Color.PINK);
l2.setBounds(412,300,120,30);
l2.setBackground(Color.PINK);
l4.setBounds(410,350,120,30);
l5.setBounds(410,400,120,30);
t1.setBounds(550,250,150,30);
t2.setBounds(550,300,150,30);
t3.setBounds(550,350,150,30);

add(b1);
add(b2);
add(l1);
add(l2);
add(l3);
add(t1);
add(t2);
add(l4);
add(t3);
add(l5);

Choice m=new Choice();
m.setBounds(550,400,150,30);
m.add("Blood Group");
m.add("A+");
m.add("A-");
m.add("B+");
m.add("B-");
m.add("O+");
m.add("O-");
m.add("AB+");
m.add("AB-");

add(m);

setTitle("Search Blood");
setSize(1920,1080);

setBackground(Color.PINK);
setLayout(null);
setVisible(true);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
nine nextPage = new nine();
nextPage.setVisible(true);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
five nextPage = new five();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}
}

class nine extends Frame
{
nine()
{
Label l=new Label("If there is a stack for your Blood,Mail will be ");
Label l1=new Label("send to your Mail-Id or Call will be made to you : )");
Button b=new Button("BACK");

l.setFont(new Font("Algerian",Font.BOLD,20));
l1.setFont(new Font("Algerian",Font.BOLD,20));
l.setBounds(400,200,500,50);
l1.setBounds(380,250,500,50);
b.setBounds(550,400,100,30);
l.setBackground(Color.PINK);
l1.setBackground(Color.PINK);

add(l);
add(b);
add(l1);

setTitle("Search Blood");
setSize(1920,1080);
setLayout(null);
setVisible(true);
setBackground(Color.PINK);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
five nextPage = new five();
nextPage.setVisible(true);
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}
}

class ten extends Frame
{
private Image backgroundImage;
ten()
{
Label l=new Label("Donar Details");
l.setFont(new Font("Algerian",Font.ITALIC,25));
l.setAlignment(Label.CENTER);
l.setBounds(100,70,270,30);
add(l);

Label l1=new Label("Donar name: ");
Label l2=new Label("Father's name: ");
Label l3=new Label("Mother's name: ");
Label l4=new Label("Gender: ");
Label l5=new Label("Mobile No: ");
Label l6=new Label("Mail-Id: ");
Label l7=new Label("Date of Birth: ");
Label l8=new Label("Blood Group: ");
TextField t=new TextField();
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextField t4=new TextField();
Button b=new Button("NEXT");
Button b1=new Button("CLEAR");

CheckboxGroup cb=new CheckboxGroup();
Checkbox c1=new Checkbox("Male",cb,false);
c1.setBounds(200,300,60,30);
Checkbox c2=new Checkbox("Female",cb,false);
c2.setBounds(270,300,130,30);

Choice m=new Choice();
m.setBounds(200,505,130,30);
m.add("Blood Group");
m.add("A+");
m.add("A-");
m.add("B+");
m.add("B-");
m.add("O+");
m.add("O-");
m.add("AB+");
m.add("AB-");

add(m);

l1.setBounds(50,150,100,30);
l2.setBounds(50,200,100,30);
l3.setBounds(50,250,100,30);
l4.setBounds(50,300,100,30);
l5.setBounds(50,350,100,30);
l6.setBounds(50,400,100,30);
l7.setBounds(50,450,100,30);
l8.setBounds(50,500,100,30);
b.setBounds(120,600,70,30);
b1.setBounds(210,600,70,30);
t.setBounds(200,150,130,30);
t1.setBounds(200,200,130,30);
t2.setBounds(200,250,130,30);
t3.setBounds(200,350,130,30);
t4.setBounds(200,400,130,30);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(b);
add(b1);
add(t);
add(t1);
add(t2);
add(t3);
add(t4);
add(c1);
add(c2);

List q=new List(32);
List r=new List(13);
List s=new List(20);
q.setBounds(200,455,50,19);
r.setBounds(250,455,60,19);
s.setBounds(310,455,50,19);

q.add("Date");
q.add("01");
q.add("02");
q.add("03");
q.add("04");
q.add("05");
q.add("06");
q.add("07");
q.add("08");
q.add("09");
q.add("10");
q.add("11");
q.add("12");
q.add("13");
q.add("14");
q.add("15");
q.add("16");
q.add("17");
q.add("18");
q.add("19");
q.add("20");
q.add("21");
q.add("22");
q.add("23");
q.add("24");
q.add("25");
q.add("26");
q.add("27");
q.add("28");
q.add("29");
q.add("30");
q.add("31");

r.add("Month");
r.add("Jan");
r.add("Feb");
r.add("Mar");
r.add("Apr");
r.add("May");
r.add("Jun");
r.add("Jul");
r.add("Aug");
r.add("Sep");
r.add("Oct");
r.add("Nov");
r.add("Dec");

s.add("Year");
s.add("2023");
s.add("2022");
s.add("2021");
s.add("2020");
s.add("2019");
s.add("2018");
s.add("2017");
s.add("2016");
s.add("2015");
s.add("2014");
s.add("2013");
s.add("2012");
s.add("2011");
s.add("2010");
s.add("2009");
s.add("2008");
s.add("2007");
s.add("2006");
s.add("2005");
s.add("2004");
s.add("2003");
s.add("2002");
s.add("2001");
s.add("2000");
s.add("1999");
s.add("1998");

add(q);
add(r);
add(s);

setTitle("Add Donar");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood4.jpg");
setVisible(true);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
eleven nextPage = new eleven();
nextPage.setVisible(true);
}
});

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,600,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class eleven extends Frame
{
private Image backgroundImage;
eleven()
{
Label l=new Label("Donar Details");
l.setFont(new Font("Algerian",Font.ITALIC,25));
l.setAlignment(Label.CENTER);
l.setBounds(100,70,270,30);
add(l);

Label l1=new Label("City: ");
Label l2=new Label("State: ");
Label l3=new Label("Country: ");
Label l4=new Label("Address: ");
Label l5=new Label("Covid-19 Plasma Donar: ");
Label l6=new Label("If U have other disease: ");
Label l7=new Label("If Yes,Enter the disease: ");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
TextArea t4=new TextArea();
TextField t5=new TextField();
Button b=new Button("SAVE");
Button b1=new Button("BACK");
Button b2=new Button("CLEAR");

CheckboxGroup cb=new CheckboxGroup();
Checkbox c1=new Checkbox("Yes",cb,false);
c1.setBounds(230,455,60,30);
Checkbox c2=new Checkbox("No",cb,false);
c2.setBounds(300,455,130,30);

CheckboxGroup cb1=new CheckboxGroup();
Checkbox c3=new Checkbox("Yes",cb1,false);
c3.setBounds(230,510,60,30);
Checkbox c4=new Checkbox("No",cb1,false);
c4.setBounds(300,510,130,30);

l1.setBounds(80,148,100,50);
l2.setBounds(80,198,100,50);
l3.setBounds(80,248,100,50);
l4.setBounds(80,298,100,50);
l5.setBounds(60,445,160,50);
l6.setBounds(60,500,160,50);
l7.setBounds(60,550,160,50);
t1.setBounds(200,155,130,30);
t2.setBounds(200,205,130,30);
t3.setBounds(200,255,130,30);
t4.setBounds(200,305,130,100);
t5.setBounds(230,550,130,30);
b.setBounds(90,630,60,30);
b1.setBounds(170,630,60,30);
b2.setBounds(250,630,60,30);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(c1);
add(c2);
add(c3);
add(c4);
add(b);
add(b1);
add(b2);

setTitle("Add Donar ");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood4.jpg");
setVisible(true);

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
twelve nextPage = new twelve();
nextPage.setVisible(true);
}
});

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
dispose();
ten nextPage = new ten();
nextPage.setVisible(true);
}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
t5.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
});

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,600,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class twelve extends Frame
{
private Image backgroundImage;
Frame frame;
twelve()
{
Label l=new Label("Submitted Succesfully : )");
Button b=new Button("OK");
l.setFont(new Font("Algerian",Font.BOLD,30));
l.setAlignment(Label.CENTER);

l.setBounds(460,150,355,30);
b.setBounds(600,590,70,30);

add(l);
add(b);

setTitle("Saved");
setSize(1920,1080);
setLayout(null);
backgroundImage=Toolkit.getDefaultToolkit().getImage("blood8.png");
setVisible(true);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
dispose();
}
});

b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Label label=new  Label("Thank you! Your Blood will Save Someones Life :)");
Dialog d1= new Dialog(frame,"Submitted",true);
d1.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
d1.dispose();
}
});

d1.add(label);
d1.pack();

d1.setBounds(500,300,300,300);
d1.setLayout(null);
d1.setSize(300,100);
d1.setVisible(true);
}
});
}

public void paint(Graphics g)
{
g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
super.paint(g);
}
}

class vv
{
public static void main(String args[])
{
one o=new one();
}
}
