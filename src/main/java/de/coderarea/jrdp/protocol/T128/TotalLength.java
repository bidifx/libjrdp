package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1Integer;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1ValueConstraint;

/**
 * Total Length. <br/>
 * <pre>
 * totalLength Integer16(0..32767)
 * </pre>
 *
 * @author Sascha Biedermann
 */
@ASN1ValueConstraint(lb = 0, ub = 32767)
public class TotalLength extends ASN1Integer {
}
