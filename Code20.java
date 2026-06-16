/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code20.java
//  Description :       Program to accept an integer from user and 
//                      display the even of digit.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Digits
//  Description :       This class contains a method to display the 
//                      even of digit from the given integer.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Digits
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CountFrequency
    //  Description :     This function display the even digit of that numbers one by one.             
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void  DisplayEven(
                                int iNo
                            )
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                System.out.println(iDigit);
            }
            iNo = iNo / 10;
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code20
//  Description :       Accepts an integer from user and calls the method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code20
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Accepts input number from user, calls DisplayEven method 
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

        dobj.DisplayEven(iValue);
    }
}