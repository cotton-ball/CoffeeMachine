package manufacturer;

import Ingredient.IngredientManager;
import imagefile.Path;
import user.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static UserPanel.UserPanelLeft.returnPort;
import static UserPanel.UserPanelRight.stateLCD;

public class MakeNomalCoffee extends IngredientManager implements ActionListener {
    public MakeNomalCoffee() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sendIngredientForNomalCoffee();
        returnPort.setIcon(new ImageIcon(Path.PATH + "nomalcoffeearrange.png"));

        stateLCD.setText("커피가 완성 되었습니다! ");

        returnPort.addActionListener(new User());





    }

}
