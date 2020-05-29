import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.util.Date;
import javax.swing.Timer;
public class TimerFrame extends JFrame
{
 private String message;
 private JLabel label;
 private JButton smallerButton;
 private JButton largerButton; 
  private double fontSizeFactor = 1;


 private static int FRAME_WIDTH = 300;
 private static int FRAME_HEIGHT = 300;
 private static int DEFAULT_SIZE = 20;
    private final JLabel currentTime;
 public TimerFrame()
 {
 
 message = (new Date()).toString();
 currentTime = new JLabel(message);
 currentTime.setFont(new Font("Serif", Font.PLAIN,
DEFAULT_SIZE));
 add(currentTime, BorderLayout.CENTER);

 setSize(FRAME_WIDTH, FRAME_HEIGHT);
 createEastPanel();
 int delay = 1000;
 Timer timer = new Timer(delay, new TimerListener());
timer.start();
 
 }
 private void createEastPanel(){
  smallerButton = new JButton("Smaller");
  ActionListener smallerListener = new SmallerFontListener();
 smallerButton.addActionListener(smallerListener);
 largerButton = new JButton("Larger");
 ActionListener largerListener = new LargerFontListener();
 largerButton.addActionListener(largerListener);

 JPanel eastPanel = new JPanel();
 eastPanel.setLayout(new GridLayout(2, 1));
 eastPanel.add(smallerButton);
 eastPanel.add(largerButton);
 add(eastPanel, BorderLayout.EAST);
 }
 class LargerFontListener implements ActionListener
 {
  @Override
 public void actionPerformed(ActionEvent event)
 {
 fontSizeFactor = 1.25 * fontSizeFactor;
 currentTime.setFont(new Font("Serif", Font.PLAIN,(int)(DEFAULT_SIZE * fontSizeFactor)));
 currentTime.repaint();
 }

 }
 class SmallerFontListener implements ActionListener
 {
  @Override
 public void actionPerformed(ActionEvent event)
 {
 fontSizeFactor = 0.8 * fontSizeFactor;
 currentTime.setFont(new Font("Serif", Font.PLAIN,(int)(DEFAULT_SIZE * fontSizeFactor)));
 currentTime.repaint();
 }

 }
 
 class TimerListener implements ActionListener{
     @Override
     public void actionPerformed(ActionEvent event){
          message = (new Date()).toString();
         currentTime.setText(message);
     }
     
 }
 }
