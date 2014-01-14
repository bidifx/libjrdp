package de.coderarea.jrdp.protocol.TS.PDU.UD;

/**
* TsUserDataType. <br/>
*
* @author Sascha Bidermann
*/
public enum TsUserDataType {
    CS_CORE(0xC001),
    CS_SECURITY(0xC002),
    CS_NET(0xC003),
    CS_CLUSTER(0xC004),
    CS_MONITOR(0xC005),
    CS_MCS_MSGCHANNEL(0xC006),
    CS_MONITOR_EX(0xC008),
    CS_MULTITRANSPORT(0xC00A),
    SC_CORE(0x0C01),
    SC_SECURITY(0x0C02),
    SC_NET(0x0C03),
    SC_MCS_MSGCHANNEL(0x0C04),
    SC_MULTITRANSPORT(0x0C08);

    private int value;

    TsUserDataType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
