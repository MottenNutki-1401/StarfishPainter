import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class test extends JFrame {

    private Color currentColor = Color.BLACK; // default brush color
    private ArrayList<Point> points = new ArrayList<>();
    private ArrayList<Color> colors = new ArrayList<>(); // store color for each point

    public test() {
        setTitle("Retro Painter with Color Picker");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Canvas panel
        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < points.size(); i++) {
                    g.setColor(colors.get(i));
                    Point p = points.get(i);
                    g.fillOval(p.x, p.y, 5, 5); // brush size 5x5
                }
            }
        };
        canvas.setBackground(Color.WHITE);

        // Mouse drawing
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                points.add(e.getPoint());
                colors.add(currentColor);
                canvas.repaint();
            }
        });

        // Color picker button
        JButton colorButton = new JButton("Pick Color");
        colorButton.addActionListener(e -> {
            Color chosen = JColorChooser.showDialog(this, "Choose Brush Color", currentColor);
            if (chosen != null) {
                currentColor = chosen;
            }
        });

        // Toolbar panel
        JPanel toolbar = new JPanel();
        toolbar.add(colorButton);

        // Add panels to frame
        add(toolbar, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}
