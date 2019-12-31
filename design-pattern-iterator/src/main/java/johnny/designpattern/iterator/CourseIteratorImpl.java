package johnny.designpattern.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {

    private List<Course> courses;
    private int index;

    public CourseIteratorImpl(List<Course> courseList) {
        this.courses = courseList;
    }

    @Override
    public boolean hasNext() {
        return index < courses.size();
    }

    @Override
    public Course next() {
        if (index < 0 || index >= courses.size()) {
            return null;
        } else {
            Course c = courses.get(index);
            index++;
            return c;
        }
    }
}