// Last updated: 11/08/2026, 14:16:28
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int num:stones){
            maxHeap.offer(num);
        }   
        while(!maxHeap.isEmpty()){
            if(maxHeap.size()==1){
                break;
            }
            int a=maxHeap.poll();
            int b=maxHeap.poll();
            int diff=a-b;
            if(diff>0){
                maxHeap.offer(diff);
            }
        }
        return maxHeap.isEmpty()?0:maxHeap.peek();
    }
}