package salary.service;

import java.util.List;

public interface Salary {
    // Another team is implementing this; they are not done yet.
    // we do not know (or have) the implementation, but we know the interface (API).
    List<Integer> returnSalaries();// returns a list of all salaries in the company
}
