package com.brasajava.webapp.domain;

import java.util.List;

public interface Commentable {
    List<Comment> getCommentList();
    void setCommentList(List<Comment> commentList);
    
}
