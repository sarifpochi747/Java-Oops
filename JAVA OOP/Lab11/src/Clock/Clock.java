package Clock;



import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
class Clock extends JPanel
{   
    private int hour,minute,second;
    private int clockRadius = 100;
    Clock(){
        setCurrentTime();
    }
    
    Clock(int h,int min,int sec,int r)
    {
        hour = h;
        minute = min;
        second = sec;
        clockRadius = r;
        
    }
    @Override
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        g.drawOval(getWidth()/2-clockRadius,getHeight()/2-clockRadius,2*clockRadius,2*clockRadius);
        
        //System.out.println(getX()+" "+getY()+" "+getWidth()/2+" "+getHeight()/2);
        //draw String
        g.drawString("12",getWidth()/2 - 5 , getHeight()/2-clockRadius+15);
        g.drawString("6",getWidth()/2 - 5 , getHeight()/2+clockRadius - 10);
        g.drawString("3",getWidth()/2 +clockRadius - 15 , getHeight()/2);
        g.drawString("9",getWidth()/2  -clockRadius +10 , getHeight()/2);
        
        //draw second hand
        int sLenght =  (int)(clockRadius *0.8);
        int xSecond = (int)(getWidth()/2 + sLenght*Math.sin(second*(2*Math.PI/60)));
        int ySecond = (int)(getHeight()/2 - sLenght*Math.cos(second*(2*Math.PI/60)));
        g.setColor(Color.red);
        g.drawLine(getWidth()/2, getHeight()/2,xSecond, ySecond);
        
        
        //draw minute hand
        int mLenght = (int)(clockRadius * 0.65);
        int xMinute = (int)(getWidth()/2 + mLenght*Math.sin(minute*(2*Math.PI)/60));
        int yMinute = (int)(getHeight()/2 - mLenght*Math.cos(minute*(2*Math.PI)/60));
        g.setColor(Color.BLUE);
        g.drawLine(getWidth()/2, getHeight()/2, xMinute, yMinute);
        
        //draw hour hand
        int hLenght = (int)(clockRadius*0.5);
        int xHour  = (int)(getWidth()/2+hLenght*Math.sin((hour%12+minute/60) * (2*Math.PI/12)));
        int yHour  = (int)(getHeight()/2-hLenght*Math.cos((hour%12+minute/60) * (2*Math.PI/12)));
        g.setColor(Color.green);
        g.drawLine(getWidth()/2,getHeight()/2,xHour,yHour);
    }
    
    public void setCurrentTime() {
        // Construct a calendar for the current date and time
        Calendar calendar = new GregorianCalendar();

        // Set current hour, minute and second
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
        }

         @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
        }
}