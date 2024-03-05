import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            int output;
            switch(method) {
                case "push_front":
                    output = Integer.parseInt(st.nextToken());
                    list.addFirst(output);
                    break;
                case "push_back":
                    output = Integer.parseInt(st.nextToken());
                    list.addLast(output);
                    break;
                case "pop_front":
                    if (list.isEmpty()) {
                        output = 0;
                    } else {
                        output = list.pollFirst();
                    }
                    System.out.println(output);
                    break;
                case "pop_back":
                    if (list.isEmpty()) {
                        output = 0;
                    } else {
                        output = list.pollLast();
                    }
                    System.out.println(output);
                    break;
                case "size":
                    output = list.size();
                    System.out.println(output);
                    break;
                case "empty":
                    output = list.isEmpty() ? 1 : 0;
                    System.out.println(output);
                    break;
                case "front":
                    if (list.isEmpty()) {
                        output = 0;
                    } else {
                        output = list.peekFirst();
                    }
                    System.out.println(output);
                    break;
                case "back":
                    if (list.isEmpty()) {
                        output = 0;
                    } else {
                        output = list.peekLast();
                    }
                    System.out.println(output);
                    break;
            }
        }
    }
}