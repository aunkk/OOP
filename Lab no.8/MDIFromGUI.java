
import java.awt.*;
import javax.swing.*;

public class MDIFromGUI{
    private JFrame jFrame;
    private JDesktopPane j_desktop;
    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3, mi1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    private JInternalFrame app1, app2, app3;
    
    public MDIFromGUI(){
        jFrame = new JFrame("SubMenuItem Demo");
        j_desktop = new JDesktopPane();
        menubar = new JMenuBar();
        j_desktop.add(menubar);
        menu1 = new JMenu("File");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View");
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        
        jFrame.setJMenuBar(menubar);
        jFrame.setLayout(new BorderLayout());
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menu1.add(mi1);
        menu1.add(mi2);
        menu1.add(mi3);
        menu1.add("Exit");
        mi1.add(msi1);
        mi1.add(msi2);
        
        app1 = new JInternalFrame("Application 01", true, true, true, true);
        app2 = new JInternalFrame("Application 02", true, true, true, true);
        app3 = new JInternalFrame("Application 03", true, true, true, true);
        
        app1.getContentPane();
        app1.setSize(new Dimension(200, 100));
        app1.setLocation(jFrame.getX()+ 50, jFrame.getY()+ 250);
        app1.setVisible(true);
        
        app2.getContentPane();
        app2.setSize(new Dimension(200, 150));
        app2.setLocation(app1.getX() + 150, app1.getY() - 200);
        app2.setVisible(true);
        
        app3.getContentPane();
        app3.setSize(new Dimension(300, 220));
        app3.setLocation(app1.getX() + 400, app1.getY() - 50);
        app3.setVisible(true);

        j_desktop.add(app1); j_desktop.add(app2); j_desktop.add(app3);
        
        jFrame.add(j_desktop, BorderLayout.CENTER);
                
        jFrame.pack();
        jFrame.setMinimumSize(new Dimension(800, 500));
//        jFrame.setExtendedState(jFrame.MAXIMIZED_BOTH);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {
            new MDIFromGUI();
        });
        
    }
}
