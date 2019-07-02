package com.tj.urbanplanning.tree.Service;

import com.tj.urbanplanning.tree.Dao.DangerRankMapper;
import com.tj.urbanplanning.tree.Dao.MaintainRecordMapper;
import com.tj.urbanplanning.tree.Dao.TreeRecordMapper;
import com.tj.urbanplanning.tree.Entity.DangerRank;
import com.tj.urbanplanning.tree.Entity.MaintainRecord;
import com.tj.urbanplanning.tree.Entity.TreeRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component
@Service
public class TreeService {

    @Autowired
    private TreeRecordMapper treeRecordMapper;
    @Autowired
    private MaintainRecordMapper maintainRecordMapper;
    @Autowired
    private DangerRankMapper dangerRankMapper;

    public Boolean saveTreeRecord(TreeRecord treeRecord){
        if (this.treeRecordMapper.insert(treeRecord)==1){
            return true;
        }
        return false;
    }

    public TreeRecord getTreeRecord(int id){
        TreeRecord treeRecord = treeRecordMapper.selectByPrimaryKey(id);
        return treeRecord;
    }

    public Boolean saveMaintainRecord(MaintainRecord treeRecord){
        if (this.maintainRecordMapper.insert(treeRecord)==1){
            return true;
        }
        return false;
    }

    public MaintainRecord getMaintainRecord(int id){
        MaintainRecord treeRecord = maintainRecordMapper.selectByPrimaryKey(id);
        return treeRecord;
    }

    public Boolean saveDangerRecord(DangerRank treeRecord){
        if (this.dangerRankMapper.insert(treeRecord)==1){
            return true;
        }
        return false;
    }

    public DangerRank getDangerRecord(int id){
        DangerRank treeRecord = dangerRankMapper.selectByPrimaryKey(id);
        return treeRecord;
    }

}
