/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code22.java
//  Description :       Program to accept an integer from user and 
//                      display the count of even digits present in it.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to count the total 
//                      number of even digits from a given integer.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////

class Digits
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CountFrequency
    //  Description :     Counts and returns how many even digits are 
    //                    present in the given integer number.            
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int CountEven(
                            int iNo
                        )
    {
        int iDigit = 0 , iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
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
//  Class Name :        Code22
//  Description :       Accepts an integer from user and displays the count of even
//                      digits in it using Digits class.                       
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code22
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point of the method. Accepts input number from user,
    //                    calls CountEven method and displays the total count of even digits           
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

        int iRet = dobj.CountEven(iValue);

        System.out.println("Number of even digits are : "+iRet);
    }
}