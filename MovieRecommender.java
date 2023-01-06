public class MovieRecommender
{
public String Name;
public String phoneNum;
public String MovieCategory;
public String MovieTitle;

MovieRecommender(String Name, String phoneNum, String MovieCategory, String MovieTitle)
{
   this.Name = Name;
   this.phoneNum = phoneNum;
   this.MovieCategory = MovieCategory;
   this.MovieTitle = MovieTitle;
}

public void setName(String Name)
{
   Name = Name;
}
public void setPhoneNum(String phoneNum)
{
   phoneNum = phoneNum;
}
public void setMovieCategory(String MovieCategory)
{
   MovieCategory = MovieCategory;
}
public void setMovieTitle(String MovieTitle)
{
   MovieTitle = MovieTitle;
}

public String getName()
{
   return Name;
}
public String getPhoneNum()
{
   return phoneNum;
}
public String getMovieCategory()
{
   return MovieCategory;
}
public String getMovieTitle()
{
   return MovieTitle;
}

public String toString()
{
   return "\nName: " + Name + "\nPhone Number: " + phoneNum + "\nMovie Category: " + MovieCategory + "\nMovie Title: " + MovieTitle;
}
}