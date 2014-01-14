package de.coderarea.jrdp.protocol.TS;

import de.coderarea.jrdp.protocol.BitInputStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Sascha Biedermann
 */
public class TsDecoder<T extends TsPacket> {

    private final static Logger logger = LogManager.getLogger(TsDecoder.class);


    private BitInputStream input;

    public TsDecoder(InputStream input) {
        this.input = new BitInputStream(input);
    }


    public T decode(Class<T> type) throws IOException {
        return (T) doDecode(type);
    }

    protected Object _decode(Class<?> type) throws IOException {
        return doDecode(type);
    }

    private Object doDecode(Class<?> type) throws IOException {
        return null;
    }
}
