package com.tj.urbanplanning.tree.Dao;

import com.tj.urbanplanning.tree.Entity.DangerRank;
import java.util.List;

public interface DangerRankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DangerRank record);

    DangerRank selectByPrimaryKey(Integer id);

    List<DangerRank> selectAll();

    int updateByPrimaryKey(DangerRank record);
}