package domain;

public class schedule {
    private int id;
    private int studio_id;
    private int play_id;
    private String sched_time;
    private String lang_version;
    private String sche_date;

    public domain.play getPlay() {
        return play;
    }

    public void setPlay(domain.play play) {
        this.play = play;
    }

    public domain.studio getStudio() {
        return studio;
    }

    public void setStudio(domain.studio studio) {
        this.studio = studio;
    }

    private play play;
    private studio studio;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudio_id() {
        return studio_id;
    }

    public void setStudio_id(int studio_id) {
        this.studio_id = studio_id;
    }

    public int getPlay_id() {
        return play_id;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public String getSched_time() {
        return sched_time;
    }

    public void setSched_time(String sched_time) {
        this.sched_time = sched_time;
    }

    public String getLang_version() {
        return lang_version;
    }

    public void setLang_version(String lang_version) {
        this.lang_version = lang_version;
    }

    public String getSche_date() {
        return sche_date;
    }

    public void setSche_date(String sche_date) {
        this.sche_date = sche_date;
    }
}
