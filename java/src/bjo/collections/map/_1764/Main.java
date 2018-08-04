package bjo.collections.map._1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// 듭보잡
// 출력만 정렬이기 때문에
// HashMap 으로 풀고, 출력 전에 정렬한다.
public class Main {

    // 듣도 못 한 사람에게는 1을 입력
    // 보도 못 한 사람에게는 2를 입력
    // 총 3이 되는 것을 찾는다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        TreeMap<String, Integer> d = new TreeMap<String, Integer>();

        // 듣도 못 한 사람에게는 1을 입력
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            d.put(name, 1);
        }

        // 보도 못 한 사람에게는 2를 입력
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            Integer v = d.get(name);

            if (null == v) {
                v = 0;
            }

            v += 2;
            d.put(name, v);
        }

        // 총 3이 되는 것을 찾는다.
        ArrayList<String> a = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry: d.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (3 == value) {
                a.add(key);
            }
        }

        System.out.println(a.size());
        for (String name: a) {
            System.out.println(name);
        }
    }
}
