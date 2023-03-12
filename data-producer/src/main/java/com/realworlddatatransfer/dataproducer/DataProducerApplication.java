package com.realworlddatatransfer.dataproducer;

import com.realworlddatatransfer.dataproducer.Producers.WikimediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DataProducerApplication.class, args);
	}

	@Autowired
	public WikimediaChangesProducer wikimediaChangesProducer;

	@Override
	public void run(String... args)throws Exception{
		wikimediaChangesProducer.sendMessage();
	}
}
