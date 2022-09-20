package com.forum.admin.mapper;

import com.forum.admin.entity.PostInfo;
import com.forum.admin.entity.ReplyPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    //获取帖子详情
    List<PostInfo> getAllPost(@Param(value="uid")Integer uid);
    //获取回帖详情
    List<ReplyPost> findReplyPost(@Param(value="pid")String pid);

    //修改帖子状态
    Integer upPostState(String pid ,String pstate);

    //修改回帖状态
    Integer upReplyPost(String rid,String rstate);

    //修改帖子内容
    Integer upPost(String pid,String pname,String pcontent);
}
