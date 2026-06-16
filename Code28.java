///////////////////////////////////////////////////////////////////
//
//  File Name :         Code28.java
//  Description :       Program to accept a number from user (frequency) 
//                      and print numbers from that number down to 1.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input : 4
// Output : 4   3   2   1

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
        int i = iNo;
        if(iNo < 0)
        {
            iNo = -iNo;
        } 

        for(i = iNo; i >= 1; i--)
        {
            System.out.print(i+"\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code28
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code28
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