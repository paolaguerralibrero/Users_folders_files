package com.example.Users_folders_files.controllers;


import com.example.Users_folders_files.models.File;
import com.example.Users_folders_files.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }




}
