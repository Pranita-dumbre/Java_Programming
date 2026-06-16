///////////////////////////////////////////////////////////////////
//
//  File Name :         Code13.java
//  Description :       Contains a method to display  addition of all 
//                      non-factors of a given integer.    
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       This class contains a method to display  addition of all 
//                      non-factors of a given integer.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     SumNonFactors
    //  Description :     used to display summation of all Non-factors of given number
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public int SumNonFactors(   
                                int iNo
                            )
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Code13
//  Description :       which takes input from the user and calls the Number class 
//                      method to display sum of non-factors.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code13
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point class. Accepts number from user,
    //                    displays the sum of all non-Factors of that number.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();

        Number nobj = new Number();

        int iRet = nobj.SumNonFactors(iValue);

        System.out.println("Summation of non factors is : "+iRet);
    }
}

