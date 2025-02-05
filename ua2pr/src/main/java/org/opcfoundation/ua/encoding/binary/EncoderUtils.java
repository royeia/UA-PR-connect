/* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/
package org.opcfoundation.ua.encoding.binary;

import org.opcfoundation.ua.encoding.EncodingException;
import org.opcfoundation.ua.encoding.IEncoder;

/**
 * <p>EncoderUtils class.</p>
 *
 *@deprecated use equivalent methods from the {@link IEncoder} object
 */
@Deprecated
public class EncoderUtils {
	/**
	 * <p>put.</p>
	 *
	 * @param encoder a {@link org.opcfoundation.ua.encoding.IEncoder} object.
	 * @param fieldName a {@link java.lang.String} object.
	 * @param o a {@link java.lang.Object} object.
	 * @throws org.opcfoundation.ua.encoding.EncodingException if any.
	 * @deprecated use {@link IEncoder#put(String, Object)} directly instead
	 */
	@Deprecated
	public static void put(IEncoder encoder, String fieldName, Object o) throws EncodingException {
		encoder.put(fieldName, o);
	}
	

	/**
	 * <p>put.</p>
	 *
	 * @param encoder a {@link org.opcfoundation.ua.encoding.IEncoder} object.
	 * @param fieldName a {@link java.lang.String} object.
	 * @param o a {@link java.lang.Object} object.
	 * @param clazz a {@link java.lang.Class} object.
	 * @throws org.opcfoundation.ua.encoding.EncodingException if any.
	 * @deprecated use {@link IEncoder#put(String, Object, Class)} directly instead
	 */
	@Deprecated
	public static void put(IEncoder encoder, String fieldName, Object o, Class<?> clazz) throws EncodingException {
		encoder.put(fieldName, o, clazz);
	}
	
}
