/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code18.java
//  Description :       Program to accept an integer from user and 
//                      display the count of digits present in it.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to count the total 
//                      number of digits present in a given integer. 
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Digits
{   ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CountDigits
    //  Description :     Returns the total number of digits in the 
    //                    given integer number.                    
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////

    public int CountDigits(
                                int iNo
                            )
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iCnt++;
            iNo = iNo / 10;
        }
        return iCnt;
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code18
//  Description :       Accept an integer and display tha count of digits.           
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code18
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accept an integer and display tha count of digits.
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

        int iRet = dobj.CountDigits(iValue);

        System.out.println("Number of digits are : "+iRet);
    }
}