package johnny.designpattern.composite;

public class File implements AbstractFile {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File:" + name);
    }
}
