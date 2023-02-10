package com.brasajava.webapp.domain;

import java.util.List;

public interface Likeable {
    List<Like> getLikeList();
    void setLikeList(List<Like> likeList);
    
}
