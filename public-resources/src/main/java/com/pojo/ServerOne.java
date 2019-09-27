package com.pojo;

import lombok.Data;

/**
 * @author huangfu
 */
@Data
public class ServerOne {
    private String id;
    private String name;

    public ServerOne() {
    }

    public ServerOne(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
