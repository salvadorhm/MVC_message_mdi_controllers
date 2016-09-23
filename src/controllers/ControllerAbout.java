package controllers;

import models.ModelAbout;
import models.ModelMessage;
import views.ViewAbout;

public class ControllerAbout {
    
    ModelAbout modelAbout;
    ViewAbout viewAbout;
    
    ModelMessage modelMessage;
    
    public ControllerAbout(ModelAbout modelAbout, ViewAbout viewAbout){
        this.modelAbout = modelAbout;
        this.viewAbout = viewAbout;
    }
    
    public void setName(){
        viewAbout.jlAbout.setText(modelMessage.getName());
    }
}