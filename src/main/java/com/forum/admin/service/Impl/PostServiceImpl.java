package com.forum.admin.service.Impl;

import com.forum.admin.entity.PostInfo;
import com.forum.admin.entity.ReplyPost;
import com.forum.admin.mapper.PostMapper;
import com.forum.admin.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("postServiceImpl")
public class PostServiceImpl  implements PostService {
    @Autowired
    private PostMapper mapper;
    @Override
    public List<PostInfo> getAllPost(Integer uid) {
        return mapper.getAllPost(uid);
    }

    @Override
    public List<ReplyPost> findReplyPost(String pid) {
        return mapper.findReplyPost(pid);
    }

    @Override
    public Integer upPostState(String pid, String pstate) {
        return mapper.upPostState(pid, pstate);
    }

    @Override
    public Integer upReplyPost(String rid, String rstate) {
        return mapper.upReplyPost(rid, rstate);
    }

    @Override
    public Integer upPost(String pid, String pname, String pcontent) {
        return mapper.upPost(pid, pname, pcontent);
    }
}
