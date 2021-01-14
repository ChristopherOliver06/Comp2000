package com;

import com.Controller.Controller;
import com.Model.Model;
import com.View.frmKiosk;

public class Main {

    public static void main(String[] args) {
        {
            frmKiosk kiosk = new frmKiosk();
            kiosk.setVisible(true);
            Model model = new Model();
            Controller controller = new Controller(model);
            controller.assignController(kiosk);
        }
    }

}
