/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code19.java
//  Description :       Program to accept an integer from user and 
//                      display the frequency of digit 5 in it.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to count the 
//                      frequency of digit 5 from the given integer.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Digits
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CountFrequency
    //  Description :     Counts and returns how many times digit 5 
    //                    occurs in the given integer number.                   
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int CountFrequency(
                                    int iNo
                              )
    {
        int iCnt = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 5)
            {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code19
//  Description :       Accepts an integer from user and displays the frequency of 
//                      digit 5 in it using Digits class.           
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code19
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accepts input number from user, calls CountFrequency method 
    //                    and displays the frequency of digit 5.
    //  Author :          Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountFrequency(iValue);

        System.out.println("Number of 5 are : "+iRet);
    }
}