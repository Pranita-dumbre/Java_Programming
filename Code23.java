////////////////////////////////////////////////////////////////////
//
//  File Name :         Code23.java
//  Description :       Program to accept an integer from user and 
//                      display its reverse number.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to reverse the 
//                      digits of a given integer number.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////

class Digits
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Reverse
    //  Description :     Reverses the given integer number and 
    //                    returns the reversed result.          
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int Reverse(
                            int iNo
                        )
    {
        int iDigit = 0 , iRev = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = iRev * 10 + iDigit;
            iNo = iNo / 10;
        }
        return iRev;
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code23
//  Description :       Accepts an integer from user and displays the reverse of that
//                      number using  Digits class.                                      
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code23
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accepts input number from user, calls Reverse 
    //                    method and displays the reversed number.      
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

        int iRet = dobj.Reverse(iValue);

        System.out.println("Reverse number is : "+iRet);
    }
}