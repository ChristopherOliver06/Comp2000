package com.Controller;

import com.Model.Model;
import com.Model.Stock;
import com.View.frmKiosk;

import javax.swing.*;

public class Controller {

    private Model model;


    public Stock stockFetcher(int barcode) {
        return model.getStock(barcode);

    }
    public void assignController(frmKiosk kiosk){
        kiosk.setController(this);
    }
    public Controller(Model model) {
        this.model = model;

    }
}
