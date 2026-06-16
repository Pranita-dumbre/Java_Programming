//////////////////////////////////////////////////////////////////
//
//  File Name :         Code46.java
//  Description :       Program to display characters in matrix pattern 
//                      sequentially from 'A' till the rows and columns 
//                      entered by the user.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input 4  4   
/*
    A   B   C   D
    E   F   G   H
    I   J   K   L
    M   N   O   P
*/

import java.util.*;

/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       It accepts number of rows and columns from 
//                      the user and prints characters sequentially 
//                      from 'A' in a matrix form.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Displays alphabets in matrix pattern from 'A'
//                        according to given rows and columns.
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
        char ch = 'A';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code46
//  Description :       It accepts number of rows and columns from 
//                      the user and prints characters sequentially 
//                      from 'A' in a matrix form.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code46
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point of the program. Takes row and column 
    //                    input from user and displays the character pattern.
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