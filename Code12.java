///////////////////////////////////////////////////////////////////
//
//  File Name :         Code12.java
//  Description :       Accepts an integer from the user and displays all numbers 
//                      from 1 to that integer which are not factors of the given number.                 
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Number
//  Description :       This class contains a method to display all 
//                      non-factors of a given integer.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Number
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     DisplayNonFactors
    //  Description :     used to display Non-factors of given number
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            15/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void DisplayNonFactors( 
                                    int iNo
                                  )
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
///////////////////////////////////////////////////////////////////
//
//  Class Name :        Code12
//  Description :       which takes input from the user and calls the Number class 
//                      method to display non-factors.
//  Author :            Pranita Purushottam Dumbre
//  Date :              15/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code12
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     main method which takes input from the user and 
    //                    calls method to display non-factors.                     
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

        nobj.DisplayNonFactors(iValue);
    }
}