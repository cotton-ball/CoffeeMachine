package UserPanel;

import Coffee.Coffee;
import Coffee.SampleCoffeeArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class UserPanelFrame extends JFrame {
    public UserPanelFrame(){

        SampleCoffeeArray.sampleCoffee.add(new Coffee(1,1,1,1,300,"nomal"));
        SampleCoffeeArray.sampleCoffee.add(new Coffee(0,0,2,1,400,"black"));

        setTitle("Vending Machine");
        setPreferredSize(new Dimension(650,550));
        setLocationRelativeTo(null); //창이 가운데에 위치하도록 한다
       setDefaultCloseOperation(EXIT_ON_CLOSE); //창을 닫으면 프로그램 종료
        setLocation(400,150);
        WindowListener win = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        };
        addWindowListener(win);

        Container contentPanel = getContentPane();

        JPanel userPanelRight = new UserPanelRight();
        JPanel userPanelLeft = new UserPanelLeft();

        contentPanel.add(userPanelRight,BorderLayout.CENTER);
        contentPanel.add(userPanelLeft,BorderLayout.WEST);


        pack();
        setVisible(true);

    }
}
