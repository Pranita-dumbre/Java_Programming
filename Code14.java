///////////////////////////////////////////////////////////////////
//
//  File Name :         Code14.java
//  Description :       This program accepts an integer from the user 
//                      and calculates the sum of its factors and     
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       This class contains a method to calculate and 
//                      display the sum of factors and non-factors 
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     sum
    //  Description :     Catculate and display sum of all factors and non-factor of given integer
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Sum(
                        int iNo
                    )
    {
        int iCnt = 0, iSum1 = 0, iSum2 = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++) 
        {
            if((iNo % iCnt) == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }
        System.out.println("Summation of factors : "+iSum1);
        System.out.println("Summation of non factors : "+iSum2);
    }
}
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Code14
//  Description :       This class contains the main method which takes input from the user 
//                      and calls the Number class method to compute and display the sums of factors  
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code14
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     accept number from user and call the sum method
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

        nobj.Sum(iValue);
    }
}