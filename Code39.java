///////////////////////////////////////////////////////////////////
//
//  File Name :         Code39.java
//  Description :       Prints a 3x3 grid of asterisks (*) using nested
//                      for-loops, where each row and column is separated
//                      by tabs for proper alignment.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Uses nested loops to print a 3x3 pattern of
//                      asterisks (*). Outer loop controls rows and
//                      inner loop controls columns
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Uses nested loops to print a 3x3 pattern of
    //                    asterisks (*). Outer loop controls rows and
    //                    inner loop controls columns
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            
                        )
    {
        int i = 0, j = 0;

        for(i = 1; i<= 3; i++)
        {
            for(j = 1; j <= 3; j++)
            {
                System.out.print("*\t");
            }
        System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code39
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code39
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