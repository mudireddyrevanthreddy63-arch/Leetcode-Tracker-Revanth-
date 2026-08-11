// Last updated: 11/08/2026, 14:14:50
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i< tickets.length; i++)
            q.add(i);
        int t = 0;
        while(!q.isEmpty())
        {
             int ind = q.poll(); // comes out of the queue
             t++; // he need 1 sec to buy
             tickets[ind]--; // decrement needs tickets
            if(tickets[ind]>0)
                q.add(ind);
            if(ind==k && tickets[ind] ==0)
            return t;    
        }
        return t;     
    }
}