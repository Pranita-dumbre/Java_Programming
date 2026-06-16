// Input : 4
// Output : 
/*          4
            3
            2
            1
            0
*/

///////////////////////////////////////////////////////////////////
//
//  File Name :         Code30.java
//  Description :       Program to accept a number from user (frequency) 
//                      and print numbers from that number down to 0.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Accepts an integer and prints numbers in reversed order
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Accepts an integer and prints numbers in reversed order
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iNo 
                        )
    {
        int iCnt = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        } 
        System.out.println("Output :");
        for(iCnt = iNo; iCnt >= 0; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code30
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code30
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
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter frequency : ");
        iValue1 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1);
    }
}