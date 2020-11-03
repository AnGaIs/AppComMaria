package com.umservodemaria.appcommaria.entity.news;

 /**
 * Criado Por Um Servo De Maria by hsn on 08/09/2018.
 * Para Evangelização
 * Salve Maria
 */



        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class Comment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("enabled")
    @Expose
    private Boolean enabled;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

