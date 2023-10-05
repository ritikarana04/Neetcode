//HASHMAP & PRIORITY QUEUE
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);
            }
        });

        for(int i:map.keySet()){
            queue.add(i);
        }
        for(int i=0; i<k; i++){
            ans[i]=queue.poll();
        }
        return ans;
    }
}
//HASHMAP & ARRAYLIST
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);
            }
        });
    
        for(int i=0; i<k; i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
// HASHMAP AND BRUTE FORCE
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        for(int i=0; i<k; i++){
            int max=0;
            int n=0;
            for(int y: map.keySet()){ 
                if(map.get(y)>max){
                    max=map.get(y);
                    n=y;
                }
            }
            ans[i]=n;
            map.remove(n);
        }
        return ans;
    }
}
