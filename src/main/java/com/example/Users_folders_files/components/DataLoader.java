package com.example.Users_folders_files.components;

import com.example.Users_folders_files.models.File;
import com.example.Users_folders_files.models.Folder;
import com.example.Users_folders_files.models.User;
import com.example.Users_folders_files.repositories.FileRepository;
import com.example.Users_folders_files.repositories.FolderRepository;
import com.example.Users_folders_files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User mary = new User("Mary");
        userRepository.save(mary);


        User john = new User("john");
        userRepository.save(john);

        Folder folder1 = new Folder("Photos", mary);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("CV", john);
        folderRepository.save(folder2);

        File file1 = new File("file_1", ".jpeg", 120, folder2);
        fileRepository.save(file1);

    }
}