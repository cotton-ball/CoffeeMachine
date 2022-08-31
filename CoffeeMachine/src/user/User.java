package user;

import imagefile.Path;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static UserPanel.UserPanelLeft.getCoffeePanel;
import static UserPanel.UserPanelLeft.returnPort;
import static UserPanel.UserPanelRight.stateLCD;

public class User implements ActionListener{


    @Override
    public void actionPerformed(ActionEvent e) {
        returnPort.setIcon(new ImageIcon(Path.PATH + "coffeereturn.png"));
        stateLCD.setText("맛있게 드세요 ^^");

        getCoffeePanel.add(returnPort);

    }
}
