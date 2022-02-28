public class Book
{
    /* at the very beginning we need to create instance variables **/

    public String authorName;
    
    public String bookName;
    
    public int bookId;
    
    public String bookDescription;
    
    
    

    /* once we have it we have to create a constructor that allows a user to input instance variables **/
    
    public Book(int bookId,String bookName,String authorName,String bookDescription)
    {   this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookDescription=bookDescription;
        
    }
    
    /* then we have to create an accessor method for each of the instance variables created above to retun whatever 
     * has been inputted by the user
     */
      
    public int getId()
    {
        return bookId;
    }
    
     public String getBookName()
    {
        return bookName;
    }
    public String getAuthor()
    {
        return authorName;
    }
    public String getDescription()
    {
        return bookDescription;
    } 
    
    

    /* now we create a mutator method for each of the instance variables created above that allows a user to change
     * the state of the object.
     */

    public void setId(int bookId)
    {
        this.bookId=bookId;
    }
    
     public void setAuthor(String authorName)
    {
       this.authorName=authorName;
    }
    
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    } 
    public void setDescription(String bookDescription)
    {
        this.bookDescription=bookDescription;
    }    
    
    
    /* the last part here is to create a toString method that returns all of the details of the book that has been inputted. 
    
    public String toString()
    {
        return "The details of the book are: " + title + ", " + author + ", " + year + ", " + publisher + ", " + cost;
    }
    
    */
    
}