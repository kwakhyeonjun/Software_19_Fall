package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSpace {
    private JButton 택배받기Button;
    private JButton 택배보내기Button;
    private JButton 관리자모드Button;

    public FirstSpace() {
        관리자모드Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
}
