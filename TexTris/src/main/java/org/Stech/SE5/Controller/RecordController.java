package org.Stech.SE5.Controller;

import org.Stech.SE5.Data.Record;
import org.Stech.SE5.Model.RecordModel;
import org.Stech.SE5.View.RecordView;

import java.util.ArrayList;

public class RecordController {
    private RecordView recordView;
    private final int VIEW_WIDTH = 400;
    private final int VIEW_HEIGHT = 600;

    public RecordController() {
        initController();
    }

    public void initController() {
        recordView = new RecordView(this);
    }

    public void setVisible(boolean visible) {
        if (visible) {
            recordView.setSize(VIEW_WIDTH, VIEW_HEIGHT);
            recordView.setLocationRelativeTo(null);
            recordView.setVisible(true);
        } else {
            recordView.setVisible(false);
        }
    }

    public ArrayList<Record> getRecords() {
        return RecordModel.rankedRecords;
    }
}
