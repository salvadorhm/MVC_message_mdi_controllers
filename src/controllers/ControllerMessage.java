package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelMessage;
import views.ViewMessage;


public class ControllerMessage {
    
    ModelMessage modelMessage;
    ViewMessage viewMessage;
    
    public ControllerMessage(ModelMessage modelMessage, ViewMessage viewMessage){
        this.modelMessage = modelMessage;
        this.viewMessage = viewMessage;
        
        this.viewMessage.jbtnHello.addActionListener(actionListener);
    }
    
    private final ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewMessage.jbtnHello)
                jbtnHelloActionPerformed();
        }
    };
    
    private void jbtnHelloActionPerformed(){
        modelMessage.setName(viewMessage.jtfName.getText());
        JOptionPane.showMessageDialog(viewMessage, "Hola " + modelMessage.getName());
    }
}
