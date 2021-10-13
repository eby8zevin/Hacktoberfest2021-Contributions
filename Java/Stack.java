package Hacktoberfest;
public class Stack {
    int size;
    int top;
    int data[];
    
    public Stack(int size){
        this.size = size;
        data = new int [size];
        top = -1;
    }
    public boolean IsEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean IsFull(){
        if(top == size -1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        }
        else{
            System.out.println("Full Stack");
        }
    }
    public void pop(){
        if(!IsEmpty()){
            int x = data[top];
            top--;
            System.out.println("Outgoing Data: " + x);
        }
        else{
            System.out.println("Stack is still empty");
        }
    }
    public void peek(){
        System.out.println("Top element: "+data[top]);
    }
    public void print(){
        System.out.println("Stack contents: ");
        for(int i = top;i>=0;i--){
            System.out.println(data[i]+" ");
        }
        System.out.println("");
    }
    public void clear(){
        if(!IsEmpty()){
            for(int i = top;i>=0;i--){
                top--;
            }
            System.out.println("Stack has been emptied");
        }
        else {
            System.out.println("Fail!!, Stack is still empty");
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(15);
        stk.push(27);
        stk.push(13);
        stk.print();
        stk.push(11);
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
    }
}

