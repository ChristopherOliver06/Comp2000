package com.Controller;

import com.IGui;
import com.Model.Model;
import com.Model.Stock;
import com.View.frmKiosk;

import javax.swing.*;

public class Controller {

    private Model model;
    private IGui view;

    public Stock stockFetcher(int barcode) {
        return model.getStock(barcode);

    }
    public void assignController(frmKiosk kiosk){
        kiosk.setController(this);
    }
    public Controller(Model model, IGui view) {
        this.model = model;
        this.view = view;
    }
}
