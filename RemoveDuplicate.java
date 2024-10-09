public class RemoveDuplicate {
    // Java Program to Remove Duplicate Elements
    // From the Array using extra space

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        // checking the last element present in temp[]
        boolean check = true;
        for (int i = 0; i < j; i++) {
            if (temp[i] == a[n - 1]) {
                check = false;
                break;
            }
        }

        if (check == true) {

            temp[j++] = a[n - 1];
        }
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2, 4, 2 };
        int n = a.length;

        n = removeduplicates(a, n);

        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}


