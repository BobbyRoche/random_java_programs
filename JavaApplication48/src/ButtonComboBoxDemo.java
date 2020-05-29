import java.awt.*;

import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

/** Test JRadioButton, JCheckBox and JComboBox */
@SuppressWarnings("serial")
public class ButtonComboBoxDemo extends JFrame {

    private JLabel lblForTest;
private String imgCrossFilename = "images/cross.gif";
private String lblText = "Cross";
private Icon iconCross;

private JRadioButton rbLeft, rbCenter, rbRight, rbTop, rbMiddle, rbBottom;
private JCheckBox cbText, cbIcon;
private JComboBox<String> comboColor;

/** Constructor to setup the UI components */
public ButtonComboBoxDemo() {
// Create a JLabel with text and icon for manipulation
URL imgURL = getClass().getClassLoader().getResource(imgCrossFilename);
if (imgURL != null) {
iconCross = new ImageIcon(imgURL);
} else {
System.err.println("Couldn't find file: " + imgCrossFilename);
}
lblForTest = new JLabel(lblText, iconCross, SwingConstants.CENTER);
lblForTest.setOpaque(true);
lblForTest.setBackground(new Color(204, 238, 241));
lblForTest.setForeground(Color.RED);
lblForTest.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 18));

rbLeft = new JRadioButton("Left");
rbLeft.setMnemonic(KeyEvent.VK_L);
rbCenter = new JRadioButton("Center", true);
rbCenter.setMnemonic(KeyEvent.VK_C);
rbRight = new JRadioButton("Right");
rbRight.setMnemonic(KeyEvent.VK_R);
ButtonGroup btnGroupH = new ButtonGroup();
btnGroupH.add(rbLeft);
btnGroupH.add(rbRight);
btnGroupH.add(rbCenter);

JPanel pnlRbtnH = new JPanel(new GridLayout(1, 0)); // single row
pnlRbtnH.add(rbLeft);
pnlRbtnH.add(rbCenter);
pnlRbtnH.add(rbRight);
pnlRbtnH.setBorder(BorderFactory.createTitledBorder("Horizontal Alignment"));

ItemListener listener = new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
if (e.getStateChange() == ItemEvent.SELECTED) {
if (e.getSource() == rbLeft) {
lblForTest.setHorizontalAlignment(SwingConstants.LEFT);
} else if (e.getSource() == rbCenter) {
lblForTest.setHorizontalAlignment(SwingConstants.CENTER);
} else if (e.getSource() == rbRight) {
lblForTest.setHorizontalAlignment(SwingConstants.RIGHT);
}
}
}
};
rbLeft.addItemListener(listener);
rbCenter.addItemListener(listener);
rbRight.addItemListener(listener);

// Create radio buttons for setting vertical alignment of the JLabel
rbTop = new JRadioButton("Top");
rbTop.setMnemonic(KeyEvent.VK_T);
rbMiddle = new JRadioButton("Middle", true); // selected
rbMiddle.setMnemonic(KeyEvent.VK_M);
rbBottom = new JRadioButton("Bottom");
rbBottom.setMnemonic(KeyEvent.VK_B);

ButtonGroup btnGroupV = new ButtonGroup();
btnGroupV.add(rbTop);
btnGroupV.add(rbMiddle);
btnGroupV.add(rbBottom);

JPanel pnlRbtnV = new JPanel(new GridLayout(1, 0)); // single row
pnlRbtnV.add(rbTop);
pnlRbtnV.add(rbMiddle);
pnlRbtnV.add(rbBottom);
pnlRbtnV.setBorder(BorderFactory.createTitledBorder("Vertical Alignment"));


rbTop.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
lblForTest.setVerticalAlignment(SwingConstants.TOP);
}
});
rbMiddle.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
lblForTest.setVerticalAlignment(SwingConstants.CENTER);
}
});
rbBottom.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
lblForTest.setVerticalAlignment(SwingConstants.BOTTOM);
}
});

cbText = new JCheckBox("Text", true); // selected
cbText.setMnemonic(KeyEvent.VK_T);
cbIcon = new JCheckBox("Icon", true); // selected
cbIcon.setMnemonic(KeyEvent.VK_I);
cbIcon.setSelected(true);

JPanel pnlCbox = new JPanel(new GridLayout(0, 1)); // single column
pnlCbox.add(cbText);
pnlCbox.add(cbIcon);

cbText.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {

    if (e.getStateChange() == ItemEvent.SELECTED) {
lblForTest.setText(lblText);
} else {
lblForTest.setText("");
}
}
});
cbIcon.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {

    if (e.getStateChange() == ItemEvent.SELECTED) {
lblForTest.setIcon(iconCross);
} else {
lblForTest.setIcon(null);
}
}
});

String[] strColors = {"Red", "Blue", "Green",
"Cyan", "Magenta", "Yellow", "Black"};
final Color[] colors = {Color.RED, Color.BLUE, Color.GREEN,
Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.BLACK};
comboColor = new JComboBox<String>(strColors);
comboColor.addItemListener(new ItemListener() {
@Override
public void itemStateChanged(ItemEvent e) {
if (e.getStateChange() == ItemEvent.SELECTED) {
lblForTest.setForeground(colors[comboColor.getSelectedIndex()]);
}
}
});

JPanel pnlCombo = new JPanel(new FlowLayout());
pnlCombo.add(comboColor);


Container cp = this.getContentPane();
cp.setLayout(new BorderLayout());
cp.add(lblForTest, BorderLayout.CENTER);
cp.add(pnlRbtnH, BorderLayout.NORTH);
cp.add(pnlRbtnV, BorderLayout.SOUTH);
cp.add(pnlCbox, BorderLayout.WEST);
cp.add(pnlCombo, BorderLayout.EAST);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("Button and ComboBox Demo");
setSize(400, 300);
setLocationRelativeTo(null);
setVisible(true);
}


public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {
public void run() {
new ButtonComboBoxDemo(); 
}
});
}
}