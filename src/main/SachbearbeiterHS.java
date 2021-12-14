import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;

public class SachbearbeiterHS {



    public static JFrame frame;
    JMenuBar menubar;
    static JMenuItem login;
    static JMenuItem abbr;

    public static void main(String[] args) throws Exception {

        new SachbearbeiterHS().createFrame();
        new SachbearbeiterHS().createMenu();


        }


    public void createMenu(){
        menubar = new JMenuBar();
        frame.setJMenuBar(menubar);

        JMenu menu = new JMenu("Menü");
        menubar.add(menu);
        login = new JMenuItem(logIn);
        menu.add(login);

        JMenu sonstige = new JMenu("Sonstige");
        menubar.add(sonstige);
        abbr =  new JMenuItem(exitAction);
        sonstige.add(abbr);

        KeyStroke ctrlL = KeyStroke.getKeyStroke(KeyEvent.VK_L, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        login.setAccelerator(ctrlL);
        login.requestFocus();
        KeyStroke ctrlB = KeyStroke.getKeyStroke(KeyEvent.VK_B, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask());
        abbr.setAccelerator(ctrlB);

    }

    public void createFrame(){
        frame = new JFrame("Sacharbeiterverwaltung");

        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JToolBar tbar = new JToolBar();
        tbar.setSize(230, 20);

        tbar.add(new JButton("Login"));
        tbar.add(new JButton("Beenden"));
        tbar.setVisible(true);
    }

    Action exitAction = new AbstractAction( "Beenden" ) {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
    Action logIn = new AbstractAction("Login") {
        @Override
        public void actionPerformed(ActionEvent e) {

            JPanel newPanel = new Login().LoginÖffnen();
            frame.add(newPanel);
            SwingUtilities.updateComponentTreeUI(frame);
        }
    };

    Action logout = new AbstractAction("Logout") {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(new JFrame(),"Logged Out");
            new Login().LoginÖffnen();
        }
    };


    public void disposeFrame(){
        frame.dispose();
    }

    public void loginScreen(){
        JPanel newPanel = new Login().LoginÖffnen();
        frame.add(newPanel);
        SwingUtilities.updateComponentTreeUI(frame);
    }

    public void frameMin(){
        frame.setLocation(150,250);
        frame.setSize(new Dimension(1100,300));
        SwingUtilities.updateComponentTreeUI(frame);

    }
    public void frameMax(){
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        SwingUtilities.updateComponentTreeUI(frame);
    }
}






