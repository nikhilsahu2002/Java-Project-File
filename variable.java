public class variable {
    public static void main(String[] args){
        //there is three type of variable in java
        /*
            *Local Variable (Non Static)
            *Instance Variable  (Non Static)
            *Static Variable    
         */ 
        student s1=new student();
        student s2 = new student();

        System.out.println(s1.getId());
        System.out.println(s2.getId());
        //due to static variable it will increse by 2 at last method 
    }


}
