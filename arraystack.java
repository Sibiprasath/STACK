import java.util.Scanner;

class arraystack{
    int [] s = new int[9];
    int top;
   
    arraystack(){
        top = -1;
    }
    void push(int val){
        
        if (top == 9){
            System.out.print("Stack is full");    
        }
        else{
            s[++top] = val;   
        }
    }
    int pop(){
        if(top>=0){
            return s[top--];
            
        }
        return -1;
    }
    void peak(){
        System.out.println("Peak = "+s[top]);
    }
    void display(){
        for(int i =0;i<top+1;i++){
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        arraystack s1 = new arraystack();
        
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.push(70);
        s1.push(80);
        s1.push(90);
        
        s1.display();
        
        s1.pop();
        s1.pop();
        s1.display();
        System.out.println();

        s1.peak();
    }
}