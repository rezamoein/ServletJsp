package ir.beans;

import java.util.Date;
import java.util.List;

public abstract class Person {
    int personId;
    String firstName;
    String lastName;
    Date birthday;

    public abstract List getAll();
}
