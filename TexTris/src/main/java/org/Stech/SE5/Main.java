package org.Stech.SE5;

import org.Stech.SE5.Controller.RecordController;
import org.Stech.SE5.Model.RecordModel;
import org.Stech.SE5.View.GameEndView;

public class Main {
    public static void main(String[] args) {
        //RecordModel.clearRecord();

        GameEndView gameEnd = new GameEndView(100, 0,0);
        gameEnd.setVisible(true);

        //record.setVisible(true);


    }
}