////////////////////////////////////////////////////////////////////
//
//  File Name :         Code8.java
//  Description :       Demonstrates constructor usage and addition 
//                      of two numbers using Arithematic class.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Arithematic
//  Description :       Represents arithmetic operations on two integers.
//                      Constructor initializes numbers and methods perform
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Arithematic
{
    public int iNo1;
    public int iNo2;

    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Arithematic
    //  Description :     Initializes class data members with given values.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public Arithematic(
                            int A, 
                            int B
                        )
    {
        this.iNo1 = A;
        this.iNo2 = B;
    }

    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Addition
    //  Description :     Returns the addition of iNo1 and iNo2.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int Addition()
    {
        int iAns = 0;
        iAns = this.iNo1 + this.iNo2;
        return iAns;
    }
}
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code8
//  Description :       Entry point class. Accepts two numbers from user,
//                      creates object, and performs addition
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code8
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Reads input from user,calls Addition method, 
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

        Arithematic aobj = new Arithematic(iValue1, iValue2);

        iRet = aobj.Addition();

        System.out.println("Addition is : "+iRet);

    }
}