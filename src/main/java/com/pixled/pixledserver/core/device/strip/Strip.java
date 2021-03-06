package com.pixled.pixledserver.core.device.strip;

import com.pixled.pixledserver.core.device.base.Device;
import com.pixled.pixledserver.core.device.base.DeviceDto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Strip extends Device {

    @Column
    private Integer length;

    public Strip(){
        super();
    }

    public Strip(String name, Integer length) {
        super(name);
        this.length = length;
    }

    public Strip(StripDto stripDto) {
        super(stripDto);
        length = stripDto.getLength();
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public StripDto generateDto() {
        return new StripDto(this);
    }
}
