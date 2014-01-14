/**
 * This file is part of libjrdp.
 *
 * libjrdp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * libjrdp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with libjrdp. If not, see <http://www.gnu.org/licenses/>.
 */
package de.coderarea.jrdp.protocol.TS.PDU.UD;

import de.coderarea.jrdp.protocol.TS.TsHeader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * User Data Header (TS_UD_HEADER). <br/>
 * The TS_UD_HEADER precedes all data blocks in the client and server GCC user data.
 *
 * @author Sascha Biedermann
 */
public class TsUserDataHeader extends TsHeader {
    private final static Logger logger = LogManager.getLogger(TsUserDataHeader.class);

    private TsUserDataType type;
    private int length;


    public TsUserDataHeader(TsUserDataType type, int length) {
        this.type = type;
        this.length = length;
    }

   /* protected void decode() throws IOException {

        int t = readShort();
        for (TsUserDataType item : TsUserDataType.values()) {
            if (item.getValue() == t) {
                type = item;
                break;
            }
        }

        length = readShort();
        logger.trace("type: {}, length: {}", type, length);
    }

    @Override
    protected void encode(OutputStream output) throws IOException {
        writeShort(output, getType().getValue());
        writeShort(output, getLength());
    }*/

    public TsUserDataType getType() {
        return type;
    }

    public int getLength() {
        return length;
    }
}
