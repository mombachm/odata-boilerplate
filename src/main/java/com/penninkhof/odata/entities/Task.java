package com.penninkhof.odata.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import com.penninkhof.odata.annotations.SAPLineItem;
import com.penninkhof.odata.annotations.Sap;

@Entity
@Table(name="tasks")
public class Task {

	@Id
	private int id;
	@Sap(filterable=true, sortable=true)
	@SAPLineItem
    private String title;
	@Sap(filterable=true, sortable=true)	
	@SAPLineItem
    private String description;
	@SAPLineItem
    private Date createdDate;
	@SAPLineItem
    private Date startDate;
	@SAPLineItem
    private Date endDate;
	@Sap(filterable=true, sortable=true)
	@SAPLineItem
    private char priority;
	@Sap(filterable=true, sortable=true)
	@SAPLineItem
    private char status;

    public Task() {
		this.createdDate = new Date();
		this.startDate = new Date();
		this.endDate = new Date();
	}

    public Task(int id, String title, String description) {
    	this.id = id;
        this.title = title;
        this.description = description;
		this.createdDate = new Date();
		this.startDate = new Date();
		this.endDate = new Date();		
    }

    @Override
    public String toString() {
        return String.format(
                "Task[id=%d, title='%s', description='%s']",
                id, title, description);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setStartDate(Date date) {
		this.startDate = date;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setEndDate(Date date) {
		this.endDate = date;
	}
	
	public Date getEndDate() {
		return this.endDate;
	}

	public void setPriority(char priority) {
		this.priority = priority;
	}

	public char getPriority() {
		return this.priority;
	}	

	public void setStatus(char status) {
		this.status = status;
	}

	public char getStatus() {
		return this.status;
	}	
}
