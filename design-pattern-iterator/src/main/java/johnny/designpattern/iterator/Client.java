package johnny.designpattern.iterator;

public class Client {
    public void run() {
        CourseCollection courses = new CourseCollectionImpl();
        courses.add(new Course("Algorithms and Structures", 5));
        courses.add(new Course("Database Technologies", 4));
        courses.add(new Course("Mobile App Development", 3));
        courses.add(new Course("Mining Big Data", 5));
        CourseIterator iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course c = iterator.next();
            System.out.println(c.toString());
        }
    }
}
