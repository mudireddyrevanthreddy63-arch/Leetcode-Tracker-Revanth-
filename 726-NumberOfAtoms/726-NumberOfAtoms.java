// Last updated: 11/08/2026, 14:17:07
class Solution {
    public String countOfAtoms(String formula) {
        int[] stack = new int[formula.length()];
        int idx = 0;
        int num = 0;
        int fact = 1;
        int k = 1;
        Trie head = new Trie();
        for (int i = formula.length() - 1; i >= 0; i--) {
            char ch = formula.charAt(i);
            if (ch >= 'a' && ch <= 'z') continue;
            if (ch >= '0' && ch <= '9') {
                num += fact * (ch - '0');
                fact *= 10;
            } else if (ch >= 'A' && ch <= 'Z') {
                int id = ch - 'A';
                if (head.next[id] == null) head.next[id] = new Trie();
                Trie curr = head.next[id];
                for (int j = i + 1; j < formula.length() && formula.charAt(j) >= 'a' && formula.charAt(j) <= 'z'; j++) {
                    int nid = formula.charAt(j) - 'a';
                    if (curr.next[nid] == null) curr.next[nid] = new Trie();
                    curr = curr.next[nid];
                }
                if (num == 0) num = 1;
                curr.cnt += num * k;
                num = 0;
                fact = 1;
            } else if (ch == ')') {
                stack[idx++] = k;
                if (num != 0) k *= num;
                num = 0;
                fact = 1;
            } else k = stack[--idx];
        }

        char[] curr = new char[formula.length()];
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < 26; j++) {
            if (head.next[j] != null) {
                curr[0] = (char) (j + 'A');
                add(sb, head.next[j], curr, 1);
            }
        }

        return sb.toString();
    }

    private void add(StringBuilder sb, Trie node, char[] curr, int i) {
        if (node.cnt != 0) {
            sb.append(String.valueOf(curr, 0, i));
            if (node.cnt != 1) sb.append(node.cnt);
        }

        for (int j = 0; j < 26; j++) {
            if (node.next[j] != null) {
                curr[i] = (char) (j + 'a');
                add(sb, node.next[j], curr, i + 1);
            }
        }
    }
}

class Trie {
    Trie[] next;
    int cnt;

    Trie() {
        next = new Trie[26];
        cnt = 0;
    }
}