//////////////////////////////////////////////////////////////////
//
//  File Name :         Code50.java
//  Description :       Program to display pattern of lowercase alphabets 
//                      where each row contains the same character repeated 
//                      across all columns.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input 4  4   
/*
    a   a   a   a
    b   b   b   b
    c   c   c   c
    d   d   d   d

*/

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Accepts number of rows and columns from user 
//                      and prints lowercase alphabets where each row 
//                      contains the same alphabet repeated across columns.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Displays lowercase alphabets in pattern form 
    //                    where same character repeats in each row.
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
        char ch = '\0';

        for(i = 1, ch = 'a'; i <= iRow; i++, ch++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code50
//  Description :       Main class to take user input and call Display 
//                      method of Pattern class to print lowercase pattern.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code50
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point of program. Reads number of rows 
    //                    and columns from user and prints lowercase 
    //                    alphabet pattern using Display method.
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