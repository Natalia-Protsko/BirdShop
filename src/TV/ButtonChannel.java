package TV;

public class ButtonChannel extends Button {

    private int sign ;

    public ButtonChannel(RemoteControl rc, int sign){
        super(rc);
        this.sign = sign;
    }
    protected void doPress(){
        rc.getTv().setChannel(rc.getTv().getChannel()+sign);
    }
}
