package com.pixled.pixledserver.core.state.device;

import com.pixled.pixledserver.core.color.Color;
import com.pixled.pixledserver.core.state.base.State;

import javax.persistence.*;

@Entity
public class DeviceState extends State {

    @Column(nullable = false)
    private boolean connected;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    private Color color;

    public DeviceState() {
        super();
        connected = false;
        color = new Color(0F, 0F, 1F, -1);
    }

    public DeviceState(DeviceStateDto deviceStateDto) {
        super(deviceStateDto);
        connected = deviceStateDto.isConnected();
        color = new Color(deviceStateDto.getColor());
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
