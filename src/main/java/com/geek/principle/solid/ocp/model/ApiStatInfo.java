package com.geek.principle.solid.ocp.model;

import lombok.Data;

@Data
public class ApiStatInfo {
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;
}
