class Trie {

    Node root;
    public Trie() {
        root=new Node('\0');
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char current=word.charAt(i);
            if(curr.children[current-'a']==null)
            {
                curr.children[current-'a']=new Node(current);
                
            }
            curr=curr.children[current-'a'];
        }
        curr.isWord=true;
    }
    
    public boolean search(String word) {
        Node node=getWord(word);
        return node!=null&&node.isWord==true;
    }
    
    public boolean startsWith(String prefix) {
        return getWord(prefix)!=null;
    }
    
    Node getWord(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char current=word.charAt(i);
            if(curr.children[current-'a']==null)
            {
                return null;
                
            }
            curr=curr.children[current-'a'];
        }
        return curr;
    }
    
    class Node
    {
        char c;
        boolean isWord;
        Node[] children;
        Node(char c)
        {
            this.c=c;
            this.children=new Node[26];
            this.isWord=false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */