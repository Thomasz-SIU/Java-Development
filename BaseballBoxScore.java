import java.util.*;
import  java.io.*;

public class BaseballBoxScore
{
    public static void main(String[] args)
            throws FileNotFoundException
    {
        Scanner fin = new Scanner ( new FileNotFoundException("baseball.txt"));

        final int LIST_LENGTH = 20;

        int teamSize = 0;
        int number = 0;
        int hits = 0;
        int walks = 0;
        int outs = 0;
        int index = 0;


        System.out.println("This program tracks and outputs a players"
        +" number and their number of walks, runs, and outs for each game in"
        +" a season.");

        Player[] dit = new Player[LIST_LENGTH];

        for(int i = 0; i< LIST_LENGTH, i++)
        {
            dit[i] = new Player();

         while(fin.hasNext())
         {
             number = fin.nextInt();
             hits = fin.nextInt();
             walks = fin.nextInt();
             outs = fin.nextInt();


             index = findNumber(dit, index, teamSize);

             if(index < 0)
             {
                 teamSize++;
                 index = teamSize - 1;
                 dit[index].setNumber(number);
             }
             dit[index].setHits(hits+dit[index].getHits());
             dit[index].setWalks(walks+dit[index]).getWalks());
             dit[index].setOuts(outs+dit[index].getOuts());
         }
         displayArray(dit, teamSize);
         selectionSort(dit, teamSize);
         displayArray(dit, teamSize);
         fin.close();
        }
}
    public static int   findNumber(Player[] team, int, int numb, int tsize);
    {
        int save = -1;
        boolean found = false;
        for ( int i = 0; i <tsize; i++)

            if(numb == team[i].getNumber())
            {
                found = true;
                save = i;
                break;
            }
            return save;
    }
}
    public static vois displayArray(Player [] team, int tsize)
    {
        System.out.println("\n\nPlayer\tWalks\t\Outs\n"
                +"------\t------\t------\t-----\n");
        for (int i = 0; i < tsize; i++)
        {
            System.out.println(team[i]);
        }
    }
    public static void selectionSort(Player[] team, int tsize)
    {
        int Index, smallestIndex, minIndex;
        Player temp;

        for(index = 0; Index < tsize - 1; Index++)
        {
                smallestIndex = Index;

                for (minIndex = Index + 1; minIndex<tsize; minIndex++)
                {
                    if (team[minIndex.getNumber()<team[smallestIndex].getNumber())
                        smallestIndex = minIndex;

                    if(smallestIndex !=Index)
                    {
                        temp = team[smallestIndex];
                        team[smallestIndex] = team[Index];
                        team[Index] = temp;
                    }
                }
        }
    }
