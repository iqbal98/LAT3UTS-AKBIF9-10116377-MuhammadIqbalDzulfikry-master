package pindah.dicoding.biodata;

/*29-April-2019
    10116377
        Muhammad Iqbal Dzulfikry
            AKB-9*/

public class gallery {
    private String Title;
    private int Thumbnail ;

    public gallery(String title,int thumbnail) {
        Title = title;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

