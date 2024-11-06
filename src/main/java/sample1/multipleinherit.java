package sample1;

interface Readable
{
    void read ();
}
interface Writable{
    void write();
}
interface Storageable{
    void store();
}

class File implements Readable,Writable,Storageable{
   public void read(){
       System.out.println("reading");
    }
    public void write(){
        System.out.println("writing");
    }
    public void store(){
        System.out.println("storing");
    }
}

public class multipleinherit {

    public static void main(String[] args){
        File c=new File();
        c.read();c.write();c.store();
    }
}
