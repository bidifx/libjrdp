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
package de.coderarea.jrdp.protocol.MCS;

import de.coderarea.jrdp.protocol.ASN1.annotation.ASN1Tag;

/**
 * DataPriority ::= ENUMERATED
 * {
 * top
 * high
 * medium
 * low
 * }
 *
 * @author Sascha Biedermann
 */
public enum DataPriority {

    @ASN1Tag(0)
    top,

    @ASN1Tag(1)
    high,

    @ASN1Tag(2)
    medium,

    @ASN1Tag(3)
    low
}
