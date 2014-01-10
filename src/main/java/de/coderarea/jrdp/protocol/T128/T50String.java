package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1OctetString;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1SizeConstraint;

/**
 * T50String. <br/>
 * <pre>
 * T50String ::= OCTET STRING(SIZE (0..255))
 * </pre>
 *
 * @author Sascha Biedermann
 */
@ASN1SizeConstraint(lb = 0, ub = 255)
public class T50String extends ASN1OctetString {
}
