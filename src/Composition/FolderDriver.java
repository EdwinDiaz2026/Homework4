package Composition;

public class FolderDriver {
    public static void main(String[] args) {
        Folder php = new Folder("php_demo1");
        Folder sourceFolder = new Folder("Source Files");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder pub = new Folder("public");
        File htaccess = new File(".htaccess");
        File htrouter = new File(".htrouter.php");
        File index = new File("index.html");

        php.addFolder(sourceFolder);
        sourceFolder.addFolder(phalcon);
        sourceFolder.addFolder(app);
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);
        sourceFolder.addFolder(cache);
        sourceFolder.addFolder(pub);
        sourceFolder.addFile(htaccess);
        sourceFolder.addFile(htrouter);
        sourceFolder.addFile(index);
        php.addFolder(includePath);
        php.addFolder(remoteFiles);

        php.printFolder();


        sourceFolder.deleteFolder(app);

        php.printFolder();

        sourceFolder.deleteFolder(pub);

        php.printFolder();

    }
}
