package com.geek.principle.solid.ocp;

import com.geek.principle.solid.ocp.handler.AlertHandler;
import com.geek.principle.solid.ocp.model.ApiStatInfo;

import java.util.ArrayList;
import java.util.List;

public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public Alert(List<AlertHandler> alertHandlers) {
        this.alertHandlers = alertHandlers;
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }
}
