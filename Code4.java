////////////////////////////////////////////////////////////////////
//
//  File Name :         Code4.java
//  Description :       Addition of two numbers
//  Author :            Pranita Purushottam Dumbre
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Code4
{
    ////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Takes 2 inputs from user and prints it addition.
    //  Author :          Pranita Purushottam Dumbre
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = null;
        int iNo1 = 0, iNo2 = 0, iAns = 0;

        sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iNo2 = sobj.nextInt();

        iAns = iNo1 + iNo2;

        System.out.println("Addition is : "+iAns);
    }
}
