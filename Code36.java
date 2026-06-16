// Input : 4    
// Output : 4   4   4   4

///////////////////////////////////////////////////////////////////
//
//  File Name :         Code36.java
//  Description :       Accepts a number from the user and prints the
//                      same number repeatedly in a single line.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Contains a method to display the entered number
//                      repeatedly based on the given frequency.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Accepts an integer and prints the same number
    //                   'iNo' times in a single line separated by tabs.
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

        for(iCnt = 1; iCnt <= iNo; iCnt++)    
        {
            System.out.print(iNo+"\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code36
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code36
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
        char ch = '\0';

        System.out.println("Enter frequency : ");
        iValue1 = sobj.nextInt();


        Pattern pobj = new Pattern();

        pobj.Display(iValue1);
    }
}