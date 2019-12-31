package johnny.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseCollectionImpl implements CourseCollection {

    private List<Course> courses;

    public CourseCollectionImpl() {
        courses = new ArrayList<>();
    }

    public void add(Course c) {
        this.courses.add(c);
    }

    public void remove(Course c) {
        this.courses.remove(c);
    }

    @Override
    public CourseIterator iterator() {
        return new CourseIteratorImpl(this.courses);
    }
}
