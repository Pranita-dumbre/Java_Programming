///////////////////////////////////////////////////////////////////
//
//  File Name :         Code11.java
//  Description :       This program calculates and displays the sum
//                      of all factors of a given number entered 
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       Contains methods to perform operations 
//                      related to numbers, like summation of factors.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     SumFactors
    //  Description :     Calculates and returns the sum of all factors of the given number.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int SumFactors(
                            int iNo
                        )
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Code11
//  Description :       Main class to take input from the user and
//                      call methods of Number class to calculate
//                      sum of factors.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code11
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point class. Accepts number from user,
    //                    displays the sum of all Factors of that number.
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

        int iRet = nobj.SumFactors(iValue);

        System.out.println("Summation of factors is : "+iRet);
    }
}