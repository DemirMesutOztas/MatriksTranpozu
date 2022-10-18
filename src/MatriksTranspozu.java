import java.util.Scanner;

public class MatriksTranspozu
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[2][3];
        int [][] tArr = new int[3][2];

        System.out.println("Dizi elemanlarını giriniz: ");

        for (int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            {
                arr[i][j]=in.nextInt();
            }

        }


        for(int i =0; i< tArr.length; i++)
        {
            for(int j=0; j< tArr[i].length; j++)
            {
                tArr[i][j]=arr[j][i];

            }
            System.out.println("");
        }

        System.out.println("Matris :");

        for(int [] k : arr)
        {
            for(int j : k)
            {
                System.out.print(j +"  ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze :");

        for(int [] k : tArr)
        {
            for(int j : k)
            {
                System.out.print(j + "  ");
            }
            System.out.println("");

        }

    }
}