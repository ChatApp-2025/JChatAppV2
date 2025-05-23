package pojos;



import java.util.Date;


public class Groups  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private boolean status;
     private Date createdDate;
     private Date createdTime;

    public Groups() {
    }

	
    public Groups(String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }
    public Groups(String name, String description, boolean status, Date createdDate, Date createdTime) {
       this.name = name;
       this.description = description;
       this.status = status;
       this.createdDate = createdDate;
       this.createdTime = createdTime;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Date getCreatedDate() {
        return this.createdDate;
    }
    
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public Date getCreatedTime() {
        return this.createdTime;
    }
    
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }




}


