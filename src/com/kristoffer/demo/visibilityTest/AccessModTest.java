package com.kristoffer.demo.visibilityTest;

public class AccessModTest {

    // Variables
    public int agePublic = 15;
    protected String nameProtected = "Benny";
    boolean isTiredNoModifier = true;
    private char gradePrivate = 'A';

    // Methods
    public void testPublic() {
        testPrivate();  // Is accessible from same class ONLY
    }
    protected void testProtected() {}
    void testNoModifier() {}
    private void testPrivate() {}

}
