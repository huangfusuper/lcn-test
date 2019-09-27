package com.pojo;

import lombok.Data;

/**
 * @author huangfu
 */
@Data
public class ServerTwo {
    private String id;
    private String name;

    public ServerTwo() {
    }

    public ServerTwo(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
