package com.woniu.housemanager.pojo;

public class Tree {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.id
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.name
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.file
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    private String file;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tree.pid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.id
     *
     * @return the value of tree.id
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.id
     *
     * @param id the value for tree.id
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.name
     *
     * @return the value of tree.name
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.name
     *
     * @param name the value for tree.name
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.file
     *
     * @return the value of tree.file
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.file
     *
     * @param file the value for tree.file
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tree.pid
     *
     * @return the value of tree.pid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tree.pid
     *
     * @param pid the value for tree.pid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Tree(Integer id, String name, String file, Integer pid) {
        this.id = id;
        this.name = name;
        this.file = file;
        this.pid = pid;
    }
}