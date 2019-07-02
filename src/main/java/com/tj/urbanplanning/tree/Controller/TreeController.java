package com.tj.urbanplanning.tree.Controller;

import com.tj.urbanplanning.tree.Entity.DangerRank;
import com.tj.urbanplanning.tree.Entity.MaintainRecord;
import com.tj.urbanplanning.tree.Entity.TreeRecord;
import com.tj.urbanplanning.tree.Service.TreeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(tags = "treeRecordApi")
@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping(value = "/saveTreeRecord", method = RequestMethod.POST)
    @ApiOperation(value = "存储树籍信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> saveTree(@RequestBody TreeRecord treeRecord){
        try {
            if(treeService.saveTreeRecord(treeRecord)){
                System.out.println("存储树籍信息成功~");
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("存储树籍信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/getTreeRecord", method = RequestMethod.POST)
    @ApiOperation(value = "获取树籍信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> getTree(@RequestBody int id){
        try {
            TreeRecord treeRecord = treeService.getTreeRecord(id);
            if(treeRecord!=null){
                System.out.println("获取树籍信息成功~");
                return new ResponseEntity<>(treeRecord, HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("获取树籍信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/saveMaintainRecord", method = RequestMethod.POST)
    @ApiOperation(value = "存储树籍维护信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> saveMaintain(@RequestBody MaintainRecord treeRecord){
        try {
            if(treeService.saveMaintainRecord(treeRecord)){
                System.out.println("存储树籍维护信息成功~");
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("存储树籍维护信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/getMaintainRecord", method = RequestMethod.POST)
    @ApiOperation(value = "存储树籍维护信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> getMaintain(@RequestBody int id){
        try {
            MaintainRecord treeRecord = treeService.getMaintainRecord(id);
            if(treeRecord!=null){
                System.out.println("获取树籍维护信息成功~");
                return new ResponseEntity<>(treeRecord, HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("获取树籍维护信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/saveDangerRecord", method = RequestMethod.POST)
    @ApiOperation(value = "存储树籍危险信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> saveDanger(@RequestBody DangerRank treeRecord){
        try {
            if(treeService.saveDangerRecord(treeRecord)){
                System.out.println("存储树籍危险信息成功~");
                return new ResponseEntity<>(HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("存储树籍危险信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/getDangerRecord", method = RequestMethod.POST)
    @ApiOperation(value = "获取树籍危险信息")
    @ResponseBody
    @CrossOrigin
    public ResponseEntity<?> getDanger(@RequestBody int id){
        try {
            DangerRank treeRecord = treeService.getDangerRecord(id);
            if(treeRecord!=null){
                System.out.println("获取树籍危险信息成功~");
                return new ResponseEntity<>(treeRecord, HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println("获取树籍危险信息失败！");
            System.out.println(e.getMessage());
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
