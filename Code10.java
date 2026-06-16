////////////////////////////////////////////////////////////////////
//
//  File Name :         Code10.java
//  Description :       This program finds and displays all factors 
//                      of a given number entered by the user.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       Contains methods to perform operations 
//                      related to numbers, like displaying factors.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     DisplayFactors
    //  Description :     Displays all factors of the given number.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void DisplayFactors(
                                    int iNo
                                )
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Code10
//  Description :       Main class to take input from the user and
//                      invoke methods of Number class.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code10
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point class. Accepts number from user,
    //                    displays the Factors of that number.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        nobj.DisplayFactors(iValue);
    }
}