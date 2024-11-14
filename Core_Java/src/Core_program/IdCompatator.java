package Core_program;

import java.util.Comparator;

public class IdCompatator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getId().equals(s2.getId())) {
            return 0;
        } else if (s1.getId() > s2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
