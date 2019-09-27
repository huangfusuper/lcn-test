package com.server2.mapper;


import com.pojo.ServerOne;
import com.pojo.ServerTwo;
import org.apache.ibatis.annotations.Insert;

/**
 * @author huangfu
 */
public interface ServerTwoMapper {
    /**
     * 插入数据
     * @param serverTwo
     */
    @Insert("insert into server2 values(#{id},#{name})")
    void insertData(ServerTwo serverTwo);
}
