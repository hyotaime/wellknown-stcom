package com.hirame59.wellknownstcom.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rowid;
    private String title;
    private String cid;
    private String name;
    private String author;
    private String etc;
    private String linkinfo;
    private String link;
}
