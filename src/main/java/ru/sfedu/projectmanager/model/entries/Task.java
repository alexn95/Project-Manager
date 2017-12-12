package ru.sfedu.projectmanager.model.entries;


import com.opencsv.bean.CsvBindByPosition;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.io.Serializable;
import java.sql.Date;
import java.util.Random;

/**
 * Class Task
 */
public class Task implements WithId, Serializable {


    @Attribute
    @CsvBindByPosition(position = 0)
    private Long id;

    @CsvBindByPosition(position = 1)
    private String title;

    @CsvBindByPosition(position = 2)
    private String description;

    @CsvBindByPosition(position = 3)
    private Long projectId;

    @CsvBindByPosition(position = 4)
    private String state;

    @CsvBindByPosition(position = 5)
    private String type;

    @CsvBindByPosition(position = 6)
    private Date createDate;

    @CsvBindByPosition(position = 7)
    private Long userId;

    private Random random = new Random();
  
  //
  // Constructors
  //
      public Task () { }

      public Task(Long id, String title, String description, Long projectId, String state, String type, Date createDate, Long userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.projectId = projectId;
        this.state = state;
        this.type = type;
        this.createDate = createDate;
        this.userId = userId;
      }

      public Task(Long id, String title, String description, Long projectId, String state, String type, Date createDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.projectId = projectId;
        this.state = state;
        this.type = type;
        this.createDate = createDate;
      }

    public Task(String title, String description, Long projectId, String state, String type, Date createDate) {
        this.id = random.nextLong();
        this.title = title;
        this.description = description;
        this.projectId = projectId;
        this.state = state;
        this.type = type;
        this.createDate = createDate;
    }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
    public void setId (Long newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
    public Long getId () {
    return id;
  }

  /**
   * Set the value of title
   * @param newVar the new value of title
   */
    @Element
    public void setTitle (String newVar) {
    title = newVar;
  }

  /**
   * Get the value of title
   * @return the value of title
   */
    @Element
    public String getTitle () {
    return title;
  }

  /**
   * Set the value of description
   * @param newVar the new value of description
   */
    @Element
    public void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
    @Element
    public String getDescription () {
    return description;
  }

  /**
   * Set the value of projectId
   * @param newVar the new value of projectId
   */
    @Element
    public void setProjectId (Long newVar) {
    projectId = newVar;
  }

  /**
   * Get the value of projectId
   * @return the value of projectId
   */
    @Element
    public Long getProjectId () {
    return projectId;
  }

  /**
   * Set the value of state
   * @param newVar the new value of state
   */
    @Element
    public void setState(String newVar) {
    state = newVar;
  }

  /**
   * Get the value of state
   * @return the value of state
   */
    @Element
    public String getState() {
    return state;
  }

  /**
   * Set the value of type
   * @param newVar the new value of type
   */
    @Element
    public void setType(String newVar) {
    type = newVar;
  }

  /**
   * Get the value of type
   * @return the value of type
   */
    @Element
    public String getType() {
        return type;
    }

  /**
   * Set the value of createDate
   * @param newVar the new value of createDate
   */
    @Element
    public void setCreateDate (Date newVar) {
    createDate = newVar;
  }

  /**
   * Get the value of createDate
   * @return the value of createDate
   */
    @Element
    public Date getCreateDate () {
    return createDate;
  }

    @Element(required=false)
    public Long getUserId() {
    return userId;
  }

    @Element(required=false)
    public void setUserId(Long userId) {
    this.userId = userId;
  }

    @Override
    public String toString(){
        return "'" + title + "', '" + description + "', " + projectId + ", '" + state + "', '"
                + type + "', '" + createDate + "', " + userId;
    }
}
