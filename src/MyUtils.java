public class MyUtils
{
    public static int anazitisiMeEpwnymo(Foititis MyArray[],String SearchByLastName)
    {
        for (int i = 0; i < MyArray.length; i++)
        {
            if(MyArray[i].getLastName().equals(SearchByLastName))
            {
                return i;
            }
        }
        return -1;
    }
    public  static int anazitisiMeArMitrwou(Foititis MyArray[],short SearchByAM)
    {
        int left = 0, right = MyArray.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (MyArray[m].getAM() == SearchByAM)
                return m;

            if (MyArray[m].getAM() < SearchByAM)
                left = m + 1;

            else
                right = m - 1;
        }
        return -1;
    }
    public static int  anadromiAnazMeArithMitrwou(Foititis MyArray[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (MyArray[mid].getAM() == x)
                return mid;

            if (MyArray[mid].getAM() > x)
                return anadromiAnazMeArithMitrwou(MyArray, l, mid - 1, x);

            return anadromiAnazMeArithMitrwou(MyArray, mid + 1, r, x);
        }
        return -1;
    }

    public static void bubbleSort(Foititis MyArray[])
    {
        int n = MyArray.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (MyArray[j].getAM() > MyArray[j+1].getAM())
                {
                    Foititis temp = MyArray[j];
                    MyArray[j] = MyArray[j+1];
                    MyArray[j+1] = temp;
                }
    }
}
