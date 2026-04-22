
public class TestMerge {
    static void swap(double[] arr, double i, double j)
    {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

  
    static int partition(double[] arr, double low, double high)
    {
        
        double pivot = arr[(int)high];

      
        double i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (arr[j] < pivot) {

                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(double[] arr, double low, double high)
    {
        if (low < high) {

            double pi = partition(arr, low, high);

            
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }    public static void main(String[] args) 
    {
        int nums1[]={2,2,2,4,4}, nums2[]={2,2,4,4};
        double median; int nObs=nums1.length+nums2.length;
        double[] merged=new double[nObs];
        int k=0;
        
            for(int i=0,j=0;i<merged.length || j<merged.length;i++,j++)
            {   if(i<=nums1.length-1)
                    {
                    merged[k]=nums1[i];
                    k++;
                    }
                if(j<=nums2.length-1)
                    {
                    merged[k]=nums2[j];
                k++;
                    }

            }
            for(int i=0;i<merged.length;i++)
            System.out.println(merged[i]);
            System.err.println("Sorting");
            quickSort(merged, 0, merged.length-1);
            for(int i=0;i<merged.length;i++)
            System.out.println(merged[i]);
            if(nObs%2==0)
                median=((nObs/2)+((nObs/2)+1))/2;   
            else
                median=(nObs+1)/2;
            System.out.println(merged[(int)median]);
            
    }

}
