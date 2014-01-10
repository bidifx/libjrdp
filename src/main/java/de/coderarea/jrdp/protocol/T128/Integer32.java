package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1Integer;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1ValueConstraint;

/**
 * Integer32. <br/>
 * <pre>
 * Integer32 ::= INTEGER(0..4294967295)
 * </pre>
 *
 * @author Sascha Biedermann
 */
@ASN1ValueConstraint(lb = 0, ub = 4294967295L)
public class Integer32 extends ASN1Integer {
}
