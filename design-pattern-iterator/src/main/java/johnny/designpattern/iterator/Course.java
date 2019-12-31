package johnny.designpattern.iterator;

public class Course {
    private String title;
    private int credit;

    public Course(String title, int credit) {
        this.title = title;
        this.credit = credit;
    }

    public String getTitle() {
        return this.title;
    }

    public int getCredit() {
        return this.credit;
    }

    @Override
    public String toString() {
        return "Course {" +
                "title='" + title + '\'' +
                ", credit=" + credit +
                '}';
    }
}
