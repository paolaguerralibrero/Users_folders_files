package com.example.Users_folders_files;

import com.example.Users_folders_files.models.Folder;
import com.example.Users_folders_files.models.User;
import com.example.Users_folders_files.repositories.FileRepository;
import com.example.Users_folders_files.repositories.FolderRepository;
import com.example.Users_folders_files.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersFoldersFilesApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;


	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileAndFolderThenSave(){
		User pepe = new User("Pepe");
		userRepository.save(pepe);
		Folder folder1 = new Folder("Documents", pepe);
		folderRepository.save(folder1);

	}

}
