////////////////////////////////////////////////////////////////////
//
//  File Name :         Code7.java
//  Description :       Demonstrates addition of two numbers using separate class
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Arithematic
//  Description :       Contains method to perform arithmetic addition operations
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Arithematic
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Addition
    //  Description :     Accepts two integers and returns their addition.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int Addition(
                            int iNo1, 
                            int iNo2
                        )
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
}
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code7
//  Description :       Entry point class; reads input and uses Arithematic class
//                      to perform addition.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code7
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Reads two integers from the user, calls Addition 
    //                    method from Arithematic class, and displays result.
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

        Arithematic aobj = new Arithematic();

        iRet = aobj.Addition(iValue1, iValue2);

        System.out.println("Addition is : "+iRet);

    }
}