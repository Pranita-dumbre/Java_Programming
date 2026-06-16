//////////////////////////////////////////////////////////////////
//
//  File Name :         program98.java
//  Description :       Program to display pattern of alphabets where 
//                      each row contains the same character repeated 
//                      across all columns.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input 4  4   
/*
    A   A   A   A   
    B   B   B   B
    C   C   C   C
    D   D   D   D
*/

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Accepts number of rows and columns from user 
//                      and prints same character in each row, starting 
//                      from 'A' to next alphabets in sequence.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Displays pattern where same alphabet repeats 
    //                    in each row across all columns.
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

        for(i = 1, ch = 'A'; i <= iRow; i++, ch++)
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
//  Class Name :        Code49
//  Description :       Main class to take user input and call Display 
//                      method to print alphabet pattern.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code49
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point of program. Reads number of rows 
    //                    and columns from user and displays pattern 
    //                    using Display method.
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