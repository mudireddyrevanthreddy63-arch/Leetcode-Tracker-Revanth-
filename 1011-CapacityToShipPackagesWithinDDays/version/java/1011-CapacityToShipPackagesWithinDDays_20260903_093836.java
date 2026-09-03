// Last updated: 03/09/2026, 09:38:36
1class Solution {
2    public int totalFruit(int[] arr) {
3
4        int type1 = -1;
5        int type2 = -1;
6
7        int count1 = 0;
8        int count2 = 0;
9
10        int left = 0;
11        int maxlen = 0;
12
13        for (int i = 0; i < arr.length; i++) {
14
15            if (arr[i] == type1) {
16                count1++;
17            }
18
19            else if (arr[i] == type2) {
20                count2++;
21            }
22
23            else {
24
25                while (count1 > 0 && count2 > 0) {
26
27                    if (arr[left] == type1) {
28                        count1--;
29                    }
30                    else {
31                        count2--;
32                    }
33
34                    left++;
35                }
36
37                if (count1 == 0) {
38                    type1 = arr[i];
39                    count1 = 1;
40                }
41                else {
42                    type2 = arr[i];
43                    count2 = 1;
44                }
45            }
46
47            maxlen = Math.max(maxlen, i - left + 1);
48        }
49
50        return maxlen;
51    }
52}