//////////////////////////////////////////////////////////////////
//
//  File Name :         Code64.java
//  Description :       Program to display a right-angled triangular pattern
//                      based on the number of rows and columns entered by the user. 
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input 4  4   
/*

    *   
    *   *   
    *   *   *   
    *   *   *   *
    
*/

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       This class contains logic to generate and display
//                      the right-angled triangular star pattern. 
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     This method displays the right-angled triangular
    //                    pattern using nested loops. It first checks if the
    //                    number of rows and columns are equal. If not, it
    //                    prints "Invalid input". If valid, it prints stars (*)
    //                    in increasing order on each line to form a triangle.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iRow, 
                            int iCol
                        )
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            return;
        }

        for(i = 1 ; i <= iRow; i++)
        {
            for(j =  iCol ;j >= 1 ; j--)
            {
                if(i>=j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code64
//  Description :       This is the main class of the program. It is
//                      responsible for taking user input for number of
//                      rows and columns and calling the Display method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code64
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     This is the entry point function of the program.
    //                    It accepts input from the user for the number of
    //                    rows and columns, creates an object of the Pattern
    //                    class, and calls its Display method to print the pattern.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}