package _20220414_P;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10];
        int cnt_fail = 0;
        for (int i = 1; i <= 9; i++) {
            arr[i] = true;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= 9; i++) {
            pq.offer(i);
        }

        String[] cmd = new String[]{"create",
                "create",
                "create",
                "create",
                "create",
                "execute 2"};
        int T = cmd.length;
        String c = "";
        int tag = 0;
        for (int i = 0; i < T; i++) {
            if (cmd[i].charAt(0) == 'e') {
                String[] str = cmd[i].split(" ");
                c = str[0];
                tag = Integer.parseInt(str[1]);
            } else {
                c = cmd[i];
            }

            switch (c) {
                case "create":
                    if (pq.isEmpty()) cnt_fail++;
                    else {
                        tag = pq.poll();
                        arr[tag] = false;
                    }
                    break;
                case "execute":
                    if (1 <= tag && tag <= 9 && !arr[tag]) {
                        pq.offer(tag);
                        arr[tag] = true;
                    }
                    break;
            }


        }
        System.out.print("Usable tags : ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        System.out.println("Fail count : " + cnt_fail);

    }
}
