public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        
        String d = Character.toString((char)257);
        StringBuilder res = new StringBuilder();
        
        for(String s : strs){
            res.append(s);
            res.append(d);
        }
        
        res.deleteCharAt(res.length() -1 );
        return res.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        
        String d = Character.toString((char)257);
        return Arrays.asList(s.split(d, -1));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));