////////////////////////////////////////////////////////////////////
//
//  File Name :         Code5.java
//  Description :       Addition of two numbers
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;

////////////////////////////////////////////////////////////////////
//
//  class Name :        Code5
//  Description :       Demonstrates addition of two integers
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code5
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Addition
    //  Description :     Accepts two integers and returns their addition.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static int Addition(
                                    int iNo1,
                                    int iNo2
                                )
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Reads two integers from the user and displays their addition.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        iRet = Addition(iValue1, iValue2);

        System.out.println("Addition is : "+iRet);

    }
}
