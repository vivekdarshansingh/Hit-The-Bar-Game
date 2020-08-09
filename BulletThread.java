import java.awt.*;
class BulletThread extends Thread
{
public void run()
{
try
{
Button b= new Button();
for(int i=50;i<=400;i+=5)
{
b.setBounds(i,175,10,10);
MyGame.f.add(b);
Thread.sleep(50);
}
}
catch(Exception e)
{
}

}
}