/////////////////////////////////////////////////////////////////////
//
//  File Name :         Code21.java
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
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            if(( (iNo % 10) % 2) == 0)
            {
                System.out.println(iNo % 10);
            }
            iNo = iNo / 10;
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code21
//  Description :       Accepts an integer from user and calls the method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code21
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