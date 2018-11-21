package johnny.designpattern.iterator;

public interface CourseCollection {
    public void add(Course c);

    public void remove(Course c);

    public CourseIterator iterator();
}
