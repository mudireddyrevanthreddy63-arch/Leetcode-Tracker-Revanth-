// Last updated: 08/09/2026, 10:01:44
1public class Codec {
2    public String serialize(TreeNode root) {
3        if (root == null) return "null,";
4        return root.val + "," + serialize(root.left) + serialize(root.right);
5    }
6    public TreeNode deserialize(String data) {
7        Queue<String> q = new LinkedList<>(Arrays.asList(data.split(",")));
8        return build(q);
9    }
10    private TreeNode build(Queue<String> q) {
11        String val = q.poll();
12        if (val.equals("null")) return null;
13        TreeNode node = new TreeNode(Integer.parseInt(val));
14        node.left = build(q);
15        node.right = build(q);
16        return node;
17    }
18}
19