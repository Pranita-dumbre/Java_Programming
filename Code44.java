// Input : 4    4
/*
    *   *   *   *
    #   #   #   #
    *   *   *   *
    #   #   #   #
*/

///////////////////////////////////////////////////////////////////
//
//  File Name :         Code44.java
//  Description :       Program to display a rectangular pattern 
//                      of '*' and '#' symbols alternately for each row.
//                      Odd rows display '*' and even rows display '#'.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Contains the logic to generate and display
//                      the * and # row by row.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Prints a pattern in which each row displays
    //                    its row * and # repeated across all columns.
    //
    //  Input :           iRow - number of rows
    //                    iCol - number of columns
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iRow, 
                            int iCol  
                        )
    {
        int i = 0,j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 0)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code44
//  Description :       Accepts the frequency from the user, 
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code44
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point function. Accepts frequency 
    //                    from user and calls Display function 
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        int iRow = 0;
        int iCol = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter the number of Coloumm : ");
        iCol = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iRow, iCol);  
    }
}