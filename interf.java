interface instrument{
    void playable( ); //defaultly it is abstarct method
}

class guitar implements instrument{
    public void playable(){
        System.out.println("guitar");
    }
}

class piano implements instrument{
    public void playable(){
        System.out.println("piano");
    }
}
public class interf {

    public static void main(String[] args) {
        
        guitar g = new guitar();
        piano p = new piano();
        g.playable();
        p.playable();
    }
    
}
