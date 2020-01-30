package TV;

public class Button {
    protected RemoteControl rc;

    public Button(){}
    public Button(RemoteControl rc){
        this.rc = rc;
    }

    public void setRemoteControl(RemoteControl rc){
        this.rc = rc;
    }

    protected void doPress(){}

    public void press(){
        if (rc.getTv().isWorking()){
            doPress();
        }

    }
}
