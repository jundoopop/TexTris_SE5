package org.Stech.SE5;

import org.Stech.SE5.Controller.RecordController;
import org.Stech.SE5.Model.RecordModel;
import org.Stech.SE5.View.GameEndView;

public class Main {
    public static void main(String[] args) {
        //RecordModel.clearRecord();

        GameEndView gameEnd = new GameEndView();
        gameEnd.setVisible(true);


        //RecordModel.loadRecord();
        //RecordController record = new RecordController();
        //RecordModel.addRecord(10,10, "240409","KST");
        //RecordModel.addRecord(20,20,"240419","name");

        //record.setVisible(true);


    }
}