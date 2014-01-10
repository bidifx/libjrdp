package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1Sequence;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1Tag;

/**
 * Demand Active PDU. <br/>
 * <pre>
 * DemandActivePDU ::= SEQUENCE {
 *   shareControlHeader ShareControlHeader, -- PDUType = demandActivePDU
 *   shareID ShareID,
 *   lengthSourceDescriptor Integer16(1..maxSourceDescriptor),
 *   -- length of sourceDescriptor in octets
 *   -- (including null terminator)
 *   lengthCombinedCapabilities Integer16,
 *   -- length of combinedCapabilities in octets
 *   sourceDescriptor T50String(SIZE (1..maxSourceDescriptor)),
 *   combinedCapabilities CombinedCapabilities
 * }
 * </pre>
 *
 * @autor Sascha Biedermann
 */
public class DemandActivePDU extends ASN1Sequence {

    @ASN1Tag(0)
    private ShareControlHeader shareControlHeader;

    @ASN1Tag(1)
    private Integer32 shareID;

    @ASN1Tag(2)
    private Integer16 lengthSourceDescriptor;

    @ASN1Tag(3)
    private Integer16 lengthCombinedCapabilities;

    @ASN1Tag(4)
    private T50String sourceDescriptor;

    @ASN1Tag(5)
    private CombinedCapabilities combinedCapabilities;

}
