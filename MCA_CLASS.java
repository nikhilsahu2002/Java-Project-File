class nesting {
        int m,n;
        nesting(int x,int y){
            m=x;
            n=y;
        }
        int largest ()
            {
                if(m > n)
                    return m;
                else
                    return n;
            }

        void display()
        {
                int largest = largest();
                System.out.println(largest);
        }
}

class nesutinclass {
    public static void main(String[] args) {
        int a=5,b=8;
        nesting nest=new nesting(a,b);
        nest.display();
    }
  
}
