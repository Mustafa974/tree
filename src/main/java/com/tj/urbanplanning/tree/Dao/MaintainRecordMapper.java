package com.tj.urbanplanning.tree.Dao;

import com.tj.urbanplanning.tree.Entity.MaintainRecord;
import java.util.List;

public interface MaintainRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MaintainRecord record);

    MaintainRecord selectByPrimaryKey(Integer id);

    List<MaintainRecord> selectAll();

    int updateByPrimaryKey(MaintainRecord record);
}