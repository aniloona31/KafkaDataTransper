package com.realworlddatatransfer.dataconsumer.Service;

import com.realworlddatatransfer.dataconsumer.Entity.wikimedia;
import com.realworlddatatransfer.dataconsumer.Repository.wikimediaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class wikimediaService {

    @Autowired
    private wikimediaRepo wikimediaRepo;

    public void addData(String data){
        wikimedia wiki = wikimedia.builder()
                .wikimediaData(data)
                .build() ;
        wikimediaRepo.save(wiki);
    }

}
