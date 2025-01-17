package task;

import task.Task;

/**
 * to do class
 * -> returns to do's messages
 */
public class ToDo extends Task {

      public ToDo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString() ;
    }

    @Override
    public String toSave() {
        return "T " + super.toSave() ;
    }
}
