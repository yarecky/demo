package com.test.demo.dto;

public class UserDTO {

    private Integer id;

    private String name;

    private String hashedPassword;

    public UserDTO() {}

    public UserDTO(String name, String hashedPassword) {
        this.name = name;
        this.hashedPassword = hashedPassword;
	}

	/**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hashedPassword
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * @param hashedPassword the hashedPassword to set
     */
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
    
}
