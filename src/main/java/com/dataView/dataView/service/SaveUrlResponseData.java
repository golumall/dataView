package com.dataView.dataView.service;

import com.dataView.dataView.model.TextUrlData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Blob;

@Repository
public interface SaveUrlResponseData extends JpaRepository<TextUrlData,Integer> {

    @Modifying
    @Query(value="insert into url_data  (url,response_data) VALUES (:url,:response_data)",nativeQuery = true)
    @Transactional
    void saveUrlResponse(@Param("url") String url, @Param("response_data") Blob response_data);
}
