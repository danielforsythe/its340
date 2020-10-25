package pkgfinal;

//ITS340 Day

import java.util.ArrayList;
import java.util.List;

public class treeGeneral<T> {
    private String Question = "";
    private String answer = "";
    private int nodeID = -1;
    private int Y = -1;
    private int N = -1;
    private int Quit = -1;
    private int Other = -1;
    private int Varies = -1;
    private List<treeGeneral> children = new ArrayList<>();
    private treeGeneral parent = null;
       
    public treeGeneral(String answer) {
        this.answer = answer;
    }
    public void addChild(treeGeneral child) {
        child.setParent(this);
        this.children.add(child);
    }
    public void addChild(String Question) {
        treeGeneral<String> newChild = new treeGeneral<>(Question);
        newChild.setParent(this);
        children.add(newChild);
    }
    public void addChildren(List<treeGeneral> children) {
        for(treeGeneral t : children) {
        t.setParent(this);
        }
        this.children.addAll(children);
    }
    public List<treeGeneral> getChildren() {
        return children;
    }
    public void setAnswer(String Answer) {
        this.answer = Answer;
    }
    public String getAnswer() { return answer; }
    public String getQuestion() { return Question; }
    public void setQuestion(String Question) {
        this.Question = Question;
    }
    public void setNodeID(int ID) {
        this.nodeID = ID;
    }
    public int getNodeID() { return nodeID; }
    private void setParent(treeGeneral parent) {
        this.parent = parent;
    }
    public treeGeneral getParent() {
        return parent;
    }
    public void setYes(int Y) {
        this.Y = Y;
    }
    public int getYes() { return Y; }
    public void setNo(int N) {
        this.N = N;
    }
    public int getNo() { return N; }
    public void setQuit(int Q) {
        this.Quit = Q;
    }
    public int getQuit() { return Quit; }
    public void setOther(int O) {
        this.Other = O;
    }
    public int getOther() { return Other; }
    public void setVaries(int V) {
        this.Varies = V;
    }
    public int getVaries() { return Varies; }
    public static void main(String[] args) {
//            //Setup the tree
//        //T1
        treeGeneral<String> Node1;
        Node1 = new treeGeneral<>("Root");
        Node1.setNodeID(1);
        Node1.setQuestion("I would like to ask you about your general medical history, is that OK (Y/N)?");
        Node1.setYes(2);
        Node1.setNo(3);
        //T2
        treeGeneral<String>  Node2 = new treeGeneral<>("Y");
        Node2.setNodeID(2);
        Node2.setQuestion("Do you know your blood type (Y/N)?");
        Node2.setYes(4);
        Node2.setNo(5);
        Node2.setQuit(3);
        treeGeneral<String> Node3 = new treeGeneral<>("N");
        Node3.setNodeID(3);
        Node3.setQuestion("We understand, thank you for your time.");
        Node1.addChild(Node2);
        Node1.addChild(Node3);
        //T3
        treeGeneral<String> Node4 = new treeGeneral<>("Node4");
        Node4.setNodeID(4);
        Node4.setQuestion("Is your blood type O, A, or B?");
        Node4.setVaries(6);
        Node4.setQuit(3);
        Node4.setOther(7);
        Node1.addChild(Node4);
        //T4
        treeGeneral<String> Node6 = new treeGeneral<>("Node6");
        Node6.setQuestion("Is yhour blod type 'RH+' or 'RH-'?");
        Node6.setNodeID(6);
        Node6.setVaries(5);
        Node6.setQuit(3);
        Node1.addChild(Node6);
        treeGeneral<String> Node7 = new treeGeneral<>("Node7");
        Node7.setQuestion("Since your answer doesn't match any of the blood types, we will go on to the next question, OK?: (Y/N)");
        Node7.setNodeID(7);
        Node7.setYes(5);
        Node7.setNo(3);
        Node7.setQuit(3);
        Node1.addChild(Node7);
        //T5
        treeGeneral<String> Node5 = new treeGeneral<>("Node5");
        Node5.setQuestion("What is your marital status, Single or Married?");
        Node5.setNodeID(5);
        Node5.setVaries(8);
        Node5.setQuit(3);
        Node1.addChild(Node5);
        //T6
        treeGeneral<String> Node8 = new treeGeneral<>("Node8");
        Node8.setQuestion("Do you use alcohol?: (Y/N)");
        Node8.setNodeID(8);
        Node8.setYes(9);
        Node8.setNo(12);
        Node8.setQuit(3);
        Node1.addChild(Node8);
        //T7
        treeGeneral<String> Node9 = new treeGeneral<>("Node9");
        Node9.setQuestion("What type of alcohol do you drink?");
        Node9.setNodeID(9);
        Node9.setVaries(12);
        Node9.setOther(10);
        Node9.setQuit(3);
        Node1.addChild(Node9);
        //T8
        treeGeneral<String> Node10 = new treeGeneral<>("Node10");
        Node10.setQuestion("How much do you drink per week?");
        Node10.setNodeID(10);
        Node10.setOther(11);
        Node10.setVaries(12);
        Node10.setQuit(3);
        Node1.addChild(Node10);
        //T9
        treeGeneral<String> Node11 = new treeGeneral<>("Node11");
        Node11.setQuestion("How long have you been drinking?");
        Node11.setNodeID(11);
        Node11.setOther(12);
        Node11.setQuit(3);
        Node1.addChild(Node11);
        //T10
        treeGeneral<String> Node12 = new treeGeneral<>("Node12");
        Node12.setQuestion("do you use tobacco?: (Y/N)");
        Node12.setNodeID(12);
        Node12.setYes(13);
        Node12.setNo(16);
        Node12.setQuit(3);
        Node1.addChild(Node12);
        //T11
        treeGeneral<String> Node13 = new treeGeneral<>("Node13");
        Node13.setQuestion("What type of tobacco do you use?  Cigarettes, cigars, or chewing tobacco?");
        Node13.setNodeID(13);
        Node13.setOther(16);
        Node13.setQuit(3);
        Node13.setVaries(14);
        Node1.addChild(Node13);
        //T12
        treeGeneral<String> Node14 = new treeGeneral<>("Node14");
        Node14.setQuestion("how much do you use tobacco per week?");
        Node14.setNodeID(14);
        Node14.setOther(15);
        Node1.addChild(Node14);
        //T13
        treeGeneral<String> Node15 = new treeGeneral<>("Node15");
        Node15.setQuestion("How long have you been using tobacco?");
        Node15.setNodeID(15);
        Node15.setOther(16);
        Node15.setQuit(3);
        Node1.addChild(Node15);
        //T14
        treeGeneral<String> Node16 = new treeGeneral<>("Node16");
        Node16.setQuestion("Do you use any drugs?");
        Node16.setNodeID(16);
        Node16.setQuit(3);
        Node16.setYes(17);
        Node16.setNo(20);
        Node16.setOther(20);
        Node1.addChild(Node16);
        //T15
        treeGeneral<String> Node17 = new treeGeneral<>("Node17");
        Node17.setQuestion("What type of drug or drugs are you using?");
        Node17.setNodeID(17);
        Node17.setQuit(3);
        Node17.setYes(18);
        Node17.setOther(3);
        Node1.addChild(Node17);
        //T16
        treeGeneral<String> Node18 = new treeGeneral<>("Node18");
        Node18.setQuestion("How much of the drug or drugs do you take per week?");
        Node18.setNodeID(18);
        Node18.setQuit(3);
        Node18.setOther(19);
        Node1.addChild(Node18);
        //T17
        treeGeneral<String> Node19 = new treeGeneral<>("Node19");
        Node19.setQuestion("How long have you been using the drug or drugs?");
        Node19.setNodeID(19);
        Node19.setQuit(3);
        Node19.setOther(3);
        Node1.addChild(Node19);
        
//        for(treeGeneral node : Node1.getChildren()) {
//            System.out.println(node.getNodeID());
//        }
        System.out.println(Node2.getYes());
    }
}