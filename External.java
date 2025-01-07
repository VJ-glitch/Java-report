package SEE;

import CIE.Personal;
import CIE.Internals;

public class External extends Personal 
{
    public Internals internalMarks;
    public int[] externalMarks;

    public External(String usn, String name, int sem, int[] internalMarks, int[] externalMarks) 
    {
        super(usn, name, sem);
        this.internalMarks = new Internals(internalMarks);
        if (externalMarks.length == 5) 
        {
            this.externalMarks = externalMarks;
        } 
        else 
        {
            throw new IllegalArgumentException("Marks array must have exactly 5 elements.");
        }
    }

    public int[] calculateFinalMarks() 
    {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            finalMarks[i] = this.internalMarks.internalMarks[i] + this.externalMarks[i];
        }
        return finalMarks;
    }
}
