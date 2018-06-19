package domain;

public class scheduleOut {
    private String id;
    private String studio_name;
    private String play_name;
    private String sched_time;
    private String lang_version;
    private String sche_date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudio_name() {
        return studio_name;
    }

    public void setStudio_name(String studio_name) {
        this.studio_name = studio_name;
    }

    public String getPlay_name() {
        return play_name;
    }

    public void setPlay_name(String play_name) {
        this.play_name = play_name;
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
