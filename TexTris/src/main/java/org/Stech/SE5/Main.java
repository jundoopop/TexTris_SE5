package org.Stech.SE5;

import org.Stech.SE5.Controller.RecordController;
import org.Stech.SE5.Model.RecordModel;

public class Main {
    public static void main(String[] args) {
        //RecordModel.clearRecord();
        RecordModel.loadRecord();
        RecordController record = new RecordController();
        RecordModel.addRecord(10,10, "240409","KST");
        RecordModel.addRecord(20,20,"240419","name");

        record.setVisible(true);
    }
}