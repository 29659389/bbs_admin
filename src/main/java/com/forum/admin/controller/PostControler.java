package com.forum.admin.controller;

import com.forum.admin.entity.PostInfo;
import com.forum.admin.entity.ReplyPost;
import com.forum.admin.mapper.PostMapper;
import com.forum.admin.service.Impl.PostServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PostControler {
    @Autowired
    private PostServiceImpl service;

    @RequestMapping(path = "/getPost")
    @ResponseBody
    public Map getPost( Integer uid){
        System.out.println(uid);
        List<PostInfo> list=service.getAllPost(uid);
        //System.out.println(list);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",list.size());
        map.put("data",list.toArray());
        return map;
    }


    @RequestMapping(path = "/getReplyPost")
    @ResponseBody
    public Map getReplyPost(String pid){
        System.out.println(pid);
        List<ReplyPost> replyPosts=service.findReplyPost(pid);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",replyPosts.size());
        map.put("data",replyPosts.toArray());
        return map;
    }


    //修改帖子状态
    @RequestMapping(path = "/upPostState")
    @ResponseBody
    public Integer upPostState(String pid,String pstate){
        return service.upPostState(pid, pstate);
    }


    //修改回帖状态
    @RequestMapping(path = "/upReplyPost")
    @ResponseBody
    public Integer upReplyPost(String rid ,String rstate){
        return service.upReplyPost(rid, rstate);
    }


    @RequestMapping(path = "/upPost")
    @ResponseBody
    public Integer upPost(String pid,String pname,String pcontent){
        return service.upPost(pid, pname, pcontent);

    }
}
