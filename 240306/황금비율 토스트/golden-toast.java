import java.util.*;
import java.io.*;

//L : l.previous
//R : l.next
//D : l.remove
//P& : l.add(s)
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<String> list = new LinkedList<>();
        

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String[] strArr = str.split("");
        for (int i = 0; i < N; i++) {
            list.add(strArr[i]);
        }

        ListIterator<String> it = list.listIterator(list.size());
        for (int i  = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input) {
                case "L":
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case "R":
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case "D":
                    if (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    break;
                case "P":
                    String s = st.nextToken();
                    it.add(s);
                    break;
            }
        }

        for (String s: list) {
            System.out.print(s);
        }
    }
}