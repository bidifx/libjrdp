package de.coderarea.jrdp.protocol.T128;

import de.coderarea.jrdp.protocol.ASN1.ASN1Integer;
import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1ValueConstraint;

/**
 * Integer16. <br/>
 * <pre>
 * Integer16 ::= INTEGER(0..65535)
 * </pre>
 *
 * @author Sascha Biedermann
 */

@ASN1ValueConstraint(lb = 0, ub = 65535)
public class Integer16 extends ASN1Integer {
    public Integer16(long value) {
        super(value);
    }

}
