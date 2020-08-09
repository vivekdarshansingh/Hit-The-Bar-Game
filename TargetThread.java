
class TargetThread extends Thread
{
public void run()
{
try
{
while(true)
{
int y=MyGame.target.getY();
if(y==400)
y=-10;
MyGame.target.setBounds(360,y+10,30,100);
Thread.sleep(10);
}

}
catch(Exception e)
{
} 
}
}
