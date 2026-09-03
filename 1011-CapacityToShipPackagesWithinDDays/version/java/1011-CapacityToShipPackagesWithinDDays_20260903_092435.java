// Last updated: 03/09/2026, 09:24:35
class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<Integer> que = new PriorityQueue<>((a,b)->(b - a));

        for(int[] num: matrix){
            for(int el: num){
                que.offer(el);    
            }
            while(que.size()>k){
                que.poll();
            }
        }

        return que.poll();

    }
}