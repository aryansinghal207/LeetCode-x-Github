class Solution {
    public int numBusesToDestination(int[][] a, int source, int target) {
        if(source==target) return 0;
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int bus=0;bus<a.length;bus++){
            for(int stop:a[bus]){
                if(!map.containsKey(stop)) map.put(stop,new ArrayList<>());
                map.get(stop).add(bus);
            }
        }
        if(!map.containsKey(source)) return -1;
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[a.length];
        for(int bus:map.get(source)){
            q.offer(bus);
            vis[bus]=true;
        }
        int count=1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int curr=q.poll();
                for(int stop:a[curr]){
                    if(stop==target) return count;
                    if(map.containsKey(stop)){
                        for(int next:map.get(stop)){
                            if(!vis[next]){
                                vis[next]=true;
                                q.offer(next);
                            }
                        }
                    }
                }
            }
            count++;
        }
        return -1;

    }
}