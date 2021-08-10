/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukab
 */
public class Timer {

    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    public String toString() {
        if (this.seconds >= 0 && this.seconds <= 9 && this.hundredths >= 0 && this.hundredths <= 9) {
            return "0" + this.hundredths + ":" + "0" + this.seconds;
        } else if (this.seconds >= 0 && this.seconds <= 9) {
            return this.hundredths + ":" + "0" + this.seconds;
        } else if (this.hundredths >= 0 && this.hundredths <= 9) {
            return "0" + this.hundredths + ":" + this.seconds;
        } else {
            return this.hundredths + ":" + this.seconds;
        }
    }

    public void advance() {
        this.seconds = this.seconds + 1;
        if (this.seconds >= 100) {
            this.seconds = 0;
            this.hundredths = this.hundredths + 1;
            if (this.hundredths >= 60) {
                this.hundredths = 0;
            }
        }
    }
}
