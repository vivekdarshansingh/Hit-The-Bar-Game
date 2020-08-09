import java.awt.*;
import java.awt.event.*;
class MyGame implements ActionListener
{
static Frame f;
static Panel p;
static Button tank,target,bullet;
static Label score,timer,mygame;
MyGame()
{
f=new Frame();
p=new Panel();
tank=new Button();
tank.addActionListener(this);

bullet=new Button();
target=new Button();
score=new Label("0");
timer=new Label("60");
mygame=new Label("MyGame");
tank.setBounds(0,160,50,40);
target.setBounds(360,0,30,100);
bullet.setBounds(50,175,10,10);
score.setBounds(0,360,40,40);
timer.setBounds(360,360,40,40);
mygame.setBounds(160,360,40,40);
score.setFont(new Font("Arial",1,20));
timer.setFont(new Font("Arial",1,20));

mygame.setFont(new Font("Arial",1,20));
p.setLayout(new FlowLayout());

f.setLayout(null);
p.setBounds(0,360,400,40);
p.add(score);
p.add(mygame);
p.add(timer);
f.add(p);
f.add(tank);
f.add(target);
f.add(bullet);
f.setVisible(true);
f.setSize(400,400);
}

public static void main(String ar[])
{
MyGame m=new MyGame();
}
public void actionPerformed(ActionEvent e)
{
BulletThread m=new BulletThread();
m.start();
}
}