package com.tj.urbanplanning.tree.Dao;

import com.tj.urbanplanning.tree.Entity.TreeRecord;
import java.util.List;

public interface TreeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TreeRecord record);

    TreeRecord selectByPrimaryKey(Integer id);

    List<TreeRecord> selectAll();

    int updateByPrimaryKey(TreeRecord record);
}