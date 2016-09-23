package main;

import models.*;
import views.*;
import controllers.*;


public class Main {

    public static void main(String[] args) {
       
        Object modules[] = new Object[2];
        
        ModelAbout modelAbout = new ModelAbout();
        ViewAbout viewAbout = new ViewAbout();
        ControllerAbout controllerAbout = new ControllerAbout(modelAbout, viewAbout);
        
        ModelMessage modelMessage = new ModelMessage();
        ViewMessage viewMessage = new ViewMessage();
        ControllerMessage controllerMessage = new ControllerMessage(modelMessage, viewMessage);
        
        modules[0] = controllerAbout;
        modules[1] = controllerMessage;
       
        ModelMain modelMain = new ModelMain();
        ViewMain viewMain = new ViewMain();
        ControllerMain controllerMain = new ControllerMain(modelMain, viewMain, modules);
    }
}