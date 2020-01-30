package TV;

public class RemoteControl {

    private TV tv;
    ButtonNum [] nums;
    ButtonVolume volumeInc;
    ButtonVolume volumeDec;
    ButtonChannel channelInc ;
    ButtonChannel channelDec;
    
    public RemoteControl(){
        nums =new ButtonNum[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = new ButtonNum(this, i);            
        }
        volumeInc = new ButtonVolume(this, 1);
        volumeDec = new ButtonVolume(this, -1);
        channelInc = new ButtonChannel(this, 1);
        channelDec = new ButtonChannel(this, -1);
    }


    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;

    }


    public void incVolume(){
        volumeInc.press();
      
    }

    public void decVolume(){
        volumeDec.press();
    }

    public void setChannel(int channel){
        nums[channel].press();
       
    }

    public void incChannel(){
channelInc.press(); 
    }

    public void decChannel(){
        channelDec.press();    
    }
    
    public void press0(){nums[0].press();}
    public void press1(){nums[1].press();}
    public void press2(){nums[2].press();}
    public void press3(){nums[3].press();}
    public void press4(){nums[4].press();}
    public void press5(){nums[5].press();}
    public void press6(){nums[6].press();}
    public void press7(){nums[7].press();}
    public void press8(){nums[8].press();}
    public void press9(){nums[9].press();}
    
    public void pressBtnF1(){
        tv.on();
        tv.setChannel(12);
        tv.setVolume(3);
        //wait 30 min
        tv.off();
    }
    
    

    public void pressRedButton() {
        if (tv.isWorking())
        {
            tv.off();
        }
        else {
            tv.on();
        }

    }
}
