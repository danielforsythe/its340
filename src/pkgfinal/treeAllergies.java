package pkgfinal;

//ITS340 Day

import java.util.ArrayList;
import java.util.List;

public class treeAllergies<T> {
    private String Question = "";
    private String answer = "";
    private int nodeID = -1;
    private int Y = -1;
    private int N = -1;
    private int Quit = -1;
    private int Other = -1;
    private int Varies = -1;
    private List<treeAllergies> children = new ArrayList<>();
    private treeAllergies parent = null;
       
    public treeAllergies(String answer) {
        this.answer = answer;
    }
    public void addChild(treeAllergies child) {
        child.setParent(this);
        this.children.add(child);
    }
    public void addChild(String Question) {
        treeAllergies<String> newChild = new treeAllergies<>(Question);
        newChild.setParent(this);
        children.add(newChild);
    }
    public void addChildren(List<treeAllergies> children) {
        for(treeAllergies t : children) {
        t.setParent(this);
        }
        this.children.addAll(children);
    }
    public List<treeAllergies> getChildren() {
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
    private void setParent(treeAllergies parent) {
        this.parent = parent;
    }
    public treeAllergies getParent() {
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
}