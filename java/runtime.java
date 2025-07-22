public class runtime {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.print("Argument " + (i+1) + ": " + args[i]);
        }
        System.exit(0);
    }
    
}
