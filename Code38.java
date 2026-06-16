///////////////////////////////////////////////////////////////////
//
//  File Name :         Code38.java
//  Description :       Program to display a 3x3 pattern of asterisks (*)
//                      using nested loops.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Prints a 3x3 grid of "*" characters separated
//                      by tabs.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Prints a 3x3 grid of "*" characters separated
    //                    by tabs.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            
                        )
    {
        int j = 0;

        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }

        System.err.println();
        
        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        
        System.err.println();
        
        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }

        System.err.println();
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code38
//  Description :       Driver class that creates an object of Pattern class
//                      and calls Display() method to print star pattern.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code38
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