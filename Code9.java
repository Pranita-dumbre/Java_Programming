////////////////////////////////////////////////////////////////////
//
//  File Name :         Code9.java
//  Description :       Checks whether a given number is even or odd.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       Contains one method to check if a number is even.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     CheckEven
    //  Description :     Contains one method to check if a number is even.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public boolean CheckEven(
                                int iNo
                            )
    {
        if((iNo % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code9
//  Description :       Returns true if number is even, false otherwise.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code9
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point class. Accepts number from user,
    //                    check if it is even or odd,and displays the result.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        bRet = nobj.CheckEven(iValue);

        if(bRet == true)
        {
            System.out.println(iValue+" is even");
        }
        else
        {
            System.out.println(iValue+" is odd");
        }
    }
}