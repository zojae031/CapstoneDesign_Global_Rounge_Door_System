package control.action_handel;
import view.LogPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogBtnListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e){
        LogPanel.getInstance().showLogTable((JButton) e.getSource());
    }
}