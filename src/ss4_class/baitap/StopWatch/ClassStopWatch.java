package ss4_class.baitap.StopWatch;

public class ClassStopWatch {
    private long startTime, stopTime;

    public ClassStopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public ClassStopWatch(long startTime, long stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    public void star() {
        setStartTime(System.currentTimeMillis());
    }

    public void stop() {
        setStopTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return getStopTime() - getStartTime();
    }
}
