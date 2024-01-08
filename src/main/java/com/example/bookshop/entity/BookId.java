package com.example.bookshop.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Getter
@Setter
public class BookId implements Serializable {
    private int id;
    private String isbn;

}

