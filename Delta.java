import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

class Quiz{
    public static Vector<String> easy = new Vector<String>();
    static{
        easy.add("Which data structure is used in redo-undo feature?\n");
        easy.add("Queue");easy.add("Stack");easy.add("Heap");easy.add("Tries");

        easy.add("Which data structure is most efficient to find the top 10 largest items out of 1 million items stored in file?\n");
        easy.add("Dequeue");easy.add("Min Heap");easy.add("Max Heap");easy.add("BST");

        easy.add("Which data structure is best suited for converting recursive implementation to iterative implementation of an algorithm?\n");
        easy.add("Trees");easy.add("Stack");easy.add("Map");easy.add("Set");

        easy.add("Which of the following data structures is best suited for efficient implementation of priority queue?\n");
        easy.add("Array");easy.add("Linked List");easy.add("Heap");easy.add("Stack");

        easy.add("The maximum number of binary trees that can be formed with three unlabeled nodes is:\n");
        easy.add("1");easy.add("5");easy.add("3");easy.add("4");

        easy.add("The number of leaf nodes in a rooted tree of n nodes, with each node having 0 or 3 children is:\n");
        easy.add("n");easy.add("n/2");easy.add("(2n+1)/3");easy.add("(n+1)/2");

        easy.add("How many distinct binary search trees can be created out of 4 distinct keys?\n");
        easy.add("3");easy.add("5");easy.add("14");easy.add("20");

        easy.add("Which of the following traversal outputs the data in sorted order in a BST?\n");
        easy.add("Preorder");easy.add("Inorder");easy.add("Postorder");easy.add("Level order");

        easy.add("Which of the following sorting algorithms can be used to sort a random linked list with minimum time complexity?\n");
        easy.add("Insertion Sort");easy.add("Quick Sort");easy.add("Heap Sort");easy.add("Merge Sort");

        easy.add("In the worst case, the number of comparisons needed to search a singly linked list of length n for a given element is\n");
        easy.add("2n");easy.add("n/2");easy.add("n");easy.add("log(n)");
    }
    public static Vector<String> med=new Vector<>();
    static {
        med.add("What data structure is used for depth first traversal of a graph?\n");
        med.add("Queue");med.add("Stack");med.add("Linked List");med.add("Array");

        med.add("Minimum number of spanning tree in a connected graph is\n");
        med.add("n");med.add("0");med.add("n^(n-1)");med.add("1");

        med.add("Heap is an example of\n");
        med.add("Complete binary tree");med.add("Spanning tree");med.add("B tree");med.add("BST");

        med.add("Consider a B+-tree in which the maximum number of keys in a node is 5. What is the minimum number of keys in any non-root node?\n");
        med.add("3");med.add("2");med.add("5");med.add("4");

        med.add("A B-tree of order 4 is built from scratch by 10 successive insertions. What is the maximum number of node splitting operations that may take place?\n");
        med.add("3");med.add("4");med.add("5");med.add("6");

    }
    public static Vector<String> hd=new Vector<>();
    static {
        hd.add("What is the time complexity of Bellman-Ford single-source shortest path algorithm on a complete graph of n vertices? \n");
        hd.add("O(n^2)");hd.add("O(n^3)");hd.add("O(n^2logn)");hd.add("nlogn");

        hd.add("Which one of the following is the tightest upper bound that represents the number of swaps required to sort n numbers using selection sort? \n");
        hd.add("O(logn)");hd.add("O(n)");hd.add("O(nlogn)");hd.add("O(n^2)");

        hd.add("Assuming P != NP, which of the following is true ?\n");
        hd.add("NP-complete = NP");hd.add("NP-complete ∩ P = Φ");hd.add("NP-hard = NP");hd.add("P = NP-complete");

        hd.add("A list of n string,each of length n,is sorted into lexicographic order using the merge-sort algo.The worst case running time of this computation is\n");
        hd.add("O(n log n )");hd.add("O(n2 log n)");hd.add("O(n^2 + log n)");hd.add("O(n^2)");

        hd.add("What is the maximum height of any AVL-tree with 7 nodes? Assume that the height of a tree with a single node is 0.\n");
        hd.add("2");hd.add("3");hd.add("4");hd.add("5");
    }
}
public class Delta extends JFrame implements ActionListener {
    Quiz ob=new Quiz();
    JLabel l;
    JRadioButton jb[]=new JRadioButton[5];
    JButton b1;
    ButtonGroup bg;
    int c=0,cr=0,pr=0,mr=0,p=1;
    int lev=0,f=0;
    int es=0,md=0,hr=0;
    int one=0,two=0,thr=0,tot=0;
    int b=1,m=1,h=1;
    //int m[]=new int[15];
    Delta(String s)
    {
        super(s);
        l = new JLabel();
        add(l);
        bg=new ButtonGroup();
        for(int i=0;i<5;i++)
        {
            jb[i]=new JRadioButton();
            add(jb[i]);
            bg.add(jb[i]);
        }
        b1=new JButton("Next");
        b1.addActionListener(this);
        add(b1);
        init();
        l.setBounds(30,40,950,20);
        jb[0].setBounds(50,80,200,20);
        jb[1].setBounds(50,110,200,20);
        jb[2].setBounds(50,140,200,20);
        jb[3].setBounds(50,170,200,20);
        b1.setBounds(100,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(1000,500);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1 && f==0)
        {
            if(jb[0].isSelected() || jb[3].isSelected())
                lev=3;
            if(jb[1].isSelected())
                lev=1;
            else
                lev=2;
            if(lev==1)
            {
                es=10;
                md=3;
                hr=2;
            }
            if(lev==2) {
                es = 7;
                md = 5;
                hr = 3;
            }
            else {
                es = 5;
                md = 5;
                hr = 5;
            }
            f=1;
        }
        else if(e.getSource()==b1)
        {
            //b1.setText("Next");
            if(checkit())
            {
                if(es>0)
                    one++;
                else if(md>0)
                    two++;
                else if(hr>0)
                    thr++;
            }
            if(es>0)
            {
                easypeasy();
                es--;
                b++;
            }
            else if(md>0)
            {
                medium();
                md--;
                m++;
            }
            else if(hr>0)
            {
                hard();
                hr--;
                h++;
            }
            if(p==16)
            {
                b1.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Result"))
        {
            if(checkit()) {
                if(es>0)
                    one++;
                else if(md>0)
                    two++;
                else if(hr>0)
                    thr++;
            }
            cr++;
            calscore();
            JOptionPane.showMessageDialog(this,"Number of correct responses : "+(one+two+thr)+"\nTotal score : "+tot);
            System.exit(0);
        }
    }
    void init() {
        l.setText("Choose the level of Difficulty :");
        jb[0].setText("I don't care");
        jb[1].setText("Noobie");
        jb[2].setText("Experty");
        jb[3].setText("Grandmaster");
    }
    void easypeasy()
    {
        l.setText(p+") "+ob.easy.get(cr));cr++;
        jb[0].setText(ob.easy.get(cr));cr++;
        jb[1].setText(ob.easy.get(cr));cr++;
        jb[2].setText(ob.easy.get(cr));cr++;
        jb[3].setText(ob.easy.get(cr));cr++;
        p++;
    }
    void medium()
    {
        l.setText(p+") "+ob.med.get(mr));mr++;
        jb[0].setText(ob.med.get(mr));mr++;
        jb[1].setText(ob.med.get(mr));mr++;
        jb[2].setText(ob.med.get(mr));mr++;
        jb[3].setText(ob.med.get(mr));mr++;
        p++;
    }
    void hard()
    {
        l.setText(p+") "+ob.hd.get(pr));pr++;
        jb[0].setText(ob.hd.get(pr));pr++;
        jb[1].setText(ob.hd.get(pr));pr++;
        jb[2].setText(ob.hd.get(pr));pr++;
        jb[3].setText(ob.hd.get(pr));pr++;
        p++;
    }
    boolean checkit()
    {
        if(b==1)
            return jb[1].isSelected();
        if(b==2)
            return jb[2].isSelected();
        if(b==3)
            return jb[1].isSelected();
        if(b==4)
            return jb[2].isSelected();
        if(b==5)
            return jb[1].isSelected();
        if(b==24)
            return jb[2].isSelected();
        if(b==28)
            return jb[2].isSelected();
        if(b==32)
            return jb[1].isSelected();
        if(b==36)
            return jb[3].isSelected();
        if(b==40)
            return jb[2].isSelected();
        if(m==1)
            return jb[1].isSelected();
        if(m==2)
            return jb[3].isSelected();
        if(m==3)
            return jb[0].isSelected();
        if(m==4)
            return jb[1].isSelected();
        if(m==5)
            return jb[2].isSelected();
        if(h==1)
            return jb[1].isSelected();
        if(h==2)
            return jb[1].isSelected();
        if(h==3)
            return jb[1].isSelected();
        if(h==4)
            return jb[1].isSelected();
        if(h==5)
            return jb[1].isSelected();
        return false;
    }
    void calscore()
    {
        tot=one+(two*2)+(thr*3);
    }
    public static void main(String args[])
    {
        new Delta("Data Structures Quiz");
    }
}
