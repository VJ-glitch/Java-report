package CIE;

public class Internals {
    public int[] internalMarks;

    public Internals(int[] marks) {
        if (marks.length == 5) {
            this.internalMarks = marks;
        } else {
            throw new IllegalArgumentException("Marks array must have exactly 5 elements.");
        }
    }
}