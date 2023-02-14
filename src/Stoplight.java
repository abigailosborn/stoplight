
/**
 * Create a GUI that makes a stoplight that changes color 
 * when the user clicks the changeColor button.
 *
 * @author Abigail Osborn
 * @version November 13, 2022
 */
//import necessary classes
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Stoplight extends JFrame implements ActionListener
{
    //intialize variables
    public static final int WIDTH = 300;
    public static final int HEIGHT = 500;
    private JButton changeColor;
    private DrawStoplight light;

    //Constructor that acts as method
    public Stoplight(){

        //instantiate button
        changeColor = new JButton("Change");
        changeColor.addActionListener(this);

        //set frame's title
        setTitle("Stoplight");

        //create DrawStoplight object
        light = new DrawStoplight();
        light.setPreferredSize(new Dimension(160, 290));
        
        //create panel with drawstoplight object and changeColor button
        JPanel panel = new JPanel();
        panel.add(light);
        panel.add(changeColor);

        //create Container
        Container pane = getContentPane();
        pane.add(panel);
        
        //set frame's width and height in pixels
        setSize(WIDTH, HEIGHT);
        
        //set program to exit on close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //make program visible to user
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        //Do action when button is pressed
        if(e.getActionCommand().equals("Change")){
            //set the color of the stoplight
            light.setColor();
        } 
    }
    /**
     * 
     * main class to create JFrame object thus calling default
     * constructor
     * 
     */
    public static void main(String[] args){
        Stoplight window = new Stoplight();
        window.pack();
    }
}