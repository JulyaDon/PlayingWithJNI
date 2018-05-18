package main.java;

/**
 * Created by July on 15.05.2018.
 */
public class MyLib {
    static {
        try{
            /* MyJNI.dll (Windows) or libMyJNI.so (Linux) */
            System.loadLibrary("Test_Of_DLL");
        } catch(java.lang.UnsatisfiedLinkError err){
            /* Error output when native binary not present */
            System.out.println("Unable to load MyJNI library");
            System.exit(0);
        }
    }

    public native String mainFunc (int n);
}
