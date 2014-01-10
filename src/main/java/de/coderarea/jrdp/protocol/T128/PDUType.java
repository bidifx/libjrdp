package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1Tag;

/**
 * PDUType. <br/>
 * <pre>
 * PDUType ::= INTEGER {
 *   confirmActivePDU(3), dataPDU(7), deactivateAllPDU(6), deactivateOtherPDU(4),
 *   deactivateSelfPDU(5), demandActivePDU(1), requestActivePDU(2)
 * }(0..15)
 * </pre>
 *
 * @author Sascha Biedermann
 */
public enum PDUType {
    @ASN1Tag(1)
    demandActivePDU,

    @ASN1Tag(2)
    requestActivePDU,

    @ASN1Tag(3)
    confirmActivePDU,

    @ASN1Tag(4)
    deactivateOtherPDU,

    @ASN1Tag(5)
    deactivateSelfPDU,

    @ASN1Tag(6)
    deactivateAllPDU,

    @ASN1Tag(7)
    dataPDU,


    @ASN1Tag(0)
    RESERVED_0,

    @ASN1Tag(8)
    RESERVED_8,

    @ASN1Tag(9)
    RESERVED_9,

    @ASN1Tag(10)
    RESERVED_10,

    @ASN1Tag(11)
    RESERVED_11,

    @ASN1Tag(12)
    RESERVED_12,

    @ASN1Tag(13)
    RESERVED_13,

    @ASN1Tag(14)
    RESERVED_14,

    @ASN1Tag(15)
    RESERVED_16


}
