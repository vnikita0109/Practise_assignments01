

public class Sort{

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 3, 5, 4};
        int count=0,i;

        System.out.println("After sorting :");
        sort(arr, arr.length);
        for (i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                count=count+arr[i];

            }
            System.out.println(arr[i]);
        }
            if(count>15)
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }

    }
        public static void sort(int arr[],int l) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int tmp = 0;
                    if (arr[i] < arr[j]) {
                        tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }


}