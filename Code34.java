// Input : 4
// Output : -4  -3  -2  -1  0   1   2   3   4

///////////////////////////////////////////////////////////////////
//
//  File Name :         Code34.java
//  Description :       Accepts a number from the user and displays the number line
//                      from -N to N.With Time Complexity O(2N)
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Accepts a number from the user and displays the number line
//                      from -N to N.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Prints numbers line from -N up to N.
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

        for(iCnt = -iNo; iCnt <= iNo; iCnt++)    // 2N
        {
            System.out.print(iCnt+"\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code34
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code34
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