package com.order.mapper;


import com.pojo.ServerOne;
import org.apache.ibatis.annotations.Insert;

/**
 * @author huangfu
 */
public interface ServerOneMapper {
    /**
     * 插入数据
     * @param serverOne
     */
    @Insert("insert into server1 values(#{id},#{name})")
    void insertData(ServerOne serverOne);
}
