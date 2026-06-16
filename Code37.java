///////////////////////////////////////////////////////////////////
//
//  File Name :         Code37.java
//  Description :       Prints a fixed 4x4 pattern of '*' characters
//                      without taking any input from the user.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Contains a method that displays a fixed
//                      pattern of '*' characters in multiple rows.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Prints a fixed 4x4 pattern of '*' characters
    //                    using multiple print statements.
    //                    No user input is required.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            
                        )
    {
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        
        System.out.println();

        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");

        System.out.println();

        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
        System.out.print("*");
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code37
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code37
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point function. Accepts frequency 
    //                    from user and calls Display function 
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();

        pobj.Display();
    }
}