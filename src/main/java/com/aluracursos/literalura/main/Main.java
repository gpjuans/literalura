package com.aluracursos.literalura.main;

import com.aluracursos.literalura.models.BookData;
import com.aluracursos.literalura.repository.BookRepository;

public class Main {
    private BookRepository bookRepository;


    public Main (BookRepository bookRepository){
       this.bookRepository = bookRepository;
    }
}
