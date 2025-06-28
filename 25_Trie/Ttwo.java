class Node {
    Node[] links = new Node[26];
    int countEndWith = 0;
    int countPrefix = 0;

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

    void increaseEnd() {
        countEndWith++;
    }

    void increasePrefix() {
        countPrefix++;
    }

    void reducePrefix() {
        countPrefix--;
    }

    void deleteEnd() {
        countEndWith--;
    }

    int getEnd() {
        return countEndWith;
    }

    int getPrefix() {
        return countPrefix;
    }
}

public class Ttwo {
    private Node root;

    Ttwo() {
        root = new Node();
    }

    public void insert(String words) {
        Node node = root;
        for (int i = 0; i < words.length(); i++) {
            if (!node.containsKey(words.charAt(i))) {
                node.put(words.charAt(i), new Node());
            }
            node = node.get(words.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String words) {
        Node node = root;
        for (int i = 0; i < words.charAt(i); i++) {
            if (node.containsKey(words.charAt(i))) {
                node = node.get(words.charAt(i));
            }
            else {
                return 0;
            }
        }
        return node.getEnd();
    }

    public int countWordsStartingWith(String words) {
        Node node = root;
        for (int i = 0; i < words.length(); i++) {
            if (node.containsKey(words.charAt(i))) {
                node = node.get(words.charAt(i));
            }
            else {
                return 0; 
            }
        }
        return node.getPrefix();
    }

    public void erase(String words) {
        Node node = root;
        for (int i = 0; i < words.length(); i++) {
            if (node.containsKey(words.charAt(i))) {
                node = node.get(words.charAt(i));
                node.reducePrefix();
            }
            else {
                return;
            }
        }
        node.deleteEnd();
    }
}
