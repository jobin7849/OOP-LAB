import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class HouseCanvas extends JPanel {
private Color doorColor = Color.RED;
private final int DOOR_X = 170;
private final int DOOR_Y = 200;
private final int DOOR_W = 60;
private final int DOOR_H = 100;
public HouseCanvas() {
addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int clickX = e.getX();
int clickY = e.getY();
if (clickX >= DOOR_X && clickX <= (DOOR_X + DOOR_W) &&
clickY >= DOOR_Y && clickY <= (DOOR_Y + DOOR_H)) {
if (doorColor == Color.RED) {
doorColor = Color.BLUE;
} else {
doorColor = Color.RED;
}
repaint();
}
}
});
}
@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2d = (Graphics2D) g;
g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
g2d.setColor(Color.LIGHT_GRAY);
g2d.fillRect(100, 150, 200, 150);
g2d.setColor(Color.BLACK);
g2d.drawRect(100, 150, 200, 150);
int[] xPoints = {80, 200, 320};
int[] yPoints = {150, 50, 150};
g2d.setColor(Color.DARK_GRAY);
g2d.fillPolygon(xPoints, yPoints, 3);
g2d.setColor(doorColor);
g2d.fillRect(DOOR_X, DOOR_Y, DOOR_W, DOOR_H);
g2d.setColor(Color.BLACK);
g2d.drawRect(DOOR_X, DOOR_Y, DOOR_W, DOOR_H);
}
}

public class HouseGraphicsDemo extends JFrame {
public HouseGraphicsDemo() {
setTitle("Experiment 18: Graphics Event Handling");
setSize(400, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
add(new HouseCanvas());
}
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new HouseGraphicsDemo().setVisible(true);
});
}
}
