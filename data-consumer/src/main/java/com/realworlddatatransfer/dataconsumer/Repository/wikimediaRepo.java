package com.realworlddatatransfer.dataconsumer.Repository;

import com.realworlddatatransfer.dataconsumer.Entity.wikimedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface wikimediaRepo extends JpaRepository<wikimedia,Integer> {

}
