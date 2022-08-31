package UserPanel;

import Coffee.SampleCoffeeArray;
import controller.PressCoffeeBtn;
import imagefile.Path;

import javax.swing.*;
import java.awt.*;

public class UserPanelLeft extends JPanel {

    public static JButton[] coffeeLCDbtn = new JButton[2];
    public static JPanel getCoffeePanel = new JPanel();
    public static JButton returnPort = new JButton("");
    JButton msg;

    public UserPanelLeft() {  //좌측 유저패널

        setPreferredSize(new Dimension(340, 550));
        setBackground(new Color(70, 160, 200));

        //간판
        JPanel welcomeMsg = new JPanel();
        msg = new JButton("COFFEE VENDING MACHINE");
        msg.setBorder(BorderFactory.createEmptyBorder());
        welcomeMsg.add(msg);


        //커피 선택 버튼
        JPanel selectCoffee = new JPanel(new GridLayout(2, 1));
        selectCoffee.setPreferredSize(new Dimension(150, 330));

        for (int i = 0; i < SampleCoffeeArray.sampleCoffee.size(); i++) {
            JPanel coffeeEach = new JPanel();
            JLabel priceLabel = new JLabel(SampleCoffeeArray.sampleCoffee.get(i).getPrice() + "원");
            JLabel coffeeLabel = new JLabel(SampleCoffeeArray.sampleCoffee.get(i).getTypeOfCoffee() + " Coffee");
            coffeeLCDbtn[i] = new JButton("");
            coffeeLCDbtn[i].setPreferredSize(new Dimension(100, 15));

            coffeeLCDbtn[i].setBackground( Color.BLACK);
            coffeeLCDbtn[i].setForeground(Color.red);
            coffeeLCDbtn[i].setBorder(BorderFactory.createEmptyBorder());
            coffeeLCDbtn[i].setOpaque(true);

            coffeeEach.add(new JLabel((new ImageIcon(Path.PATH + SampleCoffeeArray.sampleCoffee.get(i).getTypeOfCoffee() + ".png"))));
            coffeeEach.add(coffeeLabel);
            coffeeEach.add(priceLabel);
            coffeeEach.add(coffeeLCDbtn[i]);
            selectCoffee.add(coffeeEach);

            coffeeLCDbtn[i].addActionListener(new PressCoffeeBtn(SampleCoffeeArray.sampleCoffee.get(i).getTypeOfCoffee()));

        }

        //커피 반환구
        returnPort.setIcon(new ImageIcon(Path.PATH + "coffeereturn.png"));
        returnPort.setBorder(BorderFactory.createEmptyBorder());
        returnPort.setContentAreaFilled(false);
        getCoffeePanel.add(returnPort);


        add(welcomeMsg, BorderLayout.NORTH);
        add(selectCoffee, BorderLayout.CENTER);
        add(getCoffeePanel, BorderLayout.SOUTH);
        welcomeMsg.setBackground(new Color(70, 160, 200));
        getCoffeePanel.setBackground(new Color(70, 160, 200));
    }
}



