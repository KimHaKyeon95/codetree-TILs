import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        radixSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixSort(int[] arr) {
        final int RADIX = 10; // 10진수 기준
        List<Integer>[] bucket = new ArrayList[RADIX];
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        // 최대 자릿수 찾기
        int maxLength = 6;

        // 자릿수별로 데이터 분류 및 수집
        for (int exponent = 1; maxLength > 0; exponent *= RADIX, maxLength--) {
            for (int item : arr) {
                int bucketIndex = (item / exponent) % RADIX;
                bucket[bucketIndex].add(item);
            }

            // 버킷에서 데이터 수집
            int arrayIndex = 0;
            for (List<Integer> bucketList : bucket) {
                for (Integer value : bucketList) {
                    arr[arrayIndex++] = value;
                }
                bucketList.clear();
            }
        }
    }
}