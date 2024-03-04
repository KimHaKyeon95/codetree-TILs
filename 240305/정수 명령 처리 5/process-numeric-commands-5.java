import java.util.*;
import java.io.*;

public class Main {
    private static ArrayList<Integer> list;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String inputString = st.nextToken();

            switch(inputString) {
                case "push_back":
                    pushBack(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_back":
                    popBack();
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "get":
                    System.out.println(get(Integer.parseInt(st.nextToken())));
                    break;
            }
        }
    }

    private static void pushBack(int a) {
        list.add(a);
    }

    private static void popBack() {
        list.remove(list.size()-1);
    }

    private static int size() {
        return list.size();
    }

    private static int get(int index) {
        return list.get(index-1);
    }
}