class StringIterator {

    Queue<Character> queue = new LinkedList<>();
    List<Integer> counter = new ArrayList<>();
    int idx=0;
    
    public StringIterator(String compressedString) {
        char prev = ' ';
        int t=0;
        
        for(char c : compressedString.toCharArray()){
            if(Character.isLetter(c)){
                if(t > 0){
                    queue.add(prev);
                    counter.add(t);
                }
                prev = c;
                t=0;
            } else {
                int temp = (int)c-'0';
                t *= 10;
                t += temp;
            }
        }
        
        queue.add(prev);
        counter.add(t);
    }
    
    public char next() {
        if(queue.isEmpty()){
            return ' ';
        }
        
        char n = queue.peek();
        int t = counter.get(idx);
        if(t == 1){
            queue.poll();
            idx++;
        } else
            counter.set(idx, t-1);
        
        return n;
    }
    
    public boolean hasNext() {
  
        return !queue.isEmpty();
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */