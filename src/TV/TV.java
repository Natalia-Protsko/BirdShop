package TV;

public class TV {
    private final int MAXCHANNELS = 100;
    private final int MAXVOLUME = 20;
    private int channel;
    private int volume;

    private boolean isWorking;

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public TV(){
        channel=0;
        volume = 5;
    }



    public int getChannel() {
        return channel;

    }

    public void on(){
        isWorking = true;
        System.out.println("TV is ON");
    }

    public void off(){
        isWorking = false;
        System.out.println("TV is OFF");
    }

    public int  setChannel(final int channel) {
        if (channel >=0 && channel<=MAXCHANNELS){
            this.channel = channel;
        }
        System.out.println("Channel is "+this.channel);
        return this.channel;
    }

    public int  setVolume(final int volume) {
        if (volume >=0 && volume<=MAXVOLUME){
            this.volume = volume;
        }
        System.out.println("Volume is "+this.volume);
        return this.volume;
    }


    public int getVolume() {
        return volume;
    }
}
