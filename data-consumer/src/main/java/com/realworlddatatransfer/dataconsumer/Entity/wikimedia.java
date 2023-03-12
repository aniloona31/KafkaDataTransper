package com.realworlddatatransfer.dataconsumer.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "wikimediaTable")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class wikimedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Lob
    private String wikimediaData;
}
