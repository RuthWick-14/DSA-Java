class Node {
    Node[] links = new Node[26];
    boolean flag = false;

    public Node(){

    }
    
    boolean containsKey(char ch) {
        return (links[ch - 'a'] != null);
    }

    Node get(char ch) {
        return links[ch - 'a'];
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }
}


public class Tthree {
    private Node root;

    Tthree() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if(!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new Node());
            }
            // moves to the reference trie
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean checkIfPrefixExists (String word) {
        boolean flag = true;
        Node node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.containsKey(word.charAt(i)))  {
                node = node.get(word.charAt(i));
                if (node.isEnd() == false) return false;
            }
        }
        return true;
    }
    
    public String longestString(int n, String[] arr) {
        // code here
        for (int i = 0; i < n; i++) {
            insert(arr[i]);
        }
        String longest = "";
        for (int i = 0; i < n; i++){
            if (checkIfPrefixExists(arr[i])) {
                if (arr[i].length() > longest.length()) {
                    longest = arr[i];
                }
                else if (arr[i].length() == longest.length() && arr[i].compareTo(longest) < 0) {
                    longest = arr[i];
                }
            }
        }
        if (longest == "") return "";
        return longest;
    }
}