package com.geek.principle.solid.ocp.handler;

import com.geek.principle.solid.ocp.constant.NotificationEmergencyLevel;
import com.geek.principle.solid.ocp.model.AlertRule;
import com.geek.principle.solid.ocp.model.ApiStatInfo;
import com.geek.principle.solid.ocp.model.Notification;

public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getRequestCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
