import java.awt.*;
import javax.swing.JComponent;
public class DrawStoplight extends JComponent {
    //initialize colors 
    Color go = Color.GRAY;
    Color slowDown = Color.GRAY;
    Color stop = Color.RED;

    String temp = "red";

    @Override
    public void paintComponent(Graphics g) {
       // Cast to Graphics2D
       //Graphics2D graphicsObj = (Graphics2D)g;   //casting to draw 2D objects
       // Write your drawing instructions
       g.setColor(new Color(210, 225, 0));
       g.fillRect(0,0,150,280);
       
       g.setColor(Color.BLACK);
       g.drawRect(0,0,150,280);

       g.setColor(Color.BLACK);
       g.drawOval(50,40,50,50);

       g.setColor(stop);
       g.fillOval(50,40,50,50);
       g.setColor(Color.GRAY);
       g.drawString("Red", 65, 70);

       g.setColor(Color.BLACK);
       g.drawOval(50,105,50,50);

       g.setColor(slowDown);
       g.fillOval(50,105,50,50);

       g.setColor(Color.GRAY);
       g.drawString("Yellow", 57, 135);

       g.setColor(Color.BLACK);
       g.drawOval(50,170,50,50);

       g.setColor(go);
       g.fillOval(50,170,50,50);
       g.setColor(Color.GRAY);
       g.drawString("Green", 57, 200);
   }
   public void setColor(){
    go = Color.GRAY;
    slowDown = Color.GRAY;
    stop = Color.GRAY;
    if(temp.equals("red")){
        temp = "green";
        go = Color.GREEN;
    }
    else if(temp.equals("green")){
        temp = "yellow";
        slowDown = Color.YELLOW;
    }
    else{
        temp = "red";
        stop = Color.RED;
    }
    repaint();
   }
}
