package domain;

public class play {
    private int play_id;
    private String play_name;
    private String play_introduction;
    private String play_image;
    private String play_length;
    private float play_ticket_price;
    private int play_status;

    @Override
    public String toString() {
        return "play{" +
                "play_id=" + play_id +
                ", play_name='" + play_name + '\'' +
                ", play_introduction='" + play_introduction + '\'' +
                ", play_image='" + play_image + '\'' +
                ", play_length='" + play_length + '\'' +
                ", play_ticket_price=" + play_ticket_price +
                ", play_status=" + play_status +
                ", lang='" + lang + '\'' +
                ", type='" + type + '\'' +
                ", play_showtime='" + play_showtime + '\'' +
                '}';
    }

    private String lang;
    private String type;
    private String play_showtime;

    public int getPlay_id() {
        return play_id;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public String getPlay_name() {
        return play_name;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name;
    }

    public String getPlay_introduction() {
        return play_introduction;
    }

    public void setPlay_introduction(String play_introduction) {
        this.play_introduction = play_introduction;
    }

    public String getPlay_image() {
        return play_image;
    }

    public void setPlay_image(String play_image) {
        this.play_image = play_image;
    }

    public String getPlay_length() {
        return play_length;
    }

    public void setPlay_length(String play_length) {
        this.play_length = play_length;
    }

    public float getPlay_ticket_price() {
        return play_ticket_price;
    }

    public void setPlay_ticket_price(float play_ticket_price) {
        this.play_ticket_price = play_ticket_price;
    }

    public int getPlay_status() {
        return play_status;
    }

    public void setPlay_status(int play_status) {
        this.play_status = play_status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlay_showtime() {
        return play_showtime;
    }

    public void setPlay_showtime(String play_showtime) {
        this.play_showtime = play_showtime;
    }
}
