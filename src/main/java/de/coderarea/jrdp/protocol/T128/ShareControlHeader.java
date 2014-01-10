package de.coderarea.jrdp.protocol.T128;

/**
 * Share Control Header. <br/>
 * <pre>
 * ShareControlHeader ::= SEQUENCE {
 *     totalLength Integer16(0..32767),
 *     protocolVersion Integer4(1),
 *     pduType PDUType,
 *     pad1octet Integer8(0),
 *     pduSource UserID
 * }
 * </pre>
 *
 * @author Sascha Biedermann
 */
public class ShareControlHeader {

    private TotalLength totalLength;
    private static int protocolVersion = 1; //not encoded, static value
    private PDUType pduType;
    private static int pad1octet = 0; // not encoded, static
    private Integer16 pduSource;
}
