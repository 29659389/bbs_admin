package com.forum.admin.service;

import com.forum.admin.entity.PostInfo;
import com.forum.admin.entity.ReplyPost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List<PostInfo> getAllPost(Integer uid);
    List<ReplyPost> findReplyPost(String pid);
    //修改帖子状态
    Integer upPostState(String pid ,String pstate);
    //修改回帖状态
    Integer upReplyPost(String rid,String rstate);
    //修改帖子内容
    Integer upPost(String pid,String pname,String pcontent);
}
