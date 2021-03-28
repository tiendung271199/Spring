package edu.vinaenter.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class Football {
	// @Min(value = 1)
	// @Max(value = 10)
	private int id;
	
	@NotEmpty(message = "Tên đội bóng bắt buộc nhập")
	@Size(min = 5, max = 20)
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Ngày không được để trống")
	private Date createDate;
	
	private MultipartFile picture;
	
	private String description;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getPicture() {
		return picture;
	}

	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Football() {

	}

	public Football(int id, String name, Date createDate) {
		super();
		this.id = id;
		this.name = name;
		this.createDate = createDate;
	}
	
}
