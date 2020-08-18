package com.dataView.dataView.service;

import com.dataView.dataView.model.TextUrlData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FindUrlResponseData extends JpaRepository<TextUrlData,Integer> {
    @Query("select u from TextUrlData u where u.url=:url")
    TextUrlData findByUrl(String url);
}
