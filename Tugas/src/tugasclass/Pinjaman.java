package tugasclass;

public class Pinjaman {
    private int cicilan;

    public void setCicilan(int cicilan) {
        this.cicilan = cicilan;
    }

    public double getBunga() {
        if (cicilan >= 0 && cicilan <= 11) {
            return 0.5;
        } else if (cicilan >= 12 && cicilan <= 23) {
            return 1.0;
        } else if (cicilan >= 24 && cicilan <= 35) {
            return 1.5;
        } else if (cicilan >= 36 && cicilan <= 47) {
            return 2.0;
        } else if (cicilan >= 48 && cicilan <= 60) {
            return 2.5;
        } else {
            return 0.0;
        }
    }
}
