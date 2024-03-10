import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] intArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < N-1; i++) {
                if (intArr[i] > intArr[i+1]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = temp;
                    sorted = false;
                }
            }
        } while(!sorted);

        for (int i = 0; i < N; i++) {
        System.out.print(intArr[i] + " ");
        }
    }

    
}