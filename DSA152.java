

public class DSA152 {
       static int n = 5;
        int topA = -1;
        int topB = n;
       void pushA(int []stk,int item){
        if(topA + 1 == topB){
            System.out.println("overflow");
        }
        else{
            stk[++topA] = item;
        }
        }
        void pushB(int []stk,int item){
            if(topA + 1 == topB){
                System.out.println("overflow");
            }
            else{
                stk[--topB] = item;
            }
            }
        void popA(int []stk){
            System.out.print("pop A: ");
            System.out.print(stk[topA--]);
        }
        void popB(int []stk){
            System.out.print("\npop B: ");
            System.out.print(stk[topB++]);
        }
        void displayStack1(int []stk){
            System.out.print("stack1: ");
            for(int i = 0;i<=topA;i++){
                System.out.print(stk[i]+ " ");
            }
        }
        void displayStack2(int []stk){
            System.out.print("\nstack2: ");
            for(int i = topB;i<=n-1;i++){
                System.out.print(stk[i]+ " ");
            }
            System.out.println();
        }


        public static void main(String[] args) {
            DSA152 stack = new DSA152();
            int stk[] = new int[n];
            stack.pushA(stk,1);
            stack.pushB(stk,5);
            stack.pushB(stk,4);
            stack.pushA(stk,2);
            stack.pushA(stk,3);
            stack.pushB(stk,8);

            stack.displayStack1(stk);
            stack.displayStack2(stk);

            stack.popA(stk);
            stack.popB(stk);

            //after popping 
            System.out.println("\nAfter popping: ");

            stack.displayStack1(stk);
            stack.displayStack2(stk);
        }
    
    
    
}
