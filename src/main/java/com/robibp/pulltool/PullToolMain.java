package com.robibp.pulltool;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.nio.file.*;

public class PullToolMain {

    public static void main(String[] args){

        String repoUrl = "https://github.com/fastfoodcoding/SpringBootMongoDbCRUD.git";
        String cloneDirectoryPath = "C:\\Users\\Roby\\Desktop\\test"; // Ex.in windows c:\\gitProjects\SpringBootMongoDbCRUD\
        try {
            System.out.println("Cloning "+repoUrl+" into "+repoUrl);
            Git.cloneRepository()
                    .setURI(repoUrl)
                    .setDirectory(Paths.get(cloneDirectoryPath).toFile())
                    .call();
            System.out.println("Completed Cloning");
        } catch (GitAPIException e) {
            System.out.println("Exception occurred while cloning repo");
            e.printStackTrace();
        }

    }
}
