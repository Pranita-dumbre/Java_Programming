/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code15.java
//  Description :       This program accepts an integer from the user
//                      and counts the number of digits in that integer.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to count the number
//                      of digits in a given integer.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Digits
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CountDigits
    //  Description :     counts the number of digits in the given number
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int CountDigits(
                                int iNo
                            )
    {
        int iCnt = 0, iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code15
//  Description :       Accepts input from the user and calls the Digits class
    //                  method to count and display the number of digits
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code15
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accepts input from the user and calls the Digits class
    //                    method to count and display the number of digits
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigits(iValue);

        System.out.println("Number of digits are : "+iRet);
    }
}