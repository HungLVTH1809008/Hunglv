package Assignment6;

public class News implements INews {

   public int ID;
   public String Title;
   public String PublishDate;
   public String Author;
   public String Content;
   public float AverageRate;




    public String getTitle() {
        return Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public String getContent() {
        return Content;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setContent(String content) {
        Content = content;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public float getAverageRate() {
        return AverageRate;
    }
    public void Display(){
        System.out.println("Title"+Title);
        System.out.println("PublishDate"+PublishDate);
        System.out.println("Author"+Author);
        System.out.println("Content"+Content);
        System.out.println("AverageRate"+AverageRate);

    }


        int[] RateList = new int[3];



    public void  Calculate(){

        RateList[0]=1;
        RateList[1]=3;
        RateList[2]=8;

        AverageRate =  (RateList[0]+RateList[1]+RateList[2])/3;
        System.out.println("trung bình cộng của 3 số là:"+AverageRate);

    }
}
