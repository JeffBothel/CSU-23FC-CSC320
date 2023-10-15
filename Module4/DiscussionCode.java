public class DiscussionCode {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10)
        {
            System.out.println("Hello #" + i);
            i++;
        }

        while(true){
            if(UserInput == "quit"){
                break;
            }
            else{
                System.out.println("Hello #" + i);
                i++;
            }
        }

        for(int ii; ii <= 10; ii++){
            System.out.println("Hello #" + ii);
        }
    }   
}