///////////////////////////////////////////////////////////////////
//
//  File Name :         Code25.java
//  Description :       Accept a frequency from the user and display
//                      '*' symbol that many times.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input : 4
// Output : *   *   *   *

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Contains a method to display '*' symbol
//                      according to the given frequency.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Prints '*' symbol the specified number
    //                    of times. If the input is negative,
    //                    input validation filter will apply.  
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iFeq 
                        )
    {
        int i = 0;
        if(iFeq < 0)
        {
            iFeq = -iFeq;
        } 

        for(i = 1; i <= iFeq; i++)
        {
            System.out.print("*\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code25
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code25
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accepts the frequency from the user,
//                        creates an object of Pattern class,
//                        and calls the Display() method.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter frequency : ");
        iValue1 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1);
    }
}