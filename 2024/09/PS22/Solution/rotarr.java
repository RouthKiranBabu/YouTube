import java.util.Arrays;
import java.util.Scanner;
public class rotarr {
    public int[] rotateArray(int[] arr, int n){
        if (n >= 0 && n < arr.length){
            int[] far = new int[n + 1];
            int[] lar = new int[arr.length - n - 1];
            int[] newarr = new int[arr.length];
            int j = 0;
            for(int i = 0; i < arr.length; i += 1){
                if(i <= n){
                    far[i] = arr[i];
                }else{
                    lar[j] = arr[i];
                    j += 1;
                }
            }
            for(int i = 0; i < lar.length; i ++){
                newarr[i] = lar[i];
            }
            int l = newarr.length - far.length;
            //System.out.println(Arrays.toString(newarr) + ", " + l);
            for(int i = 0; i < far.length; i ++){
                newarr[l + i] = far[i];
            }
            return newarr;
        }else{
            int n1 = Math.abs(n);
            int n2 = n1 - 1;
            int[] far = new int[n2 + 1];
            int[] lar = new int[arr.length - n2 - 1];
            int[] newarr = new int[arr.length];
            int j = 0;
            for(int i = 0; i < arr.length; i += 1){
                if(i <= n2){
                    far[i] = arr[i];
                }else{
                    lar[j] = arr[i];
                    j += 1;
                }
            }
            for(int i = 0; i < lar.length; i ++){
                newarr[i] = lar[i];
            }
            int l = newarr.length - far.length;
            //System.out.println(Arrays.toString(newarr) + ", " + l);
            for(int i = 0; i < far.length; i ++){
                newarr[l + i] = far[i];
            }
            return newarr;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integer you want to enter: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            System.out.print("Enter value at index " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter index integer to rotate: ");
        int ix = scanner.nextInt();
        scanner.close();
        rotarr rc = new rotarr();
        //System.out.println(Arrays.toString(arr));
        int[] r = rc.rotateArray(arr, ix);
        System.out.println("-> " + Arrays.toString(r));
    }
}
