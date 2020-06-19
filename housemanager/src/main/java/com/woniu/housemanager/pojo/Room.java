package com.woniu.housemanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room implements Serializable {
    private Integer roomid;
    private Integer layerid;
    private Integer hsid;
    private  String hsname;
    private Long roomarea;
    private String roomcode;
    private Integer countlayer;
    private Integer countRoom;
    private String colour;
    private Integer currentlayer;

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomid
     *
     * @param roomid the value for room.roomid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.layerid
     *
     * @return the value of room.layerid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Integer getLayerid() {
        return layerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.layerid
     *
     * @param layerid the value for room.layerid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setLayerid(Integer layerid) {
        this.layerid = layerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.hsid
     *
     * @return the value of room.hsid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Integer getHsid() {
        return hsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.hsid
     *
     * @param hsid the value for room.hsid
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setHsid(Integer hsid) {
        this.hsid = hsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomarea
     *
     * @return the value of room.roomarea
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public Long getRoomarea() {
        return roomarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomarea
     *
     * @param roomarea the value for room.roomarea
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setRoomarea(Long roomarea) {
        this.roomarea = roomarea;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.roomcode
     *
     * @return the value of room.roomcode
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public String getRoomcode() {
        return roomcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.roomcode
     *
     * @param roomcode the value for room.roomcode
     *
     * @mbggenerated Sun Jun 07 17:07:39 CST 2020
     */
    public void setRoomcode(String roomcode) {
        this.roomcode = roomcode;
    }
}