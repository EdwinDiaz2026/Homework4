package Composition;

import java.util.ArrayList;

public class Folder {
    private String folderName;
    private final ArrayList<Folder> subfolders = new ArrayList<>();
    private final ArrayList<File> files = new ArrayList<>();
    private static int depth = 0;

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return this.folderName;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void deleteFile(File file) {
        files.remove(file);
    }

    public void addFolder(Folder subfolder) {
        subfolders.add(subfolder);
    }

    public void deleteFolder(Folder folder) {
        folder.subfolders.clear();
        folder.files.clear();
        subfolders.remove(folder);
    }

    public void printFolder() {

        if (depth == 0) {
            System.out.println(getFolderName() + "/");
        }

        if (!subfolders.isEmpty()) {
            for (Folder folders: subfolders) {

                depth++;

                for (int i = 0; i < depth; i++) {
                    System.out.print("\t");
                }

                System.out.println("|-" + folders.getFolderName() + "/");

                folders.printFolder();

                depth--;
            }
            for (File file : files) {

                for (int i = 0; i < depth; i++) {
                    System.out.print("\t");
                }

                System.out.println("-" + file.getFileName());


            }
        }
    }
}
