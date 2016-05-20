package ro.pub.cs.systems.eim.practicaltest02.model;

/**
 * Created by root on 20.05.2016.
 */
public class AlarmModel {
    int hour;
    int minutes;
    String time;
    String status;

    public AlarmModel(int hour, int minutes, String time, String status) {
        this.hour = hour;
        this.minutes = minutes;
        this.time = time;
        this.status = status;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
