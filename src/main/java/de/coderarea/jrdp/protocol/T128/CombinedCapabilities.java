package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1Sequence;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1Tag;

/**
 * Combined Capabilities. <br/>
 * <pre>
 * CombinedCapabilities ::= SEQUENCE {
 *   numberCapabilities Integer16,
 *   -- number of capabilities in combinedCapabilities set
 *    pad2octets Integer16(0),
 *   combinedCapabilities SET {
 *     generalCapabilitySet GeneralCapabilitySet,
 *     bitmapCapabilitySet BitmapCapabilitySet,
 *     orderCapabilitySet OrderCapabilitySet,
 *     bitmapCacheCapabilitySet BitmapCacheCapabilitySet,
 *     colorCacheCapabilitySet ColorCacheCapabilitySet,
 *     activationCapabilitySet ActivationCapabilitySet,
 *     controlCapabilitySet ControlCapabilitySet,
 *     pointerCapabilitySet PointerCapabilitySet,
 *     shareCapabilitySet ShareCapabilitySet,
 *     nonStandardCapabilitySet NonStandardCapabilitySet OPTIONAL
 *     }
 * }
 *
 * </pre>
 *
 * @author Sascha Biedermann
 */
public class CombinedCapabilities extends ASN1Sequence {

    @ASN1Tag(0)
    private Integer16 numberCapabilities;

    private static Integer16 pad2octets = new Integer16(0); // static, not encoded?

    @ASN1Tag(2)
    private CombinedCapabilitiesSet combinedCapabilities;
}
