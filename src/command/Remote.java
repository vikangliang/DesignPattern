package command;

public class Remote {
    Command on[];
    Command off[];

    Command undo;

    public Remote() {
        this.on = new Command[5];
        this.off = new Command[5];

        for (int i = 0; i < on.length; i++) {
            on[i] = new NoCommand();
            off[i] = new NoCommand();
        }
    }

    public void setCommand(int no, Command on, Command off) {
        this.on[no] = on;
        this.off[no] = off;
    }

    public void onPush(int no){
        this.on[no].execute();
        undo=this.on[no];
    }

    public void offPush(int no){
        this.off[no].execute();
        undo=this.off[no];
    }

    public void undoPush(){
        undo.undo();
    }
}
