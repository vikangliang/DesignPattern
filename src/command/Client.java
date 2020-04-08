package command;

public class Client {
    public static void main(String args[]){
        LightReceiver lightReceiver=new LightReceiver();

        LightOnCommand on=new LightOnCommand(lightReceiver);
        LightOffCommand off=new LightOffCommand(lightReceiver);

        Remote remote=new Remote();
        remote.setCommand(0,on,off);

        remote.onPush(0);
        remote.offPush(0);
        remote.undoPush();
    }
}
