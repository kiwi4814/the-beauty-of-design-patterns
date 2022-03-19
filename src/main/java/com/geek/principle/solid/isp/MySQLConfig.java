package com.geek.principle.solid.isp;


public class MySQLConfig implements Updater {
    private ConfigSource configSource; //配置中心（比如zookeeper）

    public MySQLConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public void update() {
        //从configSource加载配置到address/timeout/maxTotal...
    }
}
