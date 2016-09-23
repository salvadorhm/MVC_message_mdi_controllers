package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMain;
import views.ViewMain;

public class ControllerMain {
    ModelMain modelMain;
    ViewMain viewMain;
    
    Object modules[];
    
    ControllerAbout controllerAbout;
    ControllerMessage controllerMessage;
    
    
    public ControllerMain(ModelMain modelMain, ViewMain viewMain, Object modules[]) {
        this.modelMain = modelMain;
        this.viewMain = viewMain;
        this.modules = modules;
        
        this.viewMain.jmiAbout.addActionListener(actionListener);
        this.viewMain.jmiMessage.addActionListener(actionListener);
        
        controllerAbout = (ControllerAbout)modules[0];
        controllerMessage = (ControllerMessage)modules[1];
        
        initView();
    }
    
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == viewMain.jmiAbout)
                jmiAboutActionPerformed();
            else if(e.getSource() == viewMain.jmiMessage)
                jmiMessageActionPerformed();
        }
    };
    
    private void initView(){
        viewMain.setTitle("MDI Controllers  ");
        viewMain.setLocationRelativeTo(null);
        viewMain.setVisible(true);
    }
    
    private void jmiAboutActionPerformed(){
        viewMain.setContentPane(controllerAbout.viewAbout);//JPanel ViewAbout
        controllerAbout.viewAbout.jlAbout.setText(controllerMessage.modelMessage.getName());
        viewMain.revalidate();
        viewMain.repaint();
    }
    
    private void jmiMessageActionPerformed(){
        viewMain.setContentPane(controllerMessage.viewMessage);//JPanel ViewAbout
        viewMain.revalidate();
        viewMain.repaint();
    }
}
